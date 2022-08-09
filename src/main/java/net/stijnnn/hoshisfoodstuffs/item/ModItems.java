package net.stijnnn.hoshisfoodstuffs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stijnnn.hoshisfoodstuffs.HoshisFoodStuffs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HoshisFoodStuffs.MOD_ID);

    public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOSHIS_FOOD_STUFFS).food(ModFoods.PANCAKE)));
    public static final RegistryObject<Item> WAFFLE = ITEMS.register("waffle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOSHIS_FOOD_STUFFS).food(ModFoods.WAFFLE)));
    public static final RegistryObject<Item> MAPLE_SYRUP_WAFFLE = ITEMS.register("maple_syrup_waffle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOSHIS_FOOD_STUFFS).food(ModFoods.MAPLE_SYRUP_WAFFLE)));
    public static final RegistryObject<Item> COOKIE_BATCH = ITEMS.register("cookie_batch",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOSHIS_FOOD_STUFFS).food(ModFoods.COOKIE_BATCH)));
    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HOSHIS_FOOD_STUFFS).food(ModFoods.NOODLES)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
