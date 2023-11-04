package com.tguesdon.cobblemon_iv_addon;

import com.mojang.logging.LogUtils;
import com.tguesdon.cobblemon_iv_addon.item.ModCreativeTabs;
import com.tguesdon.cobblemon_iv_addon.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CobblemonIVAddonMod.MOD_ID)
public final class CobblemonIVAddonMod {
    public static final String MOD_ID = "cobblemon_iv_addon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CobblemonIVAddonMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);


    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }

}
