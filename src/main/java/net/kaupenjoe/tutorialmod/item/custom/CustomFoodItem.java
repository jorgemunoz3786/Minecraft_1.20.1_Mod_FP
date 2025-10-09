package net.kaupenjoe.tutorialmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CustomFoodItem extends Item {

    public CustomFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 64; // 64 ticks = 3,2 segundos (puedes ajustar más si quieres)
    }
}
