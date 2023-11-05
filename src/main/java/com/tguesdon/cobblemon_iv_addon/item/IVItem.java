package com.tguesdon.cobblemon_iv_addon.item;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public final class IVItem extends PokemonItem {

    private final Stat stat;

    public IVItem(Stat stat) {
        super(new Properties());
        this.stat = stat;
    }

    @Override
    InteractionResult processInteraction(ItemStack itemStack, Player player, Pokemon target, InteractionHand hand) {

        int currentIV = target.getIvs().getOrDefault(stat);

        if(currentIV >= 31) {
            player.sendSystemMessage(Component.translatable("cobblemon_iv_addon.errors.has_max_iv"));
            return InteractionResult.FAIL;
        }

        player.playSound(CobblemonSounds.MEDICINE_PILLS_USE);
        if(!player.isCreative()){
            itemStack.setCount(itemStack.getCount() - 1);
        }
        target.setIV(this.stat, 31);
        player.sendSystemMessage(Component.translatable("cobblemon_iv_addon.sucess.max_iv"));
        return InteractionResult.SUCCESS;
    }


}
