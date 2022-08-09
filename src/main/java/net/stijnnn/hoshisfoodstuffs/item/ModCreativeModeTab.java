package net.stijnnn.hoshisfoodstuffs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab HOSHIS_FOOD_STUFFS = new CreativeModeTab("hoshisfoodstuffs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.APPLE);
        }
    };
}
