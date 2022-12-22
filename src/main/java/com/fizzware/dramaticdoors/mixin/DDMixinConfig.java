package com.fizzware.dramaticdoors.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.DDConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.LoadingModList;

public class DDMixinConfig implements IMixinConfigPlugin
{

	@Override
	public void onLoad(String mixinPackage) {
		DDConfig.loadConfig(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("dramaticdoors-common.toml"));
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.DoorBlockMixin")) {			
			return DDConfig.waterloggableDoors.get();
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.FenceGateBlockMixin")) {
			return DDConfig.waterloggableFenceGates.get();
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.IronGateBlockMixin")) {
			return DDConfig.waterloggableFenceGates.get() && LoadingModList.get().getModFileById("supplementaries") != null;
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

	@Override
	public List<String> getMixins() {
		return null; 
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

}
