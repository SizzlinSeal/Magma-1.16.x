/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

import net.minecraft.block.BubbleColumnBlock;

public final class CraftBubbleColumn extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.BubbleColumn {

    public CraftBubbleColumn() {
        super();
    }

    public CraftBubbleColumn(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftBubbleColumn

    private static final net.minecraft.state.BooleanProperty DRAG = getBoolean(BubbleColumnBlock.class, "drag");

    @Override
    public boolean isDrag() {
        return get(DRAG);
    }

    @Override
    public void setDrag(boolean drag) {
        set(DRAG, drag);
    }
}
