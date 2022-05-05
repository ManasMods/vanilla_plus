package com.manasmods.vanilla_plus.data;

import com.github.manasmods.manascore.data.gen.BlockStateProvider;
import com.manasmods.vanilla_plus.Vanilla_Plus;
import com.manasmods.vanilla_plus.block.Vanilla_PlusBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;


public class Vanilla_PlusBlockStateProvider extends BlockStateProvider {

    public Vanilla_PlusBlockStateProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, Vanilla_Plus.MOD_ID);
    }

    @Override
    protected void generate() {

        //STAIRS
        {
            stairs(Vanilla_PlusBlocks.CALCITE_STAIRS, Blocks.CALCITE);
            stairs(Vanilla_PlusBlocks.TUFF_STAIRS, Blocks.TUFF);
            stairs(Vanilla_PlusBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
            stairs(Vanilla_PlusBlocks.GRASS_BLOCK_STAIRS, mcLoc("block/grass_block_top"), mcLoc("block/dirt"), mcLoc("block/grass_block_side"), mcLoc("block/grass_block_side_overlay"));
            stairs(Vanilla_PlusBlocks.DIRT_STAIRS, Blocks.DIRT);
            stairs(Vanilla_PlusBlocks.COARSE_DIRT_STAIRS, Blocks.COARSE_DIRT);
            stairs(Vanilla_PlusBlocks.PODZOL_STAIRS, mcLoc("block/podzol_side"), mcLoc("block/dirt"), mcLoc("block/podzol_top"));
            stairs(Vanilla_PlusBlocks.ROOTED_DIRT_STAIRS, Blocks.ROOTED_DIRT);
            stairs(Vanilla_PlusBlocks.CRIMSON_NYLIUM_STAIRS, mcLoc("block/crimson_nylium_side"), mcLoc("block/crimson_nylium"));
            stairs(Vanilla_PlusBlocks.WARPED_NYLIUM_STAIRS, mcLoc("block/warped_nylium_side"), mcLoc("block/warped_nylium"));
            stairs(Vanilla_PlusBlocks.SAND_STAIRS, Blocks.SAND);
            stairs(Vanilla_PlusBlocks.RED_SAND_STAIRS, Blocks.RED_SAND);
            stairs(Vanilla_PlusBlocks.GRAVEL_STAIRS, Blocks.GRAVEL);
            stairs(Vanilla_PlusBlocks.BLOCK_OF_RAW_IRON_STAIRS, Blocks.RAW_IRON_BLOCK);
            stairs(Vanilla_PlusBlocks.BLOCK_OF_RAW_COPPER_STAIRS, Blocks.RAW_COPPER_BLOCK);
            stairs(Vanilla_PlusBlocks.BLOCK_OF_RAW_GOLD_STAIRS, Blocks.RAW_GOLD_BLOCK);
            stairs(Vanilla_PlusBlocks.BLOCK_OF_AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
            stairs(Vanilla_PlusBlocks.OAK_LOG_STAIRS, mcLoc("block/oak_log"), mcLoc("block/oak_log_top"));
            stairs(Vanilla_PlusBlocks.SPRUCE_LOG_STAIRS, mcLoc("block/spruce_log"), mcLoc("block/spruce_log_top"));
            stairs(Vanilla_PlusBlocks.BIRCH_LOG_STAIRS, mcLoc("block/birch_log"), mcLoc("block/birch_log_top"));
            stairs(Vanilla_PlusBlocks.JUNGLE_LOG_STAIRS, mcLoc("block/jungle_log"), mcLoc("block/jungle_log_top"));
            stairs(Vanilla_PlusBlocks.ACACIA_LOG_STAIRS, mcLoc("block/acacia_log"), mcLoc("block/acacia_log_top"));
            stairs(Vanilla_PlusBlocks.DARK_OAK_LOG_STAIRS, mcLoc("block/dark_oak_log"), mcLoc("block/dark_oak_log_top"));
            stairs(Vanilla_PlusBlocks.CRIMSON_STEM_STAIRS, mcLoc("block/crimson_stem"), mcLoc("block/crimson_stem_top"));
            stairs(Vanilla_PlusBlocks.WARPED_STEM_STAIRS, mcLoc("block/warped_stem"), mcLoc("block/warped_stem_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_OAK_LOG_STAIRS, mcLoc("block/stripped_oak_log"), mcLoc("block/stripped_oak_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_SPRUCE_LOG_STAIRS, mcLoc("block/stripped_spruce_log"), mcLoc("block/stripped_spruce_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_BIRCH_LOG_STAIRS, mcLoc("block/stripped_birch_log"), mcLoc("block/stripped_birch_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_JUNGLE_LOG_STAIRS, mcLoc("block/stripped_jungle_log"), mcLoc("block/stripped_jungle_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_ACACIA_LOG_STAIRS, mcLoc("block/stripped_acacia_log"), mcLoc("block/stripped_acacia_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_DARK_OAK_LOG_STAIRS, mcLoc("block/stripped_dark_oak_log"), mcLoc("block/stripped_dark_oak_log_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_CRIMSON_STEM_STAIRS, mcLoc("block/stripped_crimson_stem"), mcLoc("block/stripped_crimson_stem_top"));
            stairs(Vanilla_PlusBlocks.STRIPPED_WARPED_STEM_STAIRS, mcLoc("block/stripped_warped_stem"), mcLoc("block/stripped_warped_stem_top"));
            stairs(Vanilla_PlusBlocks.GLASS_STAIRS, Blocks.GLASS);
            stairs(Vanilla_PlusBlocks.TINTED_GLASS_STAIRS, Blocks.TINTED_GLASS);
            stairs(Vanilla_PlusBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
            stairs(Vanilla_PlusBlocks.OBSIDIAN_STAIRS, Blocks.OBSIDIAN);
            stairs(Vanilla_PlusBlocks.PURPUR_PILLAR_STAIRS, mcLoc("block/purpur_pillar"), mcLoc("block/purpur_pillar_top"));
            stairs(Vanilla_PlusBlocks.ICE_STAIRS, Blocks.ICE);
            stairs(Vanilla_PlusBlocks.SNOW_STAIRS, Blocks.SNOW);
            stairs(Vanilla_PlusBlocks.CLAY_STAIRS, Blocks.CLAY);
            stairs(Vanilla_PlusBlocks.PUMPKIN_STAIRS, mcLoc("block/pumpkin_side"), mcLoc("block/pumpkin_top"));
            stairs(Vanilla_PlusBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
            stairs(Vanilla_PlusBlocks.SOUL_SAND_STAIRS, Blocks.SOUL_SAND);
            stairs(Vanilla_PlusBlocks.SOUL_SOIL_STAIRS, Blocks.SOUL_SOIL);
            stairs(Vanilla_PlusBlocks.BASALT_STAIRS, mcLoc("block/basalt_side"), mcLoc("block/basalt_top"));
            stairs(Vanilla_PlusBlocks.POLISHED_BASALT_STAIRS, mcLoc("block/polished_basalt_side"), mcLoc("block/polished_basalt_top"));
            stairs(Vanilla_PlusBlocks.GLOWSTONE_STAIRS, Blocks.GLOWSTONE);
            stairs(Vanilla_PlusBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
            stairs(Vanilla_PlusBlocks.CHISELED_STONE_BRICK_STAIRS, Blocks.CHISELED_STONE_BRICKS);
            stairs(Vanilla_PlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
            stairs(Vanilla_PlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);
            stairs(Vanilla_PlusBlocks.CHISELED_DEEPSLATE_STAIRS, Blocks.CHISELED_DEEPSLATE);
            stairs(Vanilla_PlusBlocks.MELON_STAIRS, mcLoc("block/melon_side"), mcLoc("block/melon_top"));
            stairs(Vanilla_PlusBlocks.MYCELIUM_STAIRS, mcLoc("block/mycelium_side"), mcLoc("block/mycelium_top"));
            stairs(Vanilla_PlusBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
            stairs(Vanilla_PlusBlocks.CHISELED_NETHER_BRICK_STAIRS, Blocks.CHISELED_NETHER_BRICKS);
            stairs(Vanilla_PlusBlocks.END_STONE_STAIRS, Blocks.END_STONE);
            stairs(Vanilla_PlusBlocks.CHISELED_QUARTZ_BLOCK_STAIRS, Blocks.CHISELED_QUARTZ_BLOCK);
            stairs(Vanilla_PlusBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
            stairs(Vanilla_PlusBlocks.QUARTZ_PILLAR_STAIRS, mcLoc("block/quartz_pillar"), mcLoc("block/quartz_pillar_top"));
            stairs(Vanilla_PlusBlocks.HAY_BALE_STAIRS, mcLoc("block/hay_block_side"), mcLoc("block/hay_block_top"));
            stairs(Vanilla_PlusBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
            stairs(Vanilla_PlusBlocks.PACKED_ICE_STAIRS, Blocks.PACKED_ICE);
            stairs(Vanilla_PlusBlocks.SEA_LANTERN_STAIRS, Blocks.SEA_LANTERN);
            stairs(Vanilla_PlusBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);
            stairs(Vanilla_PlusBlocks.MAGMA_BLOCK_STAIRS, mcLoc("block/magma"), mcLoc("block/magma"));
            stairs(Vanilla_PlusBlocks.NETHER_WART_BLOCK_STAIRS, Blocks.NETHER_WART_BLOCK);
            stairs(Vanilla_PlusBlocks.WARPED_WART_BLOCK_STAIRS, Blocks.WARPED_WART_BLOCK);
            stairs(Vanilla_PlusBlocks.BONE_BLOCK_STAIRS, mcLoc("block/bone_block_side"), mcLoc("block/bone_block_top"));
            stairs(Vanilla_PlusBlocks.BLUE_ICE_STAIRS, Blocks.BLUE_ICE);
            stairs(Vanilla_PlusBlocks.DRIED_KELP_STAIRS, mcLoc("block/dried_kelp_side"), mcLoc("block/dried_kelp_top"));
            stairs(Vanilla_PlusBlocks.CRYING_OBSIDIAN_STAIRS, Blocks.CRYING_OBSIDIAN);
            stairs(Vanilla_PlusBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

            stairs(Vanilla_PlusBlocks.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL);
            stairs(Vanilla_PlusBlocks.ORANGE_WOOL_STAIRS, Blocks.ORANGE_WOOL);
            stairs(Vanilla_PlusBlocks.MAGENTA_WOOL_STAIRS, Blocks.MAGENTA_WOOL);
            stairs(Vanilla_PlusBlocks.LIGHT_BLUE_WOOL_STAIRS, Blocks.LIGHT_BLUE_WOOL);
            stairs(Vanilla_PlusBlocks.YELLOW_WOOL_STAIRS, Blocks.YELLOW_WOOL);
            stairs(Vanilla_PlusBlocks.LIME_WOOL_STAIRS, Blocks.LIME_WOOL);
            stairs(Vanilla_PlusBlocks.PINK_WOOL_STAIRS, Blocks.PINK_WOOL);
            stairs(Vanilla_PlusBlocks.GRAY_WOOL_STAIRS, Blocks.GRAY_WOOL);
            stairs(Vanilla_PlusBlocks.LIGHT_GRAY_WOOL_STAIRS, Blocks.LIGHT_GRAY_WOOL);
            stairs(Vanilla_PlusBlocks.CYAN_WOOL_STAIRS, Blocks.CYAN_WOOL);
            stairs(Vanilla_PlusBlocks.PURPLE_WOOL_STAIRS, Blocks.PURPLE_WOOL);
            stairs(Vanilla_PlusBlocks.BLUE_WOOL_STAIRS, Blocks.BLUE_WOOL);
            stairs(Vanilla_PlusBlocks.BROWN_WOOL_STAIRS, Blocks.BROWN_WOOL);
            stairs(Vanilla_PlusBlocks.GREEN_WOOL_STAIRS, Blocks.GREEN_WOOL);
            stairs(Vanilla_PlusBlocks.RED_WOOL_STAIRS, Blocks.RED_WOOL);
            stairs(Vanilla_PlusBlocks.BLACK_WOOL_STAIRS, Blocks.BLACK_WOOL);
            stairs(Vanilla_PlusBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
            stairs(Vanilla_PlusBlocks.WHITE_STAINED_GLASS_STAIRS, Blocks.WHITE_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.ORANGE_STAINED_GLASS_STAIRS, Blocks.ORANGE_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.MAGENTA_STAINED_GLASS_STAIRS, Blocks.MAGENTA_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, Blocks.LIGHT_BLUE_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.YELLOW_STAINED_GLASS_STAIRS, Blocks.YELLOW_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.LIME_STAINED_GLASS_STAIRS, Blocks.LIME_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.PINK_STAINED_GLASS_STAIRS, Blocks.PINK_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.GRAY_STAINED_GLASS_STAIRS, Blocks.GRAY_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, Blocks.LIGHT_GRAY_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.CYAN_STAINED_GLASS_STAIRS, Blocks.CYAN_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.PURPLE_STAINED_GLASS_STAIRS, Blocks.PURPLE_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.BLUE_STAINED_GLASS_STAIRS, Blocks.BLUE_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.BROWN_STAINED_GLASS_STAIRS, Blocks.BROWN_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.GREEN_STAINED_GLASS_STAIRS, Blocks.GREEN_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.RED_STAINED_GLASS_STAIRS, Blocks.RED_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.BLACK_STAINED_GLASS_STAIRS, Blocks.BLACK_STAINED_GLASS);
            stairs(Vanilla_PlusBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
            stairs(Vanilla_PlusBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
            stairs(Vanilla_PlusBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
            stairs(Vanilla_PlusBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
            stairs(Vanilla_PlusBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
            stairs(Vanilla_PlusBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
            stairs(Vanilla_PlusBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
            stairs(Vanilla_PlusBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
            stairs(Vanilla_PlusBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
            stairs(Vanilla_PlusBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
            stairs(Vanilla_PlusBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
            stairs(Vanilla_PlusBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
            stairs(Vanilla_PlusBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
            stairs(Vanilla_PlusBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
            stairs(Vanilla_PlusBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
            stairs(Vanilla_PlusBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
            stairs(Vanilla_PlusBlocks.WHITE_CONCRETE_POWDER_STAIRS, Blocks.WHITE_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.ORANGE_CONCRETE_POWDER_STAIRS, Blocks.ORANGE_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.MAGENTA_CONCRETE_POWDER_STAIRS, Blocks.MAGENTA_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.YELLOW_CONCRETE_POWDER_STAIRS, Blocks.YELLOW_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.LIME_CONCRETE_POWDER_STAIRS, Blocks.LIME_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.PINK_CONCRETE_POWDER_STAIRS, Blocks.PINK_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.GRAY_CONCRETE_POWDER_STAIRS, Blocks.GRAY_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.CYAN_CONCRETE_POWDER_STAIRS, Blocks.CYAN_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.PURPLE_CONCRETE_POWDER_STAIRS, Blocks.PURPLE_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.BLUE_CONCRETE_POWDER_STAIRS, Blocks.BLUE_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.BROWN_CONCRETE_POWDER_STAIRS, Blocks.BROWN_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.GREEN_CONCRETE_POWDER_STAIRS, Blocks.GREEN_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.RED_CONCRETE_POWDER_STAIRS, Blocks.RED_CONCRETE_POWDER);
            stairs(Vanilla_PlusBlocks.BLACK_CONCRETE_POWDER_STAIRS, Blocks.BLACK_CONCRETE_POWDER);
        }

        //SLABS
        {
            slab(Vanilla_PlusBlocks.CALCITE_SLAB, Blocks.CALCITE);
            slab(Vanilla_PlusBlocks.TUFF_SLAB, Blocks.TUFF);
            slab(Vanilla_PlusBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
            slab(Vanilla_PlusBlocks.GRASS_BLOCK_SLAB, Blocks.GRASS_BLOCK, mcLoc("block/grass_block_top"), mcLoc("block/dirt"), mcLoc("block/grass_block_side"),
                mcLoc("block/grass_block_side_overlay"));
            slab(Vanilla_PlusBlocks.DIRT_SLAB, Blocks.DIRT);
            slab(Vanilla_PlusBlocks.COARSE_DIRT_SLAB, Blocks.COARSE_DIRT);
            slab(Vanilla_PlusBlocks.PODZOL_SLAB, Blocks.PODZOL, mcLoc("block/podzol_side"), mcLoc("block/dirt"), mcLoc("block/podzol_top"));
            slab(Vanilla_PlusBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
            slab(Vanilla_PlusBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM, mcLoc("block/crimson_nylium_side"), mcLoc("block/crimson_nylium"));
            slab(Vanilla_PlusBlocks.WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM, mcLoc("block/warped_nylium_side"), mcLoc("block/warped_nylium"));
            slab(Vanilla_PlusBlocks.SAND_SLAB, Blocks.SAND);
            slab(Vanilla_PlusBlocks.RED_SAND_SLAB, Blocks.RED_SAND);
            slab(Vanilla_PlusBlocks.GRAVEL_SLAB, Blocks.GRAVEL);
            slab(Vanilla_PlusBlocks.BLOCK_OF_RAW_IRON_SLAB, Blocks.RAW_IRON_BLOCK);
            slab(Vanilla_PlusBlocks.BLOCK_OF_RAW_COPPER_SLAB, Blocks.RAW_COPPER_BLOCK);
            slab(Vanilla_PlusBlocks.BLOCK_OF_RAW_GOLD_SLAB, Blocks.RAW_GOLD_BLOCK);
            slab(Vanilla_PlusBlocks.BLOCK_OF_AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
            slab(Vanilla_PlusBlocks.OAK_LOG_SLAB, Blocks.OAK_LOG, mcLoc("block/oak_log"), mcLoc("block/oak_log_top"));
            slab(Vanilla_PlusBlocks.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, mcLoc("block/spruce_log"), mcLoc("block/spruce_log_top"));
            slab(Vanilla_PlusBlocks.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, mcLoc("block/birch_log"), mcLoc("block/birch_log_top"));
            slab(Vanilla_PlusBlocks.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, mcLoc("block/jungle_log"), mcLoc("block/jungle_log_top"));
            slab(Vanilla_PlusBlocks.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, mcLoc("block/acacia_log"), mcLoc("block/acacia_log_top"));
            slab(Vanilla_PlusBlocks.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, mcLoc("block/dark_oak_log"), mcLoc("block/dark_oak_log_top"));
            slab(Vanilla_PlusBlocks.CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, mcLoc("block/crimson_stem"), mcLoc("block/crimson_stem_top"));
            slab(Vanilla_PlusBlocks.WARPED_STEM_SLAB, Blocks.WARPED_STEM, mcLoc("block/warped_stem"), mcLoc("block/warped_stem_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, mcLoc("block/stripped_oak_log"), mcLoc("block/stripped_oak_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, mcLoc("block/stripped_spruce_log"), mcLoc("block/stripped_spruce_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, mcLoc("block/stripped_birch_log"), mcLoc("block/stripped_birch_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, mcLoc("block/stripped_jungle_log"), mcLoc("block/stripped_jungle_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, mcLoc("block/stripped_acacia_log"), mcLoc("block/stripped_acacia_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, mcLoc("block/stripped_dark_oak_log"), mcLoc("block/stripped_dark_oak_log_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_CRIMSON_STEM_SLAB, Blocks.STRIPPED_CRIMSON_STEM, mcLoc("block/stripped_crimson_stem"), mcLoc("block/stripped_crimson_stem_top"));
            slab(Vanilla_PlusBlocks.STRIPPED_WARPED_STEM_SLAB, Blocks.STRIPPED_WARPED_STEM, mcLoc("block/stripped_warped_stem"), mcLoc("block/stripped_warped_stem_top"));
            slab(Vanilla_PlusBlocks.GLASS_SLAB, Blocks.GLASS);
            slab(Vanilla_PlusBlocks.TINTED_GLASS_SLAB, Blocks.TINTED_GLASS);
            slab(Vanilla_PlusBlocks.OBSIDIAN_SLAB, Blocks.OBSIDIAN);
            slab(Vanilla_PlusBlocks.PURPUR_PILLAR_SLAB, Blocks.PURPUR_PILLAR, mcLoc("block/purpur_pillar"), mcLoc("block/purpur_pillar_top"));
            slab(Vanilla_PlusBlocks.ICE_SLAB, Blocks.ICE);
            slab(Vanilla_PlusBlocks.SNOW_SLAB, Blocks.SNOW_BLOCK, mcLoc("block/snow"), mcLoc("block/snow"));
            slab(Vanilla_PlusBlocks.CLAY_SLAB, Blocks.CLAY);
            slab(Vanilla_PlusBlocks.PUMPKIN_SLAB, Blocks.PUMPKIN, mcLoc("block/pumpkin_side"), mcLoc("block/pumpkin_top"));
            slab(Vanilla_PlusBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
            slab(Vanilla_PlusBlocks.SOUL_SAND_SLAB, Blocks.SOUL_SAND);
            slab(Vanilla_PlusBlocks.SOUL_SOIL_SLAB, Blocks.SOUL_SOIL);
            slab(Vanilla_PlusBlocks.BASALT_SLAB, Blocks.BASALT, mcLoc("block/basalt_side"), mcLoc("block/basalt_top"));
            slab(Vanilla_PlusBlocks.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, mcLoc("block/polished_basalt_side"), mcLoc("block/polished_basalt_top"));
            slab(Vanilla_PlusBlocks.GLOWSTONE_SLAB, Blocks.GLOWSTONE);
            slab(Vanilla_PlusBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);
            slab(Vanilla_PlusBlocks.CHISELED_STONE_BRICK_SLAB, Blocks.CHISELED_STONE_BRICKS);
            slab(Vanilla_PlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);
            slab(Vanilla_PlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);
            slab(Vanilla_PlusBlocks.CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE);
            slab(Vanilla_PlusBlocks.MELON_SLAB, Blocks.MELON, mcLoc("block/melon_side"), mcLoc("block/melon_top"));
            slab(Vanilla_PlusBlocks.MYCELIUM_SLAB, Blocks.MYCELIUM, mcLoc("block/mycelium_side"), mcLoc("block/dirt"), mcLoc("block/mycelium_top"));
            slab(Vanilla_PlusBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
            slab(Vanilla_PlusBlocks.CHISELED_NETHER_BRICK_SLAB, Blocks.CHISELED_NETHER_BRICKS);
            slab(Vanilla_PlusBlocks.END_STONE_SLAB, Blocks.END_STONE);
            slab(Vanilla_PlusBlocks.CHISELED_QUARTZ_BLOCK_SLAB, Blocks.CHISELED_QUARTZ_BLOCK);
            slab(Vanilla_PlusBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
            slab(Vanilla_PlusBlocks.QUARTZ_PILLAR_SLAB, Blocks.QUARTZ_PILLAR, mcLoc("block/quartz_pillar"), mcLoc("block/quartz_pillar_top"));
            slab(Vanilla_PlusBlocks.HAY_BALE_SLAB, Blocks.HAY_BLOCK, mcLoc("block/hay_block_side"), mcLoc("block/hay_block_top"));
            slab(Vanilla_PlusBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);
            slab(Vanilla_PlusBlocks.PACKED_ICE_SLAB, Blocks.PACKED_ICE);
            slab(Vanilla_PlusBlocks.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN);
            slab(Vanilla_PlusBlocks.MAGMA_BLOCK_SLAB, Blocks.MAGMA_BLOCK, mcLoc("block/magma"), mcLoc("block/magma"));
            slab(Vanilla_PlusBlocks.NETHER_WART_BLOCK_SLAB, Blocks.NETHER_WART_BLOCK);
            slab(Vanilla_PlusBlocks.WARPED_WART_BLOCK_SLAB, Blocks.WARPED_WART_BLOCK);
            slab(Vanilla_PlusBlocks.BONE_BLOCK_SLAB, Blocks.BONE_BLOCK, mcLoc("block/bone_block_side"), mcLoc("block/bone_block_top"));
            slab(Vanilla_PlusBlocks.BLUE_ICE_SLAB, Blocks.BLUE_ICE);
            slab(Vanilla_PlusBlocks.DRIED_KELP_SLAB, Blocks.DRIED_KELP_BLOCK, mcLoc("block/dried_kelp_side"), mcLoc("block/dried_kelp_top"));
            slab(Vanilla_PlusBlocks.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
            slab(Vanilla_PlusBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

            slab(Vanilla_PlusBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
            slab(Vanilla_PlusBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
            slab(Vanilla_PlusBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
            slab(Vanilla_PlusBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
            slab(Vanilla_PlusBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
            slab(Vanilla_PlusBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
            slab(Vanilla_PlusBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
            slab(Vanilla_PlusBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
            slab(Vanilla_PlusBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
            slab(Vanilla_PlusBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
            slab(Vanilla_PlusBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
            slab(Vanilla_PlusBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
            slab(Vanilla_PlusBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
            slab(Vanilla_PlusBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
            slab(Vanilla_PlusBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
            slab(Vanilla_PlusBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
            slab(Vanilla_PlusBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);
            slab(Vanilla_PlusBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);
            slab(Vanilla_PlusBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);
            slab(Vanilla_PlusBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
            slab(Vanilla_PlusBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);
            slab(Vanilla_PlusBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);
            slab(Vanilla_PlusBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);
            slab(Vanilla_PlusBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);
            slab(Vanilla_PlusBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
            slab(Vanilla_PlusBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);
            slab(Vanilla_PlusBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);
            slab(Vanilla_PlusBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);
            slab(Vanilla_PlusBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);
            slab(Vanilla_PlusBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);
            slab(Vanilla_PlusBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);
            slab(Vanilla_PlusBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);
            slab(Vanilla_PlusBlocks.WHITE_STAINED_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.ORANGE_STAINED_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.MAGENTA_STAINED_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.YELLOW_STAINED_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.LIME_STAINED_GLASS_SLAB, Blocks.LIME_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.PINK_STAINED_GLASS_SLAB, Blocks.PINK_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.GRAY_STAINED_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.CYAN_STAINED_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.PURPLE_STAINED_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.BLUE_STAINED_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.BROWN_STAINED_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.GREEN_STAINED_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.RED_STAINED_GLASS_SLAB, Blocks.RED_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.BLACK_STAINED_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS);
            slab(Vanilla_PlusBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
            slab(Vanilla_PlusBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
            slab(Vanilla_PlusBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
            slab(Vanilla_PlusBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
            slab(Vanilla_PlusBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
            slab(Vanilla_PlusBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
            slab(Vanilla_PlusBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
            slab(Vanilla_PlusBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
            slab(Vanilla_PlusBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
            slab(Vanilla_PlusBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
            slab(Vanilla_PlusBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
            slab(Vanilla_PlusBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
            slab(Vanilla_PlusBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
            slab(Vanilla_PlusBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
            slab(Vanilla_PlusBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
            slab(Vanilla_PlusBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
            slab(Vanilla_PlusBlocks.WHITE_CONCRETE_POWDER_SLAB, Blocks.WHITE_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.ORANGE_CONCRETE_POWDER_SLAB, Blocks.ORANGE_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.MAGENTA_CONCRETE_POWDER_SLAB, Blocks.MAGENTA_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.YELLOW_CONCRETE_POWDER_SLAB, Blocks.YELLOW_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.LIME_CONCRETE_POWDER_SLAB, Blocks.LIME_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.PINK_CONCRETE_POWDER_SLAB, Blocks.PINK_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.GRAY_CONCRETE_POWDER_SLAB, Blocks.GRAY_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.CYAN_CONCRETE_POWDER_SLAB, Blocks.CYAN_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.PURPLE_CONCRETE_POWDER_SLAB, Blocks.PURPLE_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.BLUE_CONCRETE_POWDER_SLAB, Blocks.BLUE_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.BROWN_CONCRETE_POWDER_SLAB, Blocks.BROWN_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.GREEN_CONCRETE_POWDER_SLAB, Blocks.GREEN_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.RED_CONCRETE_POWDER_SLAB, Blocks.RED_CONCRETE_POWDER);
            slab(Vanilla_PlusBlocks.BLACK_CONCRETE_POWDER_SLAB, Blocks.BLACK_CONCRETE_POWDER);
        }


        nonRotatablePillar(Vanilla_PlusBlocks.OAK_LOG, mcLoc("block/oak_log_top"), mcLoc("block/oak_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.BIRCH_LOG, mcLoc("block/birch_log_top"), mcLoc("block/birch_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.SPRUCE_LOG, mcLoc("block/spruce_log_top"), mcLoc("block/spruce_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.ACACIA_LOG, mcLoc("block/acacia_log_top"), mcLoc("block/acacia_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.DARK_OAK_LOG, mcLoc("block/dark_oak_log_top"), mcLoc("block/dark_oak_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.JUNGLE_LOG, mcLoc("block/jungle_log_top"), mcLoc("block/jungle_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.WARPED_STEM, mcLoc("block/warped_stem_top"), mcLoc("block/warped_stem"));
        nonRotatablePillar(Vanilla_PlusBlocks.CRIMSON_STEM, mcLoc("block/crimson_stem_top"), mcLoc("block/crimson_stem"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_OAK_LOG, mcLoc("block/stripped_oak_log_top"), mcLoc("block/stripped_oak_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_BIRCH_LOG, mcLoc("block/stripped_birch_log_top"), mcLoc("block/stripped_birch_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_SPRUCE_LOG, mcLoc("block/stripped_spruce_log_top"), mcLoc("block/stripped_spruce_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_ACACIA_LOG, mcLoc("block/stripped_acacia_log_top"), mcLoc("block/stripped_acacia_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_DARK_OAK_LOG, mcLoc("block/dark_oak_log_top"), mcLoc("block/dark_oak_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_JUNGLE_LOG, mcLoc("block/stripped_jungle_log_top"), mcLoc("block/stripped_jungle_log"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_WARPED_STEM, mcLoc("block/stripped_warped_stem_top"), mcLoc("block/stripped_warped_stem"));
        nonRotatablePillar(Vanilla_PlusBlocks.STRIPPED_CRIMSON_STEM, mcLoc("block/stripped_crimson_stem_top"), mcLoc("block/stripped_crimson_stem"));
        nonRotatablePillar(Vanilla_PlusBlocks.PURPUR_PILLAR, mcLoc("block/purpur_pillar_top"), mcLoc("block/purpur_pillar"));
        nonRotatablePillar(Vanilla_PlusBlocks.QUARTZ_PILLAR, mcLoc("block/quartz_pillar_top"), mcLoc("block/quartz_pillar"));
        nonRotatablePillar(Vanilla_PlusBlocks.HAY_BLOCK, mcLoc("block/hay_block_top"), mcLoc("block/hay_block_side"));
    }
}
