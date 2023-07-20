package com.github.EltrutCo.addendum.registry;

import com.github.EltrutCo.addendum.Addendum;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AddendumItemGroup {
    public static final ItemGroup ADDENDUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Addendum.MODID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.addendum"))
                    .icon(() -> new ItemStack(AddendumItems.CHORUSY_END_STONE_BRICKS_ITEM)).entries((displayContext, entries) -> {
                        entries.add(AddendumItems.END_STONE_SLAB_ITEM);
                        entries.add(AddendumItems.END_STONE_STAIRS_ITEM);
                        entries.add(AddendumItems.END_STONE_WALL_ITEM);
                        entries.add(AddendumItems.POLISHED_END_STONE_ITEM);
                        entries.add(AddendumItems.POLISHED_END_STONE_SLAB_ITEM);
                        entries.add(AddendumItems.POLISHED_END_STONE_STAIRS_ITEM);
                        entries.add(AddendumItems.POLISHED_END_STONE_WALL_ITEM);
                        entries.add(AddendumItems.CHORUSY_END_STONE_BRICKS_ITEM);
                        entries.add(AddendumItems.PURPUR_BRICKS_ITEM);
                        entries.add(AddendumItems.PURPUR_BRICK_SLAB_ITEM);
                        entries.add(AddendumItems.PURPUR_BRICK_STAIRS_ITEM);
                        entries.add(AddendumItems.PURPUR_BRICK_WALL_ITEM);
                        entries.add(AddendumItems.CHISELED_PURPUR_BRICKS_ITEM);
                        entries.add(AddendumItems.POPPED_CHORUS_FRUIT_BLOCK_ITEM);
                        entries.add(AddendumItems.SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.WHITE_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.WHITE_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.ORANGE_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.ORANGE_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.MAGENTA_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.MAGENTA_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.LIGHT_BLUE_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.LIGHT_BLUE_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.YELLOW_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.YELLOW_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.LIME_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.LIME_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.PINK_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.PINK_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.GRAY_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.GRAY_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.LIGHT_GRAY_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.LIGHT_GRAY_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.CYAN_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.CYAN_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.PURPLE_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.PURPLE_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.BLUE_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.BLUE_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.BROWN_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.BROWN_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.GREEN_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.GREEN_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.RED_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.RED_SHULKER_SWIRL_ITEM);
                        entries.add(AddendumItems.BLACK_SHULKER_BLOCK_ITEM);
                        entries.add(AddendumItems.BLACK_SHULKER_SWIRL_ITEM);
                    }).build());


    public static void registerItemGroups() {
        Addendum.LOGGER.info("Registering Item Groups for " + Addendum.MODID);
    }
}
