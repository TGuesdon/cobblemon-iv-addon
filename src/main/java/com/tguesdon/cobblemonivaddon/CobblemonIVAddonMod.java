package com.tguesdon.cobblemonivaddon;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("cobblemon_iv_addon")
public final class CobblemonIVAddonMod {

    public CobblemonIVAddonMod() {}

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class Registration {

        @SubscribeEvent
        public static void onCommandRegistration(final RegisterCommandsEvent event) {}
    }

}
