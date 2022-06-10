package com.fizzware.dramaticdoors.state.properties;

import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class DDBlockStateProperties extends BlockStateProperties {
   public static final EnumProperty<TripleBlockPart> TRIPLE_BLOCK_THIRD = EnumProperty.create("third", TripleBlockPart.class);
   public static final IntegerProperty OPENING_PROGRESS = IntegerProperty.create("tall_lead_progress", 0, 2);
}