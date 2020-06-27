/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

import net.minecraft.block.SeaPickleBlock;

public final class CraftSeaPickle extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.SeaPickle, org.bukkit.block.data.Waterlogged {

    public CraftSeaPickle() {
        super();
    }

    public CraftSeaPickle(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftSeaPickle

    private static final net.minecraft.state.IntegerProperty PICKLES = getInteger(SeaPickleBlock.class, "pickles");

    @Override
    public int getPickles() {
        return get(PICKLES);
    }

    @Override
    public void setPickles(int pickles) {
        set(PICKLES, pickles);
    }

    @Override
    public int getMinimumPickles() {
        return getMin(PICKLES);
    }

    @Override
    public int getMaximumPickles() {
        return getMax(PICKLES);
    }

    // org.bukkit.craftbukkit.block.data.CraftWaterlogged

    private static final net.minecraft.state.BooleanProperty WATERLOGGED = getBoolean(SeaPickleBlock.class, "waterlogged");

    @Override
    public boolean isWaterlogged() {
        return get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(boolean waterlogged) {
        set(WATERLOGGED, waterlogged);
    }
}
