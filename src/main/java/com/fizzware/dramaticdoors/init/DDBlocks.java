package com.fizzware.dramaticdoors.init;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.ShortCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DramaticDoors.MOD_ID);
	
	// Vanilla
    public static final RegistryObject<Block> SHORT_IRON_DOOR = BLOCKS.register(DDNames.SHORT_IRON, () -> new ShortDoorBlock(Blocks.IRON_DOOR));
    public static final RegistryObject<Block> SHORT_OAK_DOOR = BLOCKS.register(DDNames.SHORT_OAK, () -> new ShortDoorBlock(Blocks.OAK_DOOR));
    public static final RegistryObject<Block> SHORT_SPRUCE_DOOR = BLOCKS.register(DDNames.SHORT_SPRUCE, () -> new ShortDoorBlock(Blocks.SPRUCE_DOOR));
    public static final RegistryObject<Block> SHORT_BIRCH_DOOR = BLOCKS.register(DDNames.SHORT_BIRCH, () -> new ShortDoorBlock(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> SHORT_JUNGLE_DOOR = BLOCKS.register(DDNames.SHORT_JUNGLE, () -> new ShortDoorBlock(Blocks.JUNGLE_DOOR));
    public static final RegistryObject<Block> SHORT_ACACIA_DOOR = BLOCKS.register(DDNames.SHORT_ACACIA, () -> new ShortDoorBlock(Blocks.ACACIA_DOOR));
    public static final RegistryObject<Block> SHORT_DARK_OAK_DOOR = BLOCKS.register(DDNames.SHORT_DARK_OAK, () -> new ShortDoorBlock(Blocks.DARK_OAK_DOOR));
    public static final RegistryObject<Block> SHORT_MANGROVE_DOOR = BLOCKS.register(DDNames.SHORT_MANGROVE, () -> new ShortDoorBlock(Blocks.MANGROVE_DOOR));
    public static final RegistryObject<Block> SHORT_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("quark", "bamboo_door")))); //With Quark.
    public static final RegistryObject<Block> SHORT_CRIMSON_DOOR = BLOCKS.register(DDNames.SHORT_CRIMSON, () -> new ShortDoorBlock(Blocks.CRIMSON_DOOR));
    public static final RegistryObject<Block> SHORT_WARPED_DOOR = BLOCKS.register(DDNames.SHORT_WARPED, () -> new ShortDoorBlock(Blocks.WARPED_DOOR));
	
    public static final RegistryObject<Block> TALL_IRON_DOOR = BLOCKS.register(DDNames.TALL_IRON, () -> new TallDoorBlock(Blocks.IRON_DOOR));
    public static final RegistryObject<Block> TALL_OAK_DOOR = BLOCKS.register(DDNames.TALL_OAK, () -> new TallDoorBlock(Blocks.OAK_DOOR));
    public static final RegistryObject<Block> TALL_SPRUCE_DOOR = BLOCKS.register(DDNames.TALL_SPRUCE, () -> new TallDoorBlock(Blocks.SPRUCE_DOOR));
    public static final RegistryObject<Block> TALL_BIRCH_DOOR = BLOCKS.register(DDNames.TALL_BIRCH, () -> new TallDoorBlock(Blocks.BIRCH_DOOR));
    public static final RegistryObject<Block> TALL_JUNGLE_DOOR = BLOCKS.register(DDNames.TALL_JUNGLE, () -> new TallDoorBlock(Blocks.JUNGLE_DOOR));
    public static final RegistryObject<Block> TALL_ACACIA_DOOR = BLOCKS.register(DDNames.TALL_ACACIA, () -> new TallDoorBlock(Blocks.ACACIA_DOOR));
    public static final RegistryObject<Block> TALL_DARK_OAK_DOOR = BLOCKS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorBlock(Blocks.DARK_OAK_DOOR));
    public static final RegistryObject<Block> TALL_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_MANGROVE, () -> new TallDoorBlock(Blocks.MANGROVE_DOOR));
    public static final RegistryObject<Block> TALL_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "bamboo_door")))); //With Quark.
    public static final RegistryObject<Block> TALL_CRIMSON_DOOR = BLOCKS.register(DDNames.TALL_CRIMSON, () -> new TallDoorBlock(Blocks.CRIMSON_DOOR));
    public static final RegistryObject<Block> TALL_WARPED_DOOR = BLOCKS.register(DDNames.TALL_WARPED, () -> new TallDoorBlock(Blocks.WARPED_DOOR));
    
    //Biomes O' Plenty
    public static final RegistryObject<Block> SHORT_BOP_CHERRY_DOOR = BLOCKS.register(DDNames.SHORT_BOP_CHERRY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door"))));
    public static final RegistryObject<Block> SHORT_BOP_DEAD_DOOR = BLOCKS.register(DDNames.SHORT_BOP_DEAD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door"))));
    public static final RegistryObject<Block> SHORT_BOP_FIR_DOOR = BLOCKS.register(DDNames.SHORT_BOP_FIR, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door"))));
    public static final RegistryObject<Block> SHORT_BOP_HELLBARK_DOOR = BLOCKS.register(DDNames.SHORT_BOP_HELLBARK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door"))));
    public static final RegistryObject<Block> SHORT_BOP_JACARANDA_DOOR = BLOCKS.register(DDNames.SHORT_BOP_JACARANDA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door"))));
    public static final RegistryObject<Block> SHORT_BOP_MAGIC_DOOR = BLOCKS.register(DDNames.SHORT_BOP_MAGIC, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door"))));
    public static final RegistryObject<Block> SHORT_BOP_MAHOGANY_DOOR = BLOCKS.register(DDNames.SHORT_BOP_MAHOGANY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door"))));
    public static final RegistryObject<Block> SHORT_BOP_PALM_DOOR = BLOCKS.register(DDNames.SHORT_BOP_PALM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door"))));
    public static final RegistryObject<Block> SHORT_BOP_REDWOOD_DOOR = BLOCKS.register(DDNames.SHORT_BOP_REDWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door"))));
    public static final RegistryObject<Block> SHORT_BOP_UMBRAN_DOOR = BLOCKS.register(DDNames.SHORT_BOP_UMBRAN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door"))));
    public static final RegistryObject<Block> SHORT_BOP_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_BOP_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door"))));
    
    public static final RegistryObject<Block> TALL_BOP_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BOP_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door"))));
    public static final RegistryObject<Block> TALL_BOP_DEAD_DOOR = BLOCKS.register(DDNames.TALL_BOP_DEAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door"))));
    public static final RegistryObject<Block> TALL_BOP_FIR_DOOR = BLOCKS.register(DDNames.TALL_BOP_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door"))));
    public static final RegistryObject<Block> TALL_BOP_HELLBARK_DOOR = BLOCKS.register(DDNames.TALL_BOP_HELLBARK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door"))));
    public static final RegistryObject<Block> TALL_BOP_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_BOP_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door"))));
    public static final RegistryObject<Block> TALL_BOP_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door"))));
    public static final RegistryObject<Block> TALL_BOP_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door"))));
    public static final RegistryObject<Block> TALL_BOP_PALM_DOOR = BLOCKS.register(DDNames.TALL_BOP_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door"))));
    public static final RegistryObject<Block> TALL_BOP_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_BOP_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door"))));
    public static final RegistryObject<Block> TALL_BOP_UMBRAN_DOOR = BLOCKS.register(DDNames.TALL_BOP_UMBRAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door"))));
    public static final RegistryObject<Block> TALL_BOP_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BOP_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door"))));
    
    //Prehistoric Fauna
    public static final RegistryObject<Block> SHORT_AGATHOXYLON_DOOR = BLOCKS.register(DDNames.SHORT_AGATHOXYLON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "agathoxylon_door"))));
    public static final RegistryObject<Block> SHORT_ARAUCARIA_DOOR = BLOCKS.register(DDNames.SHORT_ARAUCARIA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door"))));
    public static final RegistryObject<Block> SHORT_BRACHYPHYLLUM_DOOR = BLOCKS.register(DDNames.SHORT_BRACHYPHYLLUM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "brachphyllum_door"))));
    public static final RegistryObject<Block> SHORT_GINKGO_DOOR = BLOCKS.register(DDNames.SHORT_GINKGO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "ginkgo_door"))));
    public static final RegistryObject<Block> SHORT_HEIDIPHYLLUM_DOOR = BLOCKS.register(DDNames.SHORT_HEIDIPHYLLUM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door"))));
    public static final RegistryObject<Block> SHORT_LIRIODENDRITES_DOOR = BLOCKS.register(DDNames.SHORT_LIRIODENDRITES, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door"))));
    public static final RegistryObject<Block> SHORT_METASEQUOIA_DOOR = BLOCKS.register(DDNames.SHORT_METASEQUOIA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door"))));
    public static final RegistryObject<Block> SHORT_NEOCALAMITES_DOOR = BLOCKS.register(DDNames.SHORT_NEOCALAMITES, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "neocalamites_door"))));
    public static final RegistryObject<Block> SHORT_PROTOJUNIPEROXYLON_DOOR = BLOCKS.register(DDNames.SHORT_PROTOJUNIPEROXYLON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"))));
    public static final RegistryObject<Block> SHORT_PROTOPICEOXYLON_DOOR = BLOCKS.register(DDNames.SHORT_PROTOPICEOXYLON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"))));
    public static final RegistryObject<Block> SHORT_SCHILDERIA_DOOR = BLOCKS.register(DDNames.SHORT_SCHILDERIA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "schilderia_door"))));
    public static final RegistryObject<Block> SHORT_TROCHODENDROIDES_DOOR = BLOCKS.register(DDNames.SHORT_TROCHODENDROIDES, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "trochodendroides_door"))));
    public static final RegistryObject<Block> SHORT_WOODWORTHIA_DOOR = BLOCKS.register(DDNames.SHORT_WOODWORTHIA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "woodworthia_door"))));
    public static final RegistryObject<Block> SHORT_ZAMITES_DOOR = BLOCKS.register(DDNames.SHORT_ZAMITES, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door"))));
    
    public static final RegistryObject<Block> TALL_AGATHOXYLON_DOOR = BLOCKS.register(DDNames.TALL_AGATHOXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "agathoxylon_door"))));
    public static final RegistryObject<Block> TALL_ARAUCARIA_DOOR = BLOCKS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door"))));
    public static final RegistryObject<Block> TALL_BRACHYPHYLLUM_DOOR = BLOCKS.register(DDNames.TALL_BRACHYPHYLLUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "brachphyllum_door"))));
    public static final RegistryObject<Block> TALL_GINKGO_DOOR = BLOCKS.register(DDNames.TALL_GINKGO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "ginkgo_door"))));
    public static final RegistryObject<Block> TALL_HEIDIPHYLLUM_DOOR = BLOCKS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door"))));
    public static final RegistryObject<Block> TALL_LIRIODENDRITES_DOOR = BLOCKS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door"))));
    public static final RegistryObject<Block> TALL_METASEQUOIA_DOOR = BLOCKS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door"))));
    public static final RegistryObject<Block> TALL_NEOCALAMITES_DOOR = BLOCKS.register(DDNames.TALL_NEOCALAMITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "neocalamites_door"))));
    public static final RegistryObject<Block> TALL_PROTOJUNIPEROXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"))));
    public static final RegistryObject<Block> TALL_PROTOPICEOXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"))));
    public static final RegistryObject<Block> TALL_SCHILDERIA_DOOR = BLOCKS.register(DDNames.TALL_SCHILDERIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "schilderia_door"))));
    public static final RegistryObject<Block> TALL_TROCHODENDROIDES_DOOR = BLOCKS.register(DDNames.TALL_TROCHODENDROIDES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "trochodendroides_door"))));
    public static final RegistryObject<Block> TALL_WOODWORTHIA_DOOR = BLOCKS.register(DDNames.TALL_WOODWORTHIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "woodworthia_door"))));
    public static final RegistryObject<Block> TALL_ZAMITES_DOOR = BLOCKS.register(DDNames.TALL_ZAMITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door"))));
    
    // Regions Unexplored
    public static final RegistryObject<Block> SHORT_RUE_BAOBAB_DOOR = BLOCKS.register(DDNames.SHORT_RUE_BAOBAB, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "baobab_door"))));
    public static final RegistryObject<Block> SHORT_RUE_BLACKWOOD_DOOR = BLOCKS.register(DDNames.SHORT_RUE_BLACKWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "blackwood_door"))));
    public static final RegistryObject<Block> SHORT_RUE_CHERRY_DOOR = BLOCKS.register(DDNames.SHORT_RUE_CHERRY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cherry_door"))));
    public static final RegistryObject<Block> SHORT_RUE_CYPRESS_DOOR = BLOCKS.register(DDNames.SHORT_RUE_CYPRESS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cypress_door"))));
    public static final RegistryObject<Block> SHORT_RUE_DEAD_DOOR = BLOCKS.register(DDNames.SHORT_RUE_DEAD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "dead_door"))));
    public static final RegistryObject<Block> SHORT_RUE_EUCALYPTUS_DOOR = BLOCKS.register(DDNames.SHORT_RUE_EUCALYPTUS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "eucalyptus_door"))));
    public static final RegistryObject<Block> SHORT_RUE_JOSHUA_DOOR = BLOCKS.register(DDNames.SHORT_RUE_JOSHUA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "joshua_door"))));
    public static final RegistryObject<Block> SHORT_RUE_LARCH_DOOR = BLOCKS.register(DDNames.SHORT_RUE_LARCH, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "larch_door"))));
    public static final RegistryObject<Block> SHORT_RUE_MAPLE_DOOR = BLOCKS.register(DDNames.SHORT_RUE_MAPLE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "maple_door"))));
    public static final RegistryObject<Block> SHORT_RUE_MAUVE_DOOR = BLOCKS.register(DDNames.SHORT_RUE_MAUVE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "mauve_door"))));
    public static final RegistryObject<Block> SHORT_RUE_PALM_DOOR = BLOCKS.register(DDNames.SHORT_RUE_PALM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "palm_door"))));
    public static final RegistryObject<Block> SHORT_RUE_PINE_DOOR = BLOCKS.register(DDNames.SHORT_RUE_PINE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "pine_door"))));
    public static final RegistryObject<Block> SHORT_RUE_REDWOOD_DOOR = BLOCKS.register(DDNames.SHORT_RUE_REDWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "redwood_door"))));
    public static final RegistryObject<Block> SHORT_RUE_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_RUE_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "willow_door"))));

    public static final RegistryObject<Block> TALL_RUE_BAOBAB_DOOR = BLOCKS.register(DDNames.TALL_RUE_BAOBAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "baobab_door"))));
    public static final RegistryObject<Block> TALL_RUE_BLACKWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUE_BLACKWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "blackwood_door"))));
    public static final RegistryObject<Block> TALL_RUE_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_RUE_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cherry_door"))));
    public static final RegistryObject<Block> TALL_RUE_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_RUE_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cypress_door"))));
    public static final RegistryObject<Block> TALL_RUE_DEAD_DOOR = BLOCKS.register(DDNames.TALL_RUE_DEAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "dead_door"))));
    public static final RegistryObject<Block> TALL_RUE_EUCALYPTUS_DOOR = BLOCKS.register(DDNames.TALL_RUE_EUCALYPTUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "eucalyptus_door"))));
    public static final RegistryObject<Block> TALL_RUE_JOSHUA_DOOR = BLOCKS.register(DDNames.TALL_RUE_JOSHUA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "joshua_door"))));
    public static final RegistryObject<Block> TALL_RUE_LARCH_DOOR = BLOCKS.register(DDNames.TALL_RUE_LARCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "larch_door"))));
    public static final RegistryObject<Block> TALL_RUE_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_RUE_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "maple_door"))));
    public static final RegistryObject<Block> TALL_RUE_MAUVE_DOOR = BLOCKS.register(DDNames.TALL_RUE_MAUVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "mauve_door"))));
    public static final RegistryObject<Block> TALL_RUE_PALM_DOOR = BLOCKS.register(DDNames.TALL_RUE_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "palm_door"))));
    public static final RegistryObject<Block> TALL_RUE_PINE_DOOR = BLOCKS.register(DDNames.TALL_RUE_PINE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "pine_door"))));
    public static final RegistryObject<Block> TALL_RUE_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUE_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "redwood_door"))));
    public static final RegistryObject<Block> TALL_RUE_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_RUE_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "willow_door"))));

    //Twilight Forest
    public static final RegistryObject<Block> SHORT_CANOPY_DOOR = BLOCKS.register(DDNames.SHORT_CANOPY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "canopy_door"))));
    public static final RegistryObject<Block> SHORT_DARKWOOD_DOOR = BLOCKS.register(DDNames.SHORT_DARKWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "dark_door"))));
    public static final RegistryObject<Block> SHORT_TWILIGHT_MANGROVE_DOOR = BLOCKS.register(DDNames.SHORT_TWILIGHT_MANGROVE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door"))));
    public static final RegistryObject<Block> SHORT_MINEWOOD_DOOR = BLOCKS.register(DDNames.SHORT_MINEWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mining_door"))));
    public static final RegistryObject<Block> SHORT_SORTINGWOOD_DOOR = BLOCKS.register(DDNames.SHORT_SORTINGWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "sorting_door"))));
    public static final RegistryObject<Block> SHORT_TIMEWOOD_DOOR = BLOCKS.register(DDNames.SHORT_TIMEWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "time_door"))));
    public static final RegistryObject<Block> SHORT_TRANSWOOD_DOOR = BLOCKS.register(DDNames.SHORT_TRANSWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "transformation_door"))));
    public static final RegistryObject<Block> SHORT_TWILIGHT_OAK_DOOR = BLOCKS.register(DDNames.SHORT_TWILIGHT_OAK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door"))));
    
    public static final RegistryObject<Block> SHORT_TOWERWOOD_DOOR = BLOCKS.register(DDNames.SHORT_TOWERWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door"))));
    
    public static final RegistryObject<Block> TALL_CANOPY_DOOR = BLOCKS.register(DDNames.TALL_CANOPY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "canopy_door"))));
    public static final RegistryObject<Block> TALL_DARKWOOD_DOOR = BLOCKS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "dark_door"))));
    public static final RegistryObject<Block> TALL_TWILIGHT_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door"))));
    public static final RegistryObject<Block> TALL_MINEWOOD_DOOR = BLOCKS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mining_door"))));
    public static final RegistryObject<Block> TALL_SORTINGWOOD_DOOR = BLOCKS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "sorting_door"))));
    public static final RegistryObject<Block> TALL_TIMEWOOD_DOOR = BLOCKS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "time_door"))));
    public static final RegistryObject<Block> TALL_TRANSWOOD_DOOR = BLOCKS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "transformation_door"))));
    public static final RegistryObject<Block> TALL_TWILIGHT_OAK_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door"))));
    
    public static final RegistryObject<Block> TALL_TOWERWOOD_DOOR = BLOCKS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door"))));
    
    //Abnormals
    public static final RegistryObject<Block> SHORT_ASPEN_DOOR = BLOCKS.register(DDNames.SHORT_ASPEN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "aspen_door"))));
    public static final RegistryObject<Block> SHORT_GRIMWOOD_DOOR = BLOCKS.register(DDNames.SHORT_GRIMWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door"))));
    public static final RegistryObject<Block> SHORT_KOUSA_DOOR = BLOCKS.register(DDNames.SHORT_KOUSA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "kousa_door"))));
    public static final RegistryObject<Block> SHORT_MORADO_DOOR = BLOCKS.register(DDNames.SHORT_MORADO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "morado_door"))));
    public static final RegistryObject<Block> SHORT_ROSEWOOD_DOOR = BLOCKS.register(DDNames.SHORT_ROSEWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door"))));
    public static final RegistryObject<Block> SHORT_YUCCA_DOOR = BLOCKS.register(DDNames.SHORT_YUCCA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "yucca_door"))));

    public static final RegistryObject<Block> SHORT_MAPLE_DOOR = BLOCKS.register(DDNames.SHORT_MAPLE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("autumnity", "maple_door"))));

    public static final RegistryObject<Block> SHORT_HONEYCOMB_DOOR = BLOCKS.register(DDNames.SHORT_HONEYCOMB, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door"))));

    public static final RegistryObject<Block> SHORT_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door"))));

    public static final RegistryObject<Block> SHORT_POISE_DOOR = BLOCKS.register(DDNames.SHORT_POISE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("endergetic", "poise_door"))));

    public static final RegistryObject<Block> SHORT_CHERRY_DOOR = BLOCKS.register(DDNames.SHORT_CHERRY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("environmental", "cherry_door"))));
    public static final RegistryObject<Block> SHORT_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("environmental", "willow_door"))));
    public static final RegistryObject<Block> SHORT_WISTERIA_DOOR = BLOCKS.register(DDNames.SHORT_WISTERIA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("environmental", "wisteria_door"))));

    public static final RegistryObject<Block> SHORT_DRIFTWOOD_DOOR = BLOCKS.register(DDNames.SHORT_DRIFTWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door"))));
    public static final RegistryObject<Block> SHORT_RIVER_DOOR = BLOCKS.register(DDNames.SHORT_RIVER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door"))));
    public static final RegistryObject<Block> SHORT_GLASS_DOOR = BLOCKS.register(DDNames.SHORT_GLASS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door"))));
    public static final RegistryObject<Block> SHORT_TOOTH_DOOR = BLOCKS.register(DDNames.SHORT_TOOTH, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door"))));
    
    public static final RegistryObject<Block> TALL_ASPEN_DOOR = BLOCKS.register(DDNames.TALL_ASPEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "aspen_door"))));
    public static final RegistryObject<Block> TALL_GRIMWOOD_DOOR = BLOCKS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door"))));
    public static final RegistryObject<Block> TALL_KOUSA_DOOR = BLOCKS.register(DDNames.TALL_KOUSA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "kousa_door"))));
    public static final RegistryObject<Block> TALL_MORADO_DOOR = BLOCKS.register(DDNames.TALL_MORADO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "morado_door"))));
    public static final RegistryObject<Block> TALL_ROSEWOOD_DOOR = BLOCKS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door"))));
    public static final RegistryObject<Block> TALL_YUCCA_DOOR = BLOCKS.register(DDNames.TALL_YUCCA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "yucca_door"))));

    public static final RegistryObject<Block> TALL_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("autumnity", "maple_door"))));

    public static final RegistryObject<Block> TALL_HONEYCOMB_DOOR = BLOCKS.register(DDNames.TALL_HONEYCOMB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door"))));

    public static final RegistryObject<Block> TALL_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door"))));

    public static final RegistryObject<Block> TALL_POISE_DOOR = BLOCKS.register(DDNames.TALL_POISE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("endergetic", "poise_door"))));

    public static final RegistryObject<Block> TALL_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "cherry_door"))));
    public static final RegistryObject<Block> TALL_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "willow_door"))));
    public static final RegistryObject<Block> TALL_WISTERIA_DOOR = BLOCKS.register(DDNames.TALL_WISTERIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "wisteria_door"))));

    public static final RegistryObject<Block> TALL_DRIFTWOOD_DOOR = BLOCKS.register(DDNames.TALL_DRIFTWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door"))));
    public static final RegistryObject<Block> TALL_RIVER_DOOR = BLOCKS.register(DDNames.TALL_RIVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door"))));
    public static final RegistryObject<Block> TALL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door"))));
    public static final RegistryObject<Block> TALL_TOOTH_DOOR = BLOCKS.register(DDNames.TALL_TOOTH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door"))));
    
    //Abundance
    public static final RegistryObject<Block> SHORT_JACARANDA_DOOR = BLOCKS.register(DDNames.SHORT_JACARANDA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("abundance", "jacaranda_door"))));
    public static final RegistryObject<Block> SHORT_REDBUD_DOOR = BLOCKS.register(DDNames.SHORT_REDBUD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("abundance", "redbud_door"))));
    
    public static final RegistryObject<Block> TALL_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "jacaranda_door"))));
    public static final RegistryObject<Block> TALL_REDBUD_DOOR = BLOCKS.register(DDNames.TALL_REDBUD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "redbud_door"))));

    //Bayou Blues
    public static final RegistryObject<Block> SHORT_CYPRESS_DOOR = BLOCKS.register(DDNames.SHORT_CYPRESS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("cypress", "cypress_door"))));

    public static final RegistryObject<Block> TALL_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("cypress", "cypress_door"))));
    
    //Enhanced Mushrooms
    public static final RegistryObject<Block> SHORT_BROWN_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_BROWN_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"))));
    public static final RegistryObject<Block> SHORT_RED_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_RED_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"))));

    public static final RegistryObject<Block> TALL_BROWN_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"))));
    public static final RegistryObject<Block> TALL_RED_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"))));
    
    //Ad Astra
    public static final RegistryObject<Block> SHORT_AERONOS_DOOR = BLOCKS.register(DDNames.SHORT_AERONOS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "aeronos"))));
    public static final RegistryObject<Block> SHORT_GLACIAN_DOOR = BLOCKS.register(DDNames.SHORT_GLACIAN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "glacian_door"))));
    public static final RegistryObject<Block> SHORT_STROPHAR_DOOR = BLOCKS.register(DDNames.SHORT_STROPHAR, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "strophar_door"))));
    public static final RegistryObject<Block> SHORT_AA_STEEL_DOOR = BLOCKS.register(DDNames.SHORT_AA_STEEL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR)));
    
    public static final RegistryObject<Block> TALL_AERONOS_DOOR = BLOCKS.register(DDNames.TALL_AERONOS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "aeronos"))));
    public static final RegistryObject<Block> TALL_GLACIAN_DOOR = BLOCKS.register(DDNames.TALL_GLACIAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "glacian_door"))));
    public static final RegistryObject<Block> TALL_STROPHAR_DOOR = BLOCKS.register(DDNames.TALL_STROPHAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "strophar_door"))));
    public static final RegistryObject<Block> TALL_AA_STEEL_DOOR = BLOCKS.register(DDNames.TALL_AA_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR)));
    
    // Abundant Atmosphere
    public static final RegistryObject<Block> SHORT_ASH_DOOR = BLOCKS.register(DDNames.SHORT_ASH, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "ash_door"))));
    public static final RegistryObject<Block> SHORT_GOURDROT_DOOR = BLOCKS.register(DDNames.SHORT_GOURDROT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "gourdrot_door"))));

    public static final RegistryObject<Block> TALL_ASH_DOOR = BLOCKS.register(DDNames.TALL_ASH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "ash_door"))));
    public static final RegistryObject<Block> TALL_GOURDROT_DOOR = BLOCKS.register(DDNames.TALL_GOURDROT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "gourdrot_door"))));
    
    // Architects Palette
    public static final RegistryObject<Block> SHORT_TWISTED_DOOR = BLOCKS.register(DDNames.SHORT_TWISTED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("architects_palette", "twisted_door"))));

    public static final RegistryObject<Block> TALL_TWISTED_DOOR = BLOCKS.register(DDNames.TALL_TWISTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("architects_palette", "twisted_door"))));
    
    // Ars Nouveau
    public static final RegistryObject<Block> SHORT_ARCHWOOD_DOOR = BLOCKS.register(DDNames.SHORT_ARCHWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ars_nouveau", "archwood_door"))));

    public static final RegistryObject<Block> TALL_ARCHWOOD_DOOR = BLOCKS.register(DDNames.TALL_ARCHWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ars_nouveau", "archwood_door"))));
    
    // Bamboo Everything
    public static final RegistryObject<Block> SHORT_BE_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_BE_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door"))));
    public static final RegistryObject<Block> SHORT_BE_DRY_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_BE_DRY_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door"))));

    public static final RegistryObject<Block> TALL_BE_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BE_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door"))));
    public static final RegistryObject<Block> TALL_BE_DRY_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BE_DRY_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door"))));
    
    // Biomancy
    public static final RegistryObject<Block> SHORT_FLESH_DOOR = BLOCKS.register(DDNames.SHORT_FLESH, () -> new ShortFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    public static final RegistryObject<Block> SHORT_FULL_FLESH_DOOR = BLOCKS.register(DDNames.SHORT_FULL_FLESH, () -> new ShortFullFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    public static final RegistryObject<Block> SHORT_FLESHKIN_DOOR = BLOCKS.register(DDNames.SHORT_FLESHKIN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    
    public static final RegistryObject<Block> TALL_FLESH_DOOR = BLOCKS.register(DDNames.TALL_FLESH, () -> new TallFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    public static final RegistryObject<Block> TALL_FULL_FLESH_DOOR = BLOCKS.register(DDNames.TALL_FULL_FLESH, () -> new TallFullFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    public static final RegistryObject<Block> TALL_FLESHKIN_DOOR = BLOCKS.register(DDNames.TALL_FLESHKIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door"))));    
    
    // Biome Makeover
    public static final RegistryObject<Block> SHORT_BM_ANCIENT_OAK_DOOR = BLOCKS.register(DDNames.SHORT_BM_ANCIENT_OAK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "ancient_oak_door"))));
    public static final RegistryObject<Block> SHORT_BM_BLIGHTED_BALSA_DOOR = BLOCKS.register(DDNames.SHORT_BM_BLIGHTED_BALSA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "blighted_balsa_door"))));
    public static final RegistryObject<Block> SHORT_BM_SWAMP_CYPRESS_DOOR = BLOCKS.register(DDNames.SHORT_BM_SWAMP_CYPRESS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "swamp_cypress_door"))));
    public static final RegistryObject<Block> SHORT_BM_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_BM_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "willow_door"))));

    public static final RegistryObject<Block> TALL_BM_ANCIENT_OAK_DOOR = BLOCKS.register(DDNames.TALL_BM_ANCIENT_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "ancient_oak_door"))));
    public static final RegistryObject<Block> TALL_BM_BLIGHTED_BALSA_DOOR = BLOCKS.register(DDNames.TALL_BM_BLIGHTED_BALSA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "blighted_balsa_door"))));
    public static final RegistryObject<Block> TALL_BM_SWAMP_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_BM_SWAMP_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "swamp_cypress_door"))));
    public static final RegistryObject<Block> TALL_BM_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BM_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "willow_door"))));
    
    //Blocks Plus
    public static final RegistryObject<Block> SHORT_BP_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_BP_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door"))));
    public static final RegistryObject<Block> SHORT_BP_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_BP_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door"))));
    public static final RegistryObject<Block> SHORT_BP_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_BP_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "copper_door"))));
    public static final RegistryObject<Block> SHORT_BP_GOLDEN_DOOR = BLOCKS.register(DDNames.SHORT_BP_GOLDEN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "golden_door"))));
    public static final RegistryObject<Block> SHORT_BP_DIAMOND_DOOR = BLOCKS.register(DDNames.SHORT_BP_DIAMOND, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "diamond_door"))));
    public static final RegistryObject<Block> SHORT_BP_EMERALD_DOOR = BLOCKS.register(DDNames.SHORT_BP_EMERALD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "emerald_door"))));
    public static final RegistryObject<Block> SHORT_BP_NETHERITE_DOOR = BLOCKS.register(DDNames.SHORT_BP_NETHERITE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "netherite_door"))));
    
    public static final RegistryObject<Block> TALL_BP_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door"))));
    public static final RegistryObject<Block> TALL_BP_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door"))));
    public static final RegistryObject<Block> TALL_BP_COPPER_DOOR = BLOCKS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "copper_door"))));
    public static final RegistryObject<Block> TALL_BP_GOLDEN_DOOR = BLOCKS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "golden_door"))));
    public static final RegistryObject<Block> TALL_BP_DIAMOND_DOOR = BLOCKS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "diamond_door"))));
    public static final RegistryObject<Block> TALL_BP_EMERALD_DOOR = BLOCKS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "emerald_door"))));
    public static final RegistryObject<Block> TALL_BP_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "netherite_door"))));
    
    // Blue Skies
    public static final RegistryObject<Block> SHORT_BS_BLUEBRIGHT_DOOR = BLOCKS.register(DDNames.SHORT_BS_BLUEBRIGHT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "bluebright_door"))));
    public static final RegistryObject<Block> SHORT_BS_CHERRY_DOOR = BLOCKS.register(DDNames.SHORT_BS_CHERRY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "cherry_door"))));
    public static final RegistryObject<Block> SHORT_BS_CRYSTALLIZED_DOOR = BLOCKS.register(DDNames.SHORT_BS_CRYSTALLIZED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "crystallized_door"))));
    public static final RegistryObject<Block> SHORT_BS_DUSK_DOOR = BLOCKS.register(DDNames.SHORT_BS_DUSK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "dusk_door"))));
    public static final RegistryObject<Block> SHORT_BS_FROSTBRIGHT_DOOR = BLOCKS.register(DDNames.SHORT_BS_FROSTBRIGHT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "frostbright_door"))));
    public static final RegistryObject<Block> SHORT_BS_LUNAR_DOOR = BLOCKS.register(DDNames.SHORT_BS_LUNAR, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "lunar_door"))));
    public static final RegistryObject<Block> SHORT_BS_MAPLE_DOOR = BLOCKS.register(DDNames.SHORT_BS_MAPLE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "maple_door"))));
    public static final RegistryObject<Block> SHORT_BS_STARLIT_DOOR = BLOCKS.register(DDNames.SHORT_BS_STARLIT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "starlit_door"))));
    
    public static final RegistryObject<Block> TALL_BS_BLUEBRIGHT_DOOR = BLOCKS.register(DDNames.TALL_BS_BLUEBRIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "bluebright_door"))));
    public static final RegistryObject<Block> TALL_BS_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BS_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "cherry_door"))));
    public static final RegistryObject<Block> TALL_BS_CRYSTALLIZED_DOOR = BLOCKS.register(DDNames.TALL_BS_CRYSTALLIZED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "crystallized_door"))));
    public static final RegistryObject<Block> TALL_BS_DUSK_DOOR = BLOCKS.register(DDNames.TALL_BS_DUSK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "dusk_door"))));
    public static final RegistryObject<Block> TALL_BS_FROSTBRIGHT_DOOR = BLOCKS.register(DDNames.TALL_BS_FROSTBRIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "frostbright_door"))));
    public static final RegistryObject<Block> TALL_BS_LUNAR_DOOR = BLOCKS.register(DDNames.TALL_BS_LUNAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "lunar_door"))));
    public static final RegistryObject<Block> TALL_BS_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_BS_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "maple_door"))));
    public static final RegistryObject<Block> TALL_BS_STARLIT_DOOR = BLOCKS.register(DDNames.TALL_BS_STARLIT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "starlit_door"))));
    
    // Caupona
    public static final RegistryObject<Block> SHORT_WALNUT_DOOR = BLOCKS.register(DDNames.SHORT_WALNUT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("caupona", "walnut_door"))));    

    public static final RegistryObject<Block> TALL_WALNUT_DOOR = BLOCKS.register(DDNames.TALL_WALNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("caupona", "walnut_door"))));    
    
    // The Ceilands
    public static final RegistryObject<Block> SHORT_CEILTRUNK_DOOR = BLOCKS.register(DDNames.SHORT_CEILTRUNK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door"))));
    public static final RegistryObject<Block> SHORT_LUZAWOOD_DOOR = BLOCKS.register(DDNames.SHORT_LUZAWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "luzawood_door"))));

    public static final RegistryObject<Block> TALL_CEILTRUNK_DOOR = BLOCKS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door"))));
    public static final RegistryObject<Block> TALL_LUZAWOOD_DOOR = BLOCKS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "luzawood_door"))));

    // Cobblemon
	public static final RegistryObject<Block> SHORT_APRICORN_DOOR = BLOCKS.register(DDNames.SHORT_APRICORN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door"))));

	public static final RegistryObject<Block> TALL_APRICORN_DOOR = BLOCKS.register(DDNames.TALL_APRICORN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door"))));
    
    // Colourful Azaleas
    public static final RegistryObject<Block> SHORT_AZULE_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_AZULE_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door"))));
    public static final RegistryObject<Block> SHORT_BRIGHT_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_BRIGHT_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door"))));
    public static final RegistryObject<Block> SHORT_FISS_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_FISS_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door"))));
    public static final RegistryObject<Block> SHORT_ROZE_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_ROZE_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door"))));
    public static final RegistryObject<Block> SHORT_TECAL_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_TECAL_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door"))));
    public static final RegistryObject<Block> SHORT_TITANIUM_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_TITANIUM_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door"))));
    public static final RegistryObject<Block> SHORT_WALNUT_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_WALNUT_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door"))));    
    
    public static final RegistryObject<Block> TALL_AZULE_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_AZULE_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door"))));
    public static final RegistryObject<Block> TALL_BRIGHT_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_BRIGHT_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door"))));
    public static final RegistryObject<Block> TALL_FISS_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_FISS_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door"))));
    public static final RegistryObject<Block> TALL_ROZE_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ROZE_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door"))));
    public static final RegistryObject<Block> TALL_TECAL_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_TECAL_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door"))));
    public static final RegistryObject<Block> TALL_TITANIUM_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_TITANIUM_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door"))));
    public static final RegistryObject<Block> TALL_WALNUT_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_WALNUT_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door"))));    
    
    // Copper Overhaul
    public static final RegistryObject<Block> SHORT_CO_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_CO_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door"))));
    public static final RegistryObject<Block> SHORT_CO_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_CO_EXPOSED_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door"))));
    public static final RegistryObject<Block> SHORT_CO_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_CO_WEATHERED_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door"))));
    public static final RegistryObject<Block> SHORT_CO_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_CO_OXIDIZED_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door"))));
    
    public static final RegistryObject<Block> TALL_CO_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door"))));
    public static final RegistryObject<Block> TALL_CO_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_EXPOSED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door"))));
    public static final RegistryObject<Block> TALL_CO_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_WEATHERED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door"))));
    public static final RegistryObject<Block> TALL_CO_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_OXIDIZED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door"))));
    
    // Create: Alloyed
    public static final RegistryObject<Block> SHORT_STEEL_DOOR = BLOCKS.register(DDNames.SHORT_STEEL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "steel_door"))));
    public static final RegistryObject<Block> SHORT_LOCKED_STEEL_DOOR = BLOCKS.register(DDNames.SHORT_LOCKED_STEEL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door"))));
    
    public static final RegistryObject<Block> TALL_STEEL_DOOR = BLOCKS.register(DDNames.TALL_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "steel_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_STEEL_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door"))));
    
    // Create: Deco
    public static final RegistryObject<Block> SHORT_ANDESITE_DOOR = BLOCKS.register(DDNames.SHORT_ANDESITE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "andesite_door"))));
    public static final RegistryObject<Block> SHORT_BRASS_DOOR = BLOCKS.register(DDNames.SHORT_BRASS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "brass_door"))));
    public static final RegistryObject<Block> SHORT_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "copper_door"))));
    public static final RegistryObject<Block> SHORT_ZINC_DOOR = BLOCKS.register(DDNames.SHORT_ZINC, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "zinc_door"))));
    public static final RegistryObject<Block> SHORT_LOCKED_ANDESITE_DOOR = BLOCKS.register(DDNames.SHORT_LOCKED_ANDESITE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door"))));
    public static final RegistryObject<Block> SHORT_LOCKED_BRASS_DOOR = BLOCKS.register(DDNames.SHORT_LOCKED_BRASS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door"))));
    public static final RegistryObject<Block> SHORT_LOCKED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_LOCKED_COPPER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door"))));
    public static final RegistryObject<Block> SHORT_LOCKED_ZINC_DOOR = BLOCKS.register(DDNames.SHORT_LOCKED_ZINC, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door"))));

    public static final RegistryObject<Block> TALL_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "andesite_door"))));
    public static final RegistryObject<Block> TALL_BRASS_DOOR = BLOCKS.register(DDNames.TALL_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "brass_door"))));
    public static final RegistryObject<Block> TALL_COPPER_DOOR = BLOCKS.register(DDNames.TALL_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "copper_door"))));
    public static final RegistryObject<Block> TALL_ZINC_DOOR = BLOCKS.register(DDNames.TALL_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "zinc_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_BRASS_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door"))));
    public static final RegistryObject<Block> TALL_LOCKED_ZINC_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door"))));
    
    // Create: Misc & Things
    public static final RegistryObject<Block> SHORT_ANDESITE_CASING_DOOR = BLOCKS.register(DDNames.SHORT_ANDESITE_CASING, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "andesite_casing_door"))));
    public static final RegistryObject<Block> SHORT_BRASS_CASING_DOOR = BLOCKS.register(DDNames.SHORT_BRASS_CASING, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "brass_casing_door"))));
    public static final RegistryObject<Block> SHORT_COPPER_CASING_DOOR = BLOCKS.register(DDNames.SHORT_COPPER_CASING, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "copper_casing_door"))));    

    public static final RegistryObject<Block> TALL_ANDESITE_CASING_DOOR = BLOCKS.register(DDNames.TALL_ANDESITE_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "andesite_casing_door"))));
    public static final RegistryObject<Block> TALL_BRASS_CASING_DOOR = BLOCKS.register(DDNames.TALL_BRASS_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "brass_casing_door"))));
    public static final RegistryObject<Block> TALL_COPPER_CASING_DOOR = BLOCKS.register(DDNames.TALL_COPPER_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "copper_casing_door"))));    
    
    // Darker Depths
    public static final RegistryObject<Block> SHORT_PETRIFIED_DOOR = BLOCKS.register(DDNames.SHORT_PETRIFIED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door"))));

    public static final RegistryObject<Block> TALL_PETRIFIED_DOOR = BLOCKS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door"))));
    
    // Deeper Darker
    public static final RegistryObject<Block> SHORT_ECHO_DOOR = BLOCKS.register(DDNames.SHORT_ECHO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("deeperdarker", "echo_door"))));
    
    public static final RegistryObject<Block> TALL_ECHO_DOOR = BLOCKS.register(DDNames.TALL_ECHO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("deeperdarker", "echo_door"))));
    
    // Dustrial Decor
    public static final RegistryObject<Block> SHORT_CARDBOARD_DOOR = BLOCKS.register(DDNames.SHORT_CARDBOARD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door"))));
    public static final RegistryObject<Block> SHORT_CHAIN_DOOR = BLOCKS.register(DDNames.SHORT_CHAIN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door"))));
    public static final RegistryObject<Block> SHORT_INDUSTRIAL_IRON_DOOR = BLOCKS.register(DDNames.SHORT_INDUSTRIAL_IRON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door"))));
    public static final RegistryObject<Block> SHORT_IRON_BAR_DOOR = BLOCKS.register(DDNames.SHORT_IRON_BAR, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door"))));
    public static final RegistryObject<Block> SHORT_PADDED_DOOR = BLOCKS.register(DDNames.SHORT_PADDED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door"))));
    public static final RegistryObject<Block> SHORT_RUSTY_IRON_DOOR = BLOCKS.register(DDNames.SHORT_RUSTY_IRON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door"))));
    public static final RegistryObject<Block> SHORT_RUSTY_SHEET_METAL_DOOR = BLOCKS.register(DDNames.SHORT_RUSTY_SHEET_METAL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"))));
    public static final RegistryObject<Block> SHORT_SHEET_METAL_DOOR = BLOCKS.register(DDNames.SHORT_SHEET_METAL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door"))));

    public static final RegistryObject<Block> TALL_CARDBOARD_DOOR = BLOCKS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door"))));
    public static final RegistryObject<Block> TALL_CHAIN_DOOR = BLOCKS.register(DDNames.TALL_CHAIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door"))));
    public static final RegistryObject<Block> TALL_INDUSTRIAL_IRON_DOOR = BLOCKS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door"))));
    public static final RegistryObject<Block> TALL_IRON_BAR_DOOR = BLOCKS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door"))));
    public static final RegistryObject<Block> TALL_PADDED_DOOR = BLOCKS.register(DDNames.TALL_PADDED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door"))));
    public static final RegistryObject<Block> TALL_RUSTY_IRON_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door"))));
    public static final RegistryObject<Block> TALL_RUSTY_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"))));
    public static final RegistryObject<Block> TALL_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door"))));

    // Ecologics
    public static final RegistryObject<Block> SHORT_ECO_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_ECO_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "azalea_door"))));
    public static final RegistryObject<Block> SHORT_ECO_FLOWERING_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_ECO_FLOWERING_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door"))));
    public static final RegistryObject<Block> SHORT_ECO_COCONUT_DOOR = BLOCKS.register(DDNames.SHORT_ECO_COCONUT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "coconut_door"))));
    public static final RegistryObject<Block> SHORT_ECO_WALNUT_DOOR = BLOCKS.register(DDNames.SHORT_ECO_WALNUT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "walnut_door"))));
    
    public static final RegistryObject<Block> TALL_ECO_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "azalea_door"))));
    public static final RegistryObject<Block> TALL_ECO_FLOWERING_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door"))));
    public static final RegistryObject<Block> TALL_ECO_COCONUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "coconut_door"))));
    public static final RegistryObject<Block> TALL_ECO_WALNUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "walnut_door"))));
    
    // End's Phantasm
    public static final RegistryObject<Block> SHORT_EBONY_DOOR = BLOCKS.register(DDNames.SHORT_EBONY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "ebony_door"))));
    public static final RegistryObject<Block> SHORT_PREAM_DOOR = BLOCKS.register(DDNames.SHORT_PREAM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "pream_door"))));
    
    public static final RegistryObject<Block> TALL_EBONY_DOOR = BLOCKS.register(DDNames.TALL_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "ebony_door"))));
    public static final RegistryObject<Block> TALL_PREAM_DOOR = BLOCKS.register(DDNames.TALL_PREAM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "pream_door"))));
    
    // Enlightened End
    public static final RegistryObject<Block> SHORT_CONGEALED_DOOR = BLOCKS.register(DDNames.SHORT_CONGEALED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "congealed_door"))));
    public static final RegistryObject<Block> SHORT_EE_EBONY_DOOR = BLOCKS.register(DDNames.SHORT_EE_EBONY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "verdant_door"))));
    
    public static final RegistryObject<Block> TALL_CONGEALED_DOOR = BLOCKS.register(DDNames.TALL_CONGEALED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "congealed_door"))));
    public static final RegistryObject<Block> TALL_EE_EBONY_DOOR = BLOCKS.register(DDNames.TALL_EE_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "verdant_door"))));

    // Everything is Copper
    public static final RegistryObject<Block> SHORT_EC_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> SHORT_EC_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_EXPOSED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED));
    public static final RegistryObject<Block> SHORT_EC_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_WEATHERED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED));
    public static final RegistryObject<Block> SHORT_EC_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_OXIDIZED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED));
    public static final RegistryObject<Block> SHORT_EC_WAXED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_WAXED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> SHORT_EC_WAXED_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED));
    public static final RegistryObject<Block> SHORT_EC_WAXED_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED));
    public static final RegistryObject<Block> SHORT_EC_WAXED_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, () -> new ShortCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED));
    
    public static final RegistryObject<Block> TALL_EC_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> TALL_EC_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_EXPOSED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED));
    public static final RegistryObject<Block> TALL_EC_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WEATHERED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED));
    public static final RegistryObject<Block> TALL_EC_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_OXIDIZED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED));
    public static final RegistryObject<Block> TALL_EC_WAXED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> TALL_EC_WAXED_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED));
    public static final RegistryObject<Block> TALL_EC_WAXED_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED));
    public static final RegistryObject<Block> TALL_EC_WAXED_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED));
    
    // Extended Mushrooms
    public static final RegistryObject<Block> SHORT_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door"))));
    public static final RegistryObject<Block> SHORT_GLOWSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_GLOWSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door"))));
    public static final RegistryObject<Block> SHORT_POISONOUS_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_POISONOUS_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"))));
    public static final RegistryObject<Block> SHORT_HONEY_FUNGUS_DOOR = BLOCKS.register(DDNames.SHORT_HONEY_FUNGUS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door"))));
    
    public static final RegistryObject<Block> TALL_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door"))));
    public static final RegistryObject<Block> TALL_GLOWSHROOM_DOOR = BLOCKS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door"))));
    public static final RegistryObject<Block> TALL_POISONOUS_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_POISONOUS_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"))));
    public static final RegistryObject<Block> TALL_HONEY_FUNGUS_DOOR = BLOCKS.register(DDNames.TALL_HONEY_FUNGUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door"))));
    
    // Forbidden & Arcanus
    public static final RegistryObject<Block> SHORT_DEORUM_DOOR = BLOCKS.register(DDNames.SHORT_DEORUM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_gold_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> SHORT_ARCANE_EDELWOOD_DOOR = BLOCKS.register(DDNames.SHORT_ARCANE_EDELWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"))));
    public static final RegistryObject<Block> SHORT_CHERRYWOOD_DOOR = BLOCKS.register(DDNames.SHORT_CHERRYWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "cherrywood_door"))));
    public static final RegistryObject<Block> SHORT_EDELWOOD_DOOR = BLOCKS.register(DDNames.SHORT_EDELWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "edelwood_door"))));
    public static final RegistryObject<Block> SHORT_FUNGYSS_DOOR = BLOCKS.register(DDNames.SHORT_FUNGYSS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "fungyss_door"))));
    public static final RegistryObject<Block> SHORT_AURUM_DOOR = BLOCKS.register(DDNames.SHORT_AURUM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "mysterywood_door"))));
    
    public static final RegistryObject<Block> TALL_DEORUM_DOOR = BLOCKS.register(DDNames.TALL_DEORUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_gold_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> TALL_ARCANE_EDELWOOD_DOOR = BLOCKS.register(DDNames.TALL_ARCANE_EDELWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"))));
    public static final RegistryObject<Block> TALL_CHERRYWOOD_DOOR = BLOCKS.register(DDNames.TALL_CHERRYWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "cherrywood_door"))));
    public static final RegistryObject<Block> TALL_EDELWOOD_DOOR = BLOCKS.register(DDNames.TALL_EDELWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "edelwood_door"))));
    public static final RegistryObject<Block> TALL_FUNGYSS_DOOR = BLOCKS.register(DDNames.TALL_FUNGYSS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "fungyss_door"))));
    public static final RegistryObject<Block> TALL_AURUM_DOOR = BLOCKS.register(DDNames.TALL_AURUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "mysterywood_door"))));
    
    // Fruit Trees
    public static final RegistryObject<Block> SHORT_FT_CHERRY_DOOR = BLOCKS.register(DDNames.SHORT_FT_CHERRY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_door"))));
    //public static final RegistryObject<Block> SHORT_FT_CHERRY_SLIDING_DOOR = BLOCKS.register(DDNames.SHORT_FT_CHERRY_SLIDING, () -> new ShortStableDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door"))));
    public static final RegistryObject<Block> SHORT_FT_CITRUS_DOOR = BLOCKS.register(DDNames.SHORT_FT_CITRUS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "citrus_door"))));

    public static final RegistryObject<Block> TALL_FT_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_FT_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_door"))));
    public static final RegistryObject<Block> TALL_FT_CHERRY_SLIDING_DOOR = BLOCKS.register(DDNames.TALL_FT_CHERRY_SLIDING, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door"))));
    public static final RegistryObject<Block> TALL_FT_CITRUS_DOOR = BLOCKS.register(DDNames.TALL_FT_CITRUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "citrus_door"))));
    
    // Gardens of the Dead
    public static final RegistryObject<Block> SHORT_SOULBLIGHT_DOOR = BLOCKS.register(DDNames.SHORT_SOULBLIGHT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "soulblight_door"))));
    public static final RegistryObject<Block> SHORT_WHISTLECANE_DOOR = BLOCKS.register(DDNames.SHORT_WHISTLECANE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "whistlecane_door"))));

    public static final RegistryObject<Block> TALL_SOULBLIGHT_DOOR = BLOCKS.register(DDNames.TALL_SOULBLIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "soulblight_door"))));
    public static final RegistryObject<Block> TALL_WHISTLECANE_DOOR = BLOCKS.register(DDNames.TALL_WHISTLECANE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "whistlecane_door"))));
    
    // Good Ending
    public static final RegistryObject<Block> SHORT_GE_CYPRESS_DOOR = BLOCKS.register(DDNames.SHORT_GE_CYPRESS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("goodending", "cypress_door"))));
    public static final RegistryObject<Block> SHORT_GE_MUDDY_OAK_DOOR = BLOCKS.register(DDNames.SHORT_GE_MUDDY_OAK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("goodending", "muddy_oak_door"))));

    public static final RegistryObject<Block> TALL_GE_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_GE_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("goodending", "cypress_door"))));
    public static final RegistryObject<Block> TALL_GE_MUDDY_OAK_DOOR = BLOCKS.register(DDNames.TALL_GE_MUDDY_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("goodending", "muddy_oak_door"))));
    
    // Graveyard
    public static final RegistryObject<Block> SHORT_DARK_IRON_DOOR = BLOCKS.register(DDNames.SHORT_DARK_IRON, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR)));

    public static final RegistryObject<Block> TALL_DARK_IRON_DOOR = BLOCKS.register(DDNames.TALL_DARK_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR)));
    
    // Habitat
    public static final RegistryObject<Block> SHORT_FAIRY_RING_MUSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_FAIRY_RING_MUSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door"))));

    public static final RegistryObject<Block> TALL_FAIRY_RING_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door"))));
    
    // Hexcasting
    public static final RegistryObject<Block> SHORT_EDIFIED_DOOR = BLOCKS.register(DDNames.SHORT_EDIFIED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("hexcasting", "edified_door"))));

    public static final RegistryObject<Block> TALL_EDIFIED_DOOR = BLOCKS.register(DDNames.TALL_EDIFIED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexcasting", "edified_door"))));
    
    // Hexerei
    public static final RegistryObject<Block> SHORT_HEXEREI_MAHOGANY_DOOR = BLOCKS.register(DDNames.SHORT_HEXEREI_MAHOGANY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "mahogany_door"))));
    public static final RegistryObject<Block> SHORT_HEXEREI_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_HEXEREI_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "willow_door"))));
    public static final RegistryObject<Block> SHORT_HEXEREI_WITCH_HAZEL_DOOR = BLOCKS.register(DDNames.SHORT_HEXEREI_WITCH_HAZEL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "witch_hazel_door"))));

    public static final RegistryObject<Block> TALL_HEXEREI_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_HEXEREI_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "mahogany_door"))));
    public static final RegistryObject<Block> TALL_HEXEREI_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_HEXEREI_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "willow_door"))));
    public static final RegistryObject<Block> TALL_HEXEREI_WITCH_HAZEL_DOOR = BLOCKS.register(DDNames.TALL_HEXEREI_WITCH_HAZEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "witch_hazel_door"))));
    
    // Integrated Dynamics
    public static final RegistryObject<Block> SHORT_MENRIL_DOOR = BLOCKS.register(DDNames.SHORT_MENRIL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("integrateddynamics", "menril_door"))));

    public static final RegistryObject<Block> TALL_MENRIL_DOOR = BLOCKS.register(DDNames.TALL_MENRIL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("integrateddynamics", "menril_door"))));
    
    // Malum
    public static final RegistryObject<Block> SHORT_RUNEWOOD_DOOR = BLOCKS.register(DDNames.SHORT_RUNEWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("malum", "runewood_door"))));
    public static final RegistryObject<Block> SHORT_SOULWOOD_DOOR = BLOCKS.register(DDNames.SHORT_SOULWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("malum", "soulwood_door"))));

    public static final RegistryObject<Block> TALL_RUNEWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUNEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("malum", "runewood_door"))));
    public static final RegistryObject<Block> TALL_SOULWOOD_DOOR = BLOCKS.register(DDNames.TALL_SOULWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("malum", "soulwood_door"))));
    
    // Morecraft
    public static final RegistryObject<Block> SHORT_MORECRAFT_NETHERBRICK_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_NETHERBRICK, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherbrick_door")))); 
	public static final RegistryObject<Block> SHORT_MORECRAFT_NETHERWOOD_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_NETHERWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherwood_door"))));
	public static final RegistryObject<Block> SHORT_MORECRAFT_NETHERITE_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_NETHERITE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherite_door"))));
	public static final RegistryObject<Block> SHORT_MORECRAFT_GLASS_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_GLASS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "glass_door"))));
	public static final RegistryObject<Block> SHORT_MORECRAFT_SOUL_GLASS_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_SOUL_GLASS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "soul_glass_door"))));
	public static final RegistryObject<Block> SHORT_MORECRAFT_BONE_DOOR = BLOCKS.register(DDNames.SHORT_MORECRAFT_BONE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "bone_door"))));
	
    public static final RegistryObject<Block> TALL_MORECRAFT_NETHERBRICK_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERBRICK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherbrick_door")))); 
	public static final RegistryObject<Block> TALL_MORECRAFT_NETHERWOOD_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherwood_door"))));
	public static final RegistryObject<Block> TALL_MORECRAFT_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherite_door"))));
	public static final RegistryObject<Block> TALL_MORECRAFT_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "glass_door"))));
	public static final RegistryObject<Block> TALL_MORECRAFT_SOUL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_SOUL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "soul_glass_door"))));
	public static final RegistryObject<Block> TALL_MORECRAFT_BONE_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_BONE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "bone_door"))));
	
    // Nether's Exoticism
    public static final RegistryObject<Block> SHORT_JABOTICABA_DOOR = BLOCKS.register(DDNames.SHORT_JABOTICABA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door"))));
    public static final RegistryObject<Block> SHORT_RAMBOUTAN_DOOR = BLOCKS.register(DDNames.SHORT_RAMBOUTAN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door"))));

    public static final RegistryObject<Block> TALL_JABOTICABA_DOOR = BLOCKS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door"))));
    public static final RegistryObject<Block> TALL_RAMBOUTAN_DOOR = BLOCKS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door"))));

    // New World
    public static final RegistryObject<Block> SHORT_FIR_DOOR = BLOCKS.register(DDNames.SHORT_FIR, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("newworld", "fir_door"))));

    public static final RegistryObject<Block> TALL_FIR_DOOR = BLOCKS.register(DDNames.TALL_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("newworld", "fir_door"))));
    
    // Outer End
    public static final RegistryObject<Block> SHORT_AZURE_DOOR = BLOCKS.register(DDNames.SHORT_AZURE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("outer_end", "azure_door"))));

    public static final RegistryObject<Block> TALL_AZURE_DOOR = BLOCKS.register(DDNames.TALL_AZURE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("outer_end", "azure_door"))));
    
    // Pokecube
    /*public static final RegistryObject<Block> SHORT_POKECUBE_ENIGMA_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_ENIGMA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "enigma_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_LEPPA_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_LEPPA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "leppa_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_NANAB_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_NANAB, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "nanab_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_ORAN_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_ORAN, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "oran_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_PECHA_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_PECHA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "pecha_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_SITRUS_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_SITRUS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "sitrus_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_AGED_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_AGED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "aged_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_CONCRETE_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_CONCRETE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "concrete_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_CORRUPTED_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_CORRUPTED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "corrupted_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_DISTORTIC_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_DISTORTIC, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "distortic_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_INVERTED_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_INVERTED, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "inverted_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_MIRAGE_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_MIRAGE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "mirage_door"))));
    public static final RegistryObject<Block> SHORT_POKECUBE_TEMPORAL_DOOR = BLOCKS.register(DDNames.SHORT_POKECUBE_TEMPORAL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "temporal_door"))));
    */
    public static final RegistryObject<Block> TALL_POKECUBE_ENIGMA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ENIGMA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "enigma_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_LEPPA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_LEPPA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "leppa_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_NANAB_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_NANAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "nanab_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_ORAN_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ORAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "oran_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_PECHA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_PECHA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "pecha_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_SITRUS_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_SITRUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "sitrus_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_AGED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_AGED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "aged_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_CONCRETE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CONCRETE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "concrete_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_CORRUPTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CORRUPTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "corrupted_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_DISTORTIC_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_DISTORTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "distortic_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_INVERTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_INVERTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "inverted_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_MIRAGE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_MIRAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "mirage_door"))));
    public static final RegistryObject<Block> TALL_POKECUBE_TEMPORAL_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_TEMPORAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "temporal_door"))));
    
    // Premium Wood
    public static final RegistryObject<Block> SHORT_PW_MAGIC_DOOR = BLOCKS.register(DDNames.SHORT_PW_MAGIC, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "magic_door"))));
    public static final RegistryObject<Block> SHORT_PW_MAPLE_DOOR = BLOCKS.register(DDNames.SHORT_PW_MAPLE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "maple_door"))));
    public static final RegistryObject<Block> SHORT_PW_PURPLE_HEART_DOOR = BLOCKS.register(DDNames.SHORT_PW_PURPLE_HEART, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door"))));
    public static final RegistryObject<Block> SHORT_PW_SILVERBELL_DOOR = BLOCKS.register(DDNames.SHORT_PW_SILVERBELL, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door"))));
    public static final RegistryObject<Block> SHORT_PW_TIGER_DOOR = BLOCKS.register(DDNames.SHORT_PW_TIGER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "tiger_door"))));
    public static final RegistryObject<Block> SHORT_PW_WILLOW_DOOR = BLOCKS.register(DDNames.SHORT_PW_WILLOW, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "willow_door"))));
    
    public static final RegistryObject<Block> TALL_PW_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "magic_door"))));
    public static final RegistryObject<Block> TALL_PW_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "maple_door"))));
    public static final RegistryObject<Block> TALL_PW_PURPLE_HEART_DOOR = BLOCKS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door"))));
    public static final RegistryObject<Block> TALL_PW_SILVERBELL_DOOR = BLOCKS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door"))));
    public static final RegistryObject<Block> TALL_PW_TIGER_DOOR = BLOCKS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "tiger_door"))));
    public static final RegistryObject<Block> TALL_PW_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "willow_door"))));
    
    // Pyromancer
    public static final RegistryObject<Block> SHORT_PYROWOOD_DOOR = BLOCKS.register(DDNames.SHORT_PYROWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "pyrowood_door"))));
    public static final RegistryObject<Block> SHORT_ROTTEN_PLANKS_DOOR = BLOCKS.register(DDNames.SHORT_ROTTEN_PLANKS, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "rotten_planks_door"))));

    public static final RegistryObject<Block> TALL_PYROWOOD_DOOR = BLOCKS.register(DDNames.TALL_PYROWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "pyrowood_door"))));
    public static final RegistryObject<Block> TALL_ROTTEN_PLANKS_DOOR = BLOCKS.register(DDNames.TALL_ROTTEN_PLANKS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "rotten_planks_door"))));
    
    // Quark
    public static final RegistryObject<Block> SHORT_QUARK_ANCIENT_DOOR = BLOCKS.register(DDNames.SHORT_QUARK_ANCIENT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("quark", "ancient_door"))));
    public static final RegistryObject<Block> SHORT_QUARK_AZALEA_DOOR = BLOCKS.register(DDNames.SHORT_QUARK_AZALEA, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("quark", "azalea_door"))));
    public static final RegistryObject<Block> SHORT_QUARK_BLOSSOM_DOOR = BLOCKS.register(DDNames.SHORT_QUARK_BLOSSOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("quark", "blossom_door"))));

    public static final RegistryObject<Block> TALL_QUARK_ANCIENT_DOOR = BLOCKS.register(DDNames.TALL_QUARK_ANCIENT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "ancient_door"))));
    public static final RegistryObject<Block> TALL_QUARK_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "azalea_door"))));
    public static final RegistryObject<Block> TALL_QUARK_BLOSSOM_DOOR = BLOCKS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "blossom_door"))));

    // Silent Gear
    public static final RegistryObject<Block> SHORT_NETHERWOOD_DOOR = BLOCKS.register(DDNames.SHORT_NETHERWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("silentgear", "netherwood_door"))));

    public static final RegistryObject<Block> TALL_NETHERWOOD_DOOR = BLOCKS.register(DDNames.TALL_NETHERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("silentgear", "netherwood_door"))));
    
    // Snowy Spirit
    public static final RegistryObject<Block> SHORT_GINGERBREAD_DOOR = BLOCKS.register(DDNames.SHORT_GINGERBREAD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door"))));

    public static final RegistryObject<Block> TALL_GINGERBREAD_DOOR = BLOCKS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door"))));
    
    // Supplementaries
    public static final RegistryObject<Block> SHORT_GOLD_DOOR = BLOCKS.register(DDNames.SHORT_GOLD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "gold_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> SHORT_SILVER_DOOR = BLOCKS.register(DDNames.SHORT_SILVER, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "silver_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> SHORT_LEAD_DOOR = BLOCKS.register(DDNames.SHORT_LEAD, () -> new ShortLeadDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "lead_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> SHORT_NETHERITE_DOOR = BLOCKS.register(DDNames.SHORT_NETHERITE, () -> new ShortNetheriteDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "netherite_door"), Blocks.IRON_DOOR)));

    public static final RegistryObject<Block> TALL_GOLD_DOOR = BLOCKS.register(DDNames.TALL_GOLD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "gold_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> TALL_SILVER_DOOR = BLOCKS.register(DDNames.TALL_SILVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "silver_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> TALL_LEAD_DOOR = BLOCKS.register(DDNames.TALL_LEAD, () -> new TallLeadDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "lead_door"), Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> TALL_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_NETHERITE, () -> new TallNetheriteDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "netherite_door"), Blocks.IRON_DOOR)));

    // Tinkers Construct
	public static final RegistryObject<Block> SHORT_BLOODSHROOM_DOOR = BLOCKS.register(DDNames.SHORT_BLOODSHROOM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "bloodshroom_door"))));    
	public static final RegistryObject<Block> SHORT_GREENHEART_DOOR = BLOCKS.register(DDNames.SHORT_GREENHEART, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "greenheart_door"))));    
	public static final RegistryObject<Block> SHORT_SKYROOT_DOOR = BLOCKS.register(DDNames.SHORT_SKYROOT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "skyroot_door"))));
    
	public static final RegistryObject<Block> TALL_BLOODSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BLOODSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "bloodshroom_door"))));    
	public static final RegistryObject<Block> TALL_GREENHEART_DOOR = BLOCKS.register(DDNames.TALL_GREENHEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "greenheart_door"))));    
	public static final RegistryObject<Block> TALL_SKYROOT_DOOR = BLOCKS.register(DDNames.TALL_SKYROOT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "skyroot_door"))));
    
    // Twigs
	public static final RegistryObject<Block> SHORT_TWIGS_BAMBOO_DOOR = BLOCKS.register(DDNames.SHORT_TWIGS_BAMBOO, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("twigs", "bamboo_door"))));    

	public static final RegistryObject<Block> TALL_TWIGS_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twigs", "bamboo_door"))));    
    
    //Undergarden
	public static final RegistryObject<Block> SHORT_GRONGLE_DOOR = BLOCKS.register(DDNames.SHORT_GRONGLE, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "grongle_door"))));
    public static final RegistryObject<Block> SHORT_SMOGSTEM_DOOR = BLOCKS.register(DDNames.SHORT_SMOGSTEM, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "smogstem_door"))));
    public static final RegistryObject<Block> SHORT_WIGGLEWOOD_DOOR = BLOCKS.register(DDNames.SHORT_WIGGLEWOOD, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door"))));
    
	public static final RegistryObject<Block> TALL_GRONGLE_DOOR = BLOCKS.register(DDNames.TALL_GRONGLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "grongle_door"))));
    public static final RegistryObject<Block> TALL_SMOGSTEM_DOOR = BLOCKS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "smogstem_door"))));
    public static final RegistryObject<Block> TALL_WIGGLEWOOD_DOOR = BLOCKS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door"))));

    // Windswept
    public static final RegistryObject<Block> SHORT_CHESTNUT_DOOR = BLOCKS.register(DDNames.SHORT_CHESTNUT, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("windswept", "chestnut_door"))));
    public static final RegistryObject<Block> SHORT_HOLLY_DOOR = BLOCKS.register(DDNames.SHORT_HOLLY, () -> new ShortDoorBlock(getBlockByKey(new ResourceLocation("windswept", "holly_door"))));
    
    public static final RegistryObject<Block> TALL_CHESTNUT_DOOR = BLOCKS.register(DDNames.TALL_CHESTNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("windswept", "chestnut_door"))));
    public static final RegistryObject<Block> TALL_HOLLY_DOOR = BLOCKS.register(DDNames.TALL_HOLLY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("windswept", "holly_door"))));
    
    public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
    public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
    	if (ForgeRegistries.BLOCKS.containsKey(loc)) {
    		return ForgeRegistries.BLOCKS.getValue(loc);
    	}
    	else {
    		return fallback; // Fallback
    	}
    }
}
