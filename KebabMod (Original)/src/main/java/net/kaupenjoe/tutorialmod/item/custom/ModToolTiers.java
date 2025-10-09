package net.kaupenjoe.tutorialmod.item.custom;

import net.kaupenjoe.tutorialmod.ModTags;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.ModItems;
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
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.MITHRIL.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"mithril"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier PLASTIC = TierSortingRegistry.registerTier(
            new ForgeTier(2, 500, 3, 1, 6,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.PLASTIC.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"plastic"), List.of(Tiers.STONE), List.of());

    public static final Tier SUPER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 500, 3, 1, 6,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.SUPER.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"super"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier FIRE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 3000, 3, 5, 6,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, ()-> Ingredient.of(ModItems.MITHRIL.get())),
            new ResourceLocation(TutorialMod.MOD_ID,"fire_material"), List.of(Tiers.NETHERITE), List.of());

}
