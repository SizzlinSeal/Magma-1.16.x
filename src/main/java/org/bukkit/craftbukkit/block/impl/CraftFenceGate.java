/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

import net.minecraft.block.FenceGateBlock;

public final class CraftFenceGate extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.Gate, org.bukkit.block.data.Directional, org.bukkit.block.data.Openable, org.bukkit.block.data.Powerable {

    public CraftFenceGate() {
        super();
    }

    public CraftFenceGate(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftGate

    private static final net.minecraft.state.BooleanProperty IN_WALL = getBoolean(FenceGateBlock.class, "in_wall");

    @Override
    public boolean isInWall() {
        return get(IN_WALL);
    }

    @Override
    public void setInWall(boolean inWall) {
        set(IN_WALL, inWall);
    }

    // org.bukkit.craftbukkit.block.data.CraftDirectional

    private static final net.minecraft.state.EnumProperty<?> FACING = getEnum(FenceGateBlock.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }

    // org.bukkit.craftbukkit.block.data.CraftOpenable

    private static final net.minecraft.state.BooleanProperty OPEN = getBoolean(FenceGateBlock.class, "open");

    @Override
    public boolean isOpen() {
        return get(OPEN);
    }

    @Override
    public void setOpen(boolean open) {
        set(OPEN, open);
    }

    // org.bukkit.craftbukkit.block.data.CraftPowerable

    private static final net.minecraft.state.BooleanProperty POWERED = getBoolean(FenceGateBlock.class, "powered");

    @Override
    public boolean isPowered() {
        return get(POWERED);
    }

    @Override
    public void setPowered(boolean powered) {
        set(POWERED, powered);
    }
}
