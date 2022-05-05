package com.manasmods.vanilla_plus.registry;


import com.manasmods.vanilla_plus.Vanilla_Plus;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Vanilla_PlusRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Vanilla_Plus.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Vanilla_Plus.MOD_ID);

    /**
     * Registers all registries.
     * This needs to be called in the Mod Constructor.
     *
     * @param modEventBus needs to be the modEventbus!
     */
    public static void register(IEventBus modEventBus) {
        // Add our Registries to Forge
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BlockRegistry.register(ITEMS, BLOCKS); //Register Blocks with their BlockItems
        ItemRegistry.register(ITEMS); //Register Items to our Registry
    }
}