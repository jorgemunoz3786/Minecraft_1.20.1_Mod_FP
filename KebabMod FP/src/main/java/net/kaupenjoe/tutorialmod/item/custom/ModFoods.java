package net.kaupenjoe.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties KEBBAB = new FoodProperties.Builder().nutrition(6)
            .saturationMod(10)
            .meat()
            .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.5f)
            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), 0.5f).build();

    public static final FoodProperties DURUM = new FoodProperties.Builder().nutrition(8)
            .saturationMod(10)
            .meat()
            .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.5f)
            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), 0.5f).build();

}

