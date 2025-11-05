package net.prueba.kebabmod.item.custom;

import net.prueba.kebabmod.ModTags;
import net.prueba.kebabmod.TutorialMod;
import net.prueba.kebabmod.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 5, 4, 25,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.RAW_MITHRIL.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"mithril"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier FIRE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 3000, 3, 5, 6,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.RAW_MITHRIL.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"fire_material"), List.of(Tiers.NETHERITE), List.of());

}
