package com.github.manasmods.unordinary_basics.handler.enchantments;

import com.github.manasmods.unordinary_basics.UnordinaryBasics;
import com.github.manasmods.unordinary_basics.enchantment.UnordinaryBasicsEnchantments;
import com.github.manasmods.unordinary_basics.utils.BlockBreakHelper;
import com.github.manasmods.unordinary_basics.utils.UBTags;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnordinaryBasics.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VeinMinerHandler {

    //If this isn't working, try rerunning data, as the tags may not be present
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack tool = player.getItemInHand(InteractionHand.MAIN_HAND);
        BlockPos pos = event.getPos();
        int enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(UnordinaryBasicsEnchantments.VEIN_MINER, tool);
        if (enchantLevel > 0 && tool.getTag().getBoolean("veinMinerOn") && event.getLevel().getBlockState(pos).is(UBTags.Blocks.VEIN_MINER_VALID)) {
            tool.getOrCreateTag().putBoolean("veinMinerOn",false);
            BlockBreakHelper.floodMineOnBlock(128 ,pos,player.getLevel(),player.getOnPos().above(),tool,player,event.getLevel().getBlockState(pos).getBlock(),true);
            tool.getOrCreateTag().putBoolean("veinMinerOn",true);
        }
    }

    @SubscribeEvent
    public static void onItemRightClick(final PlayerInteractEvent.RightClickItem event) {
        ItemStack stack = event.getItemStack();
        Player player = event.getEntity();
        int maxLevel = EnchantmentHelper.getItemEnchantmentLevel(UnordinaryBasicsEnchantments.VEIN_MINER, stack);
        CompoundTag tag = stack.getTag();
        if (maxLevel > 0 && tag != null && player.isCrouching()) {
            boolean isOn = tag.getBoolean("veinMinerOn");
            tag.putBoolean("veinMinerOn", !isOn);
            player.displayClientMessage((Component.translatable("unordinary_basics.message.vein_miner_toggle",isOn ?
                    Component.translatable("unordinary_basics.message.off") : Component.translatable("unordinary_basics.message.on"))), true);
        }
    }
}
