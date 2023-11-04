package com.tguesdon.cobblemon_iv_addon.item;

import com.tguesdon.cobblemon_iv_addon.CobblemonIVAddonMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobblemonIVAddonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COBBLEMON_IV_TAB = TABS.register("cobblemon_iv_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cobblemon_iv_tab"))
                    .icon(ModItems.BOTTLE_CAP.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.BOTTLE_CAP.get());
                        output.accept(ModItems.BOTTLE_CAP_WHITE.get());
                        output.accept(ModItems.BOTTLE_CAP_RED.get());
                        output.accept(ModItems.BOTTLE_CAP_BLUE.get());
                        output.accept(ModItems.BOTTLE_CAP_CYAN.get());
                        output.accept(ModItems.BOTTLE_CAP_PINK.get());
                        output.accept(ModItems.BOTTLE_CAP_GREEN.get());
                    })
                    .build()
    );

}
