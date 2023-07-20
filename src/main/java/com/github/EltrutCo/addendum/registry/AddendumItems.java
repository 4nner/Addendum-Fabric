package com.github.EltrutCo.addendum.registry;

import com.github.EltrutCo.addendum.Addendum;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AddendumItems {
    // End Stone
    public static final Item END_STONE_SLAB_ITEM = new BlockItem(AddendumBlocks.END_STONE_SLAB, new Item.Settings());
    public static final Item END_STONE_STAIRS_ITEM = new BlockItem(AddendumBlocks.END_STONE_STAIRS, new Item.Settings());
    public static final Item END_STONE_WALL_ITEM = new BlockItem(AddendumBlocks.END_STONE_WALL, new Item.Settings());

    public static final Item POLISHED_END_STONE_ITEM = new BlockItem(AddendumBlocks.POLISHED_END_STONE, new Item.Settings());
    public static final Item POLISHED_END_STONE_SLAB_ITEM = new BlockItem(AddendumBlocks.POLISHED_END_STONE_SLAB, new Item.Settings());
    public static final Item POLISHED_END_STONE_STAIRS_ITEM = new BlockItem(AddendumBlocks.POLISHED_END_STONE_STAIRS, new Item.Settings());
    public static final Item POLISHED_END_STONE_WALL_ITEM = new BlockItem(AddendumBlocks.POLISHED_END_STONE_WALL, new Item.Settings());

    public static final Item CHORUSY_END_STONE_BRICKS_ITEM = new BlockItem(AddendumBlocks.CHORUSY_END_STONE_BRICKS, new Item.Settings());

    // Purpur
    public static final Item PURPUR_BRICKS_ITEM = new BlockItem(AddendumBlocks.PURPUR_BRICKS, new Item.Settings());
    public static final Item PURPUR_BRICK_SLAB_ITEM = new BlockItem(AddendumBlocks.PURPUR_BRICK_SLAB, new Item.Settings());
    public static final Item PURPUR_BRICK_STAIRS_ITEM = new BlockItem(AddendumBlocks.PURPUR_BRICK_STAIRS, new Item.Settings());
    public static final Item PURPUR_BRICK_WALL_ITEM = new BlockItem(AddendumBlocks.PURPUR_BRICK_WALL, new Item.Settings());

    public static final Item CHISELED_PURPUR_BRICKS_ITEM = new BlockItem(AddendumBlocks.CHISELED_PURPUR_BRICKS, new Item.Settings());
    public static final Item POPPED_CHORUS_FRUIT_BLOCK_ITEM = new BlockItem(AddendumBlocks.POPPED_CHORUS_FRUIT_BLOCK, new Item.Settings());

    // Shulker
    public static final Item SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.SHULKER_BLOCK, new Item.Settings());
    public static final Item SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.SHULKER_SWIRL, new Item.Settings());

    public static final Item WHITE_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.WHITE_SHULKER_BLOCK, new Item.Settings());
    public static final Item WHITE_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.WHITE_SHULKER_SWIRL, new Item.Settings());
    public static final Item ORANGE_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.ORANGE_SHULKER_BLOCK, new Item.Settings());
    public static final Item ORANGE_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.ORANGE_SHULKER_SWIRL, new Item.Settings());
    public static final Item MAGENTA_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.MAGENTA_SHULKER_BLOCK, new Item.Settings());
    public static final Item MAGENTA_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.MAGENTA_SHULKER_SWIRL, new Item.Settings());
    public static final Item LIGHT_BLUE_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.LIGHT_BLUE_SHULKER_BLOCK, new Item.Settings());
    public static final Item LIGHT_BLUE_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.LIGHT_BLUE_SHULKER_SWIRL, new Item.Settings());
    public static final Item YELLOW_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.YELLOW_SHULKER_BLOCK, new Item.Settings());
    public static final Item YELLOW_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.YELLOW_SHULKER_SWIRL, new Item.Settings());
    public static final Item LIME_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.LIME_SHULKER_BLOCK, new Item.Settings());
    public static final Item LIME_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.LIME_SHULKER_SWIRL, new Item.Settings());
    public static final Item PINK_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.PINK_SHULKER_BLOCK, new Item.Settings());
    public static final Item PINK_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.PINK_SHULKER_SWIRL, new Item.Settings());
    public static final Item GRAY_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.GRAY_SHULKER_BLOCK, new Item.Settings());
    public static final Item GRAY_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.GRAY_SHULKER_SWIRL, new Item.Settings());
    public static final Item LIGHT_GRAY_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.LIGHT_GRAY_SHULKER_BLOCK, new Item.Settings());
    public static final Item LIGHT_GRAY_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.LIGHT_GRAY_SHULKER_SWIRL, new Item.Settings());
    public static final Item CYAN_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.CYAN_SHULKER_BLOCK, new Item.Settings());
    public static final Item CYAN_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.CYAN_SHULKER_SWIRL, new Item.Settings());
    public static final Item PURPLE_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.PURPLE_SHULKER_BLOCK, new Item.Settings());
    public static final Item PURPLE_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.PURPLE_SHULKER_SWIRL, new Item.Settings());
    public static final Item BLUE_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.BLUE_SHULKER_BLOCK, new Item.Settings());
    public static final Item BLUE_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.BLUE_SHULKER_SWIRL, new Item.Settings());
    public static final Item BROWN_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.BROWN_SHULKER_BLOCK, new Item.Settings());
    public static final Item BROWN_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.BROWN_SHULKER_SWIRL, new Item.Settings());
    public static final Item GREEN_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.GREEN_SHULKER_BLOCK, new Item.Settings());
    public static final Item GREEN_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.GREEN_SHULKER_SWIRL, new Item.Settings());
    public static final Item RED_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.RED_SHULKER_BLOCK, new Item.Settings());
    public static final Item RED_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.RED_SHULKER_SWIRL, new Item.Settings());
    public static final Item BLACK_SHULKER_BLOCK_ITEM = new BlockItem(AddendumBlocks.BLACK_SHULKER_BLOCK, new Item.Settings());
    public static final Item BLACK_SHULKER_SWIRL_ITEM = new BlockItem(AddendumBlocks.BLACK_SHULKER_SWIRL, new Item.Settings());

    public static void init() {
        // End Stone
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "end_stone_slab"), END_STONE_SLAB_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "end_stone_stairs"), END_STONE_STAIRS_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "end_stone_wall"), END_STONE_WALL_ITEM);

        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "polished_end_stone"), POLISHED_END_STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "polished_end_stone_slab"), POLISHED_END_STONE_SLAB_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "polished_end_stone_stairs"), POLISHED_END_STONE_STAIRS_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "polished_end_stone_wall"), POLISHED_END_STONE_WALL_ITEM);

        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "chorusy_end_stone_bricks"), CHORUSY_END_STONE_BRICKS_ITEM);

        // Purpur
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purpur_bricks"), PURPUR_BRICKS_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purpur_brick_slab"), PURPUR_BRICK_SLAB_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purpur_brick_stairs"), PURPUR_BRICK_STAIRS_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purpur_brick_wall"), PURPUR_BRICK_WALL_ITEM);

        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "chiseled_purpur_bricks"), CHISELED_PURPUR_BRICKS_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "popped_chorus_fruit_block"), POPPED_CHORUS_FRUIT_BLOCK_ITEM);

        //Shulker
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "shulker_block"), SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "shulker_swirl"), SHULKER_SWIRL_ITEM);

        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "white_shulker_block"), WHITE_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "white_shulker_swirl"), WHITE_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "orange_shulker_block"), ORANGE_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "orange_shulker_swirl"), ORANGE_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "magenta_shulker_block"), MAGENTA_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "magenta_shulker_swirl"), MAGENTA_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "light_blue_shulker_block"), LIGHT_BLUE_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "light_blue_shulker_swirl"), LIGHT_BLUE_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "yellow_shulker_block"), YELLOW_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "yellow_shulker_swirl"), YELLOW_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "lime_shulker_block"), LIME_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "lime_shulker_swirl"), LIME_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "pink_shulker_block"), PINK_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "pink_shulker_swirl"), PINK_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "gray_shulker_block"), GRAY_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "gray_shulker_swirl"), GRAY_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "light_gray_shulker_block"), LIGHT_GRAY_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "light_gray_shulker_swirl"), LIGHT_GRAY_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "cyan_shulker_block"), CYAN_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "cyan_shulker_swirl"), CYAN_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purple_shulker_block"), PURPLE_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "purple_shulker_swirl"), PURPLE_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "blue_shulker_block"), BLUE_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "blue_shulker_swirl"), BLUE_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "brown_shulker_block"), BROWN_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "brown_shulker_swirl"), BROWN_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "green_shulker_block"), GREEN_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "green_shulker_swirl"), GREEN_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "red_shulker_block"), RED_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "red_shulker_swirl"), RED_SHULKER_SWIRL_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "black_shulker_block"), BLACK_SHULKER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Addendum.MODID, "black_shulker_swirl"), BLACK_SHULKER_SWIRL_ITEM);
    }
}