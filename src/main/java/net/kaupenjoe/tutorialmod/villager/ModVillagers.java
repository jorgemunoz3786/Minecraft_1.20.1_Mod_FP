package net.kaupenjoe.tutorialmod.villager;

import com.google.common.collect.ImmutableSet;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TutorialMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, TutorialMod.MOD_ID);

    public static final RegistryObject<PoiType> KEBBAB_POI = POI_TYPES.register("kebbab_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.KEBBAB_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 3));

    public static final RegistryObject<VillagerProfession> KEBBAB_COOK =
            VILLAGER_PROFESSIONS.register("kebbab_cook", () -> new VillagerProfession("kebbab_cook",
                    holder -> holder.get() == KEBBAB_POI.get(), holder -> holder.get() == KEBBAB_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_FARMER));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
