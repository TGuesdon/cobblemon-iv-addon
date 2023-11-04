package com.tguesdon.cobblemon_iv_addon.item;

import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.tguesdon.cobblemon_iv_addon.CobblemonIVAddonMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CobblemonIVAddonMod.MOD_ID);

    public static final RegistryObject<Item> BOTTLE_CAP = ITEMS.register("bottle_cap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_CAP_WHITE = ITEMS.register("bottle_cap_white",
            () -> new IVItem(Stats.HP));
    public static final RegistryObject<Item> BOTTLE_CAP_RED = ITEMS.register("bottle_cap_red",
            () -> new IVItem(Stats.ATTACK));
    public static final RegistryObject<Item> BOTTLE_CAP_BLUE = ITEMS.register("bottle_cap_blue",
            () -> new IVItem(Stats.DEFENCE));
    public static final RegistryObject<Item> BOTTLE_CAP_CYAN = ITEMS.register("bottle_cap_cyan",
            () -> new IVItem(Stats.SPECIAL_ATTACK));
    public static final RegistryObject<Item> BOTTLE_CAP_PINK = ITEMS.register("bottle_cap_pink",
            () -> new IVItem(Stats.SPECIAL_DEFENCE));
    public static final RegistryObject<Item> BOTTLE_CAP_GREEN = ITEMS.register("bottle_cap_green",
            () -> new IVItem(Stats.SPEED));
}
