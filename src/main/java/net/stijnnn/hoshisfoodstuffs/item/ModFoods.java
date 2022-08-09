package net.stijnnn.hoshisfoodstuffs.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PANCAKE = (new FoodProperties.Builder()).nutrition(6).saturationMod(1F).build();
    public static final FoodProperties WAFFLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties MAPLE_SYRUP_WAFFLE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties COOKIE_BATCH = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F).build();
    public static final FoodProperties NOODLES = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();

}
