package com.fizzware.dramaticdoors.blockentities;

import java.util.concurrent.atomic.AtomicReference;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.compat.Compats;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;

public class TallNetheriteDoorBlockEntity extends BlockEntity
{
	
	public String password = null;
	
	public TallNetheriteDoorBlockEntity(BlockPos pos, BlockState state) {
		super(DDBlockEntities.TALL_NETHERITE_DOOR.get(), pos, state);
	}

	@Override
	public void saveAdditional(CompoundTag tag) {
		super.saveAdditional(tag);
        if (this.password != null) {
            tag.putString("Password", this.password);
        }
	}
	
	@Override
	public void load(CompoundTag tag) {
		super.load(tag);
        if (tag.contains("Password")) {
            this.password = tag.getString("Password");
        }
	}
	
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(ItemStack stack) {
        this.setPassword(stack.getHoverName().getString());
    }
    
    @Nullable
    public String getPassword() {
        return this.password;
    }

    public void clearOwner() {
        this.password = null;
    }

    public static boolean isCorrectKey(ItemStack key, String password) {
        return key.getHoverName().getString().equals(password);
    }

    public boolean isCorrectKey(ItemStack key) {
        return isCorrectKey(key, this.password);
    }

    public enum KeyStatus {
        CORRECT_KEY,
        INCORRECT_KEY,
        NO_KEY
    }

    public static KeyStatus hasKeyInInventory(Player player, String key) {
        if (key == null) return KeyStatus.CORRECT_KEY;
        KeyStatus found = KeyStatus.INCORRECT_KEY;
        //TODO: Figure out how to implement Curios compat.
        if (Compats.CURIOS_INSTALLED) {
            //found = SupplementariesCuriosPlugin.isKeyInCurio(player, key);
            //if (found == KeyStatus.CORRECT_KEY) return found;
        }

        AtomicReference<IItemHandler> itemHandler = new AtomicReference<>();
        player.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(itemHandler::set);
        if (itemHandler.get() != null) {
            for (int _idx = 0; _idx < itemHandler.get().getSlots(); _idx++) {
                ItemStack stack = itemHandler.get().getStackInSlot(_idx);
                if (stack.is(DDTags.KEY)) {
                    found = KeyStatus.INCORRECT_KEY;
                    if (isCorrectKey(stack, key)) return KeyStatus.CORRECT_KEY;
                }
            }
        }
        return found;
    }

    public static boolean doesPlayerHaveKeyToOpen(Player player, String lockPassword, boolean feedbackMessage, @Nullable String translName) {
        KeyStatus key = hasKeyInInventory(player, lockPassword);
        if (key == KeyStatus.INCORRECT_KEY) {
            if (feedbackMessage) {
                player.displayClientMessage(Component.translatable("message.supplementaries.safe.incorrect_key"), true);
            }
            return false;
        } 
        else if (key == KeyStatus.CORRECT_KEY) {
        	return true;
        }
        if (feedbackMessage) {
            player.displayClientMessage(Component.translatable("message.supplementaries." + translName + ".locked"), true);
        }
        return false;
    }


    //returns true if door has to open
    public boolean handleAction(Player player, InteractionHand handIn, String translName) {
        if (player.isSpectator()) return false;

        ItemStack stack = player.getItemInHand(handIn);

        boolean isKey = stack.is(DDTags.KEY);
        //clear ownership
        if (player.isCrouching() && isKey && (player.isCreative() || this.isCorrectKey(stack))) {
        	this.clearOwner();
            player.displayClientMessage(Component.translatable("message.supplementaries.safe.cleared"), true);
            this.level.playSound(null, worldPosition.getX() + 0.5, worldPosition.getY() + 0.5, worldPosition.getZ() + 0.5, SoundEvents.IRON_TRAPDOOR_OPEN, SoundSource.BLOCKS, 0.5F, 1.5F);
            return false;
        }
        //set key
        else if (this.password == null) {
            if (isKey) {
            	this.setPassword(stack);
                player.displayClientMessage(Component.translatable("message.supplementaries.safe.assigned_key", this.password), true);
                this.level.playSound(null, worldPosition.getX() + 0.5, worldPosition.getY() + 0.5, worldPosition.getZ() + 0.5, SoundEvents.IRON_TRAPDOOR_OPEN, SoundSource.BLOCKS, 0.5F, 1.5F);
                return false;
            }
            return true;
        }
        //open
        else return player.isCreative() || doesPlayerHaveKeyToOpen(player, this.password, true, translName);
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
