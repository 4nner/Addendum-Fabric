package com.github.EltrutCo.addendum.registry;

import com.github.EltrutCo.addendum.Addendum;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AddendumBlocks {
    // End Stone
    public static final SlabBlock END_STONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE));
    public static final StairsBlock END_STONE_STAIRS = new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.END_STONE));
    public static final WallBlock END_STONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.END_STONE));

    public static final Block POLISHED_END_STONE = new Block(FabricBlockSettings.copy(Blocks.END_STONE));
    public static final SlabBlock POLISHED_END_STONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE));
    public static final StairsBlock POLISHED_END_STONE_STAIRS = new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copy(Blocks.END_STONE));

    public static final WallBlock POLISHED_END_STONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.END_STONE));

    public static final Block CHORUSY_END_STONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS));

    // Purpur
    public static final Block PURPUR_BRICKS = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));
    public static final SlabBlock PURPUR_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));
    public static final StairsBlock PURPUR_BRICK_STAIRS = new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));
    public static final WallBlock PURPUR_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));

    public static final Block CHISELED_PURPUR_BRICKS = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));
    public static final Block POPPED_CHORUS_FRUIT_BLOCK = new Block(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL));

    // Shulker
    public static final Block SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.SHULKER_BOX));
    public static final Block SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.SHULKER_BOX));

    public static final Block WHITE_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.WHITE_SHULKER_BOX));
    public static final Block WHITE_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.WHITE_SHULKER_BOX));
    public static final Block ORANGE_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.ORANGE_SHULKER_BOX));
    public static final Block ORANGE_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.ORANGE_SHULKER_BOX));
    public static final Block MAGENTA_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.MAGENTA_SHULKER_BOX));
    public static final Block MAGENTA_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.MAGENTA_SHULKER_BOX));
    public static final Block LIGHT_BLUE_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_SHULKER_BOX));
    public static final Block LIGHT_BLUE_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_SHULKER_BOX));
    public static final Block YELLOW_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.YELLOW_SHULKER_BOX));
    public static final Block YELLOW_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.YELLOW_SHULKER_BOX));
    public static final Block LIME_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.LIME_SHULKER_BOX));
    public static final Block LIME_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.LIME_SHULKER_BOX));
    public static final Block PINK_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.PINK_SHULKER_BOX));
    public static final Block PINK_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.PINK_SHULKER_BOX));
    public static final Block GRAY_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GRAY_SHULKER_BOX));
    public static final Block GRAY_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.GRAY_SHULKER_BOX));
    public static final Block LIGHT_GRAY_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_SHULKER_BOX));
    public static final Block LIGHT_GRAY_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_SHULKER_BOX));
    public static final Block CYAN_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.CYAN_SHULKER_BOX));
    public static final Block CYAN_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.CYAN_SHULKER_BOX));
    public static final Block PURPLE_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.PURPLE_SHULKER_BOX));
    public static final Block PURPLE_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.PURPLE_SHULKER_BOX));
    public static final Block BLUE_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.BLUE_SHULKER_BOX));
    public static final Block BLUE_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.BLUE_SHULKER_BOX));
    public static final Block BROWN_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.BROWN_SHULKER_BOX));
    public static final Block BROWN_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.BROWN_SHULKER_BOX));
    public static final Block GREEN_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.GREEN_SHULKER_BOX));
    public static final Block GREEN_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.GREEN_SHULKER_BOX));
    public static final Block RED_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.RED_SHULKER_BOX));
    public static final Block RED_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.RED_SHULKER_BOX));
    public static final Block BLACK_SHULKER_BLOCK = new Block(FabricBlockSettings.copy(Blocks.BLACK_SHULKER_BOX));
    public static final Block BLACK_SHULKER_SWIRL = new Block(FabricBlockSettings.copy(Blocks.BLACK_SHULKER_BOX));

    public static void init() {
        // End Stone
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "end_stone_slab"), END_STONE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "end_stone_stairs"), END_STONE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "end_stone_wall"), END_STONE_WALL);

        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "polished_end_stone"), POLISHED_END_STONE);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "polished_end_stone_slab"), POLISHED_END_STONE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "polished_end_stone_stairs"), POLISHED_END_STONE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "polished_end_stone_wall"), POLISHED_END_STONE_WALL);

        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "chorusy_end_stone_bricks"), CHORUSY_END_STONE_BRICKS);

        // Purpur
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purpur_bricks"), PURPUR_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purpur_brick_slab"), PURPUR_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purpur_brick_stairs"), PURPUR_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purpur_brick_wall"), PURPUR_BRICK_WALL);

        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "chiseled_purpur_bricks"), CHISELED_PURPUR_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "popped_chorus_fruit_block"), POPPED_CHORUS_FRUIT_BLOCK);

        //Shulker
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "shulker_block"), SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "shulker_swirl"), SHULKER_SWIRL);

        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "white_shulker_block"), WHITE_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "white_shulker_swirl"), WHITE_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "orange_shulker_block"), ORANGE_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "orange_shulker_swirl"), ORANGE_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "magenta_shulker_block"), MAGENTA_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "magenta_shulker_swirl"), MAGENTA_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "light_blue_shulker_block"), LIGHT_BLUE_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "light_blue_shulker_swirl"), LIGHT_BLUE_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "yellow_shulker_block"), YELLOW_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "yellow_shulker_swirl"), YELLOW_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "lime_shulker_block"), LIME_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "lime_shulker_swirl"), LIME_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "pink_shulker_block"), PINK_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "pink_shulker_swirl"), PINK_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "gray_shulker_block"), GRAY_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "gray_shulker_swirl"), GRAY_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "light_gray_shulker_block"), LIGHT_GRAY_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "light_gray_shulker_swirl"), LIGHT_GRAY_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "cyan_shulker_block"), CYAN_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "cyan_shulker_swirl"), CYAN_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purple_shulker_block"), PURPLE_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "purple_shulker_swirl"), PURPLE_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "blue_shulker_block"), BLUE_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "blue_shulker_swirl"), BLUE_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "brown_shulker_block"), BROWN_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "brown_shulker_swirl"), BROWN_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "green_shulker_block"), GREEN_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "green_shulker_swirl"), GREEN_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "red_shulker_block"), RED_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "red_shulker_swirl"), RED_SHULKER_SWIRL);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "black_shulker_block"), BLACK_SHULKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Addendum.MODID, "black_shulker_swirl"), BLACK_SHULKER_SWIRL);
    }
}