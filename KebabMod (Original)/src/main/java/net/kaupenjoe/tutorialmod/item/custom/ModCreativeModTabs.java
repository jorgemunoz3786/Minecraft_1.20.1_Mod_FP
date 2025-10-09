package net.kaupenjoe.tutorialmod.item.custom;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.kaupenjoe.tutorialmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public  static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
             () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.DURUM.get()))
                     .title(Component.translatable("creativetab.tutorial_tab"))
                     .displayItems((pParameters, pOutput) -> {

                         // Items
                        pOutput.accept(ModItems.KEBBAB.get());
                        pOutput.accept(ModItems.DURUM.get());
                        pOutput.accept(ModItems.DILDO.get());
                        pOutput.accept(ModItems.MITHRIL.get());

                         // Herramientas
                         pOutput.accept(ModItems.MITHRIL_SWORD.get());
                         pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                         pOutput.accept(ModItems.MITHRIL_AXE.get());
                         pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                         pOutput.accept(ModItems.MITHRIL_HOE.get());
                         pOutput.accept(ModItems.FIRE_SWORD.get());

                         //Armaduras
                         pOutput.accept(ModItems.MITHRIL_HELMET.get());
                         pOutput.accept(ModItems.MITHRIL_CHESTPLATE.get());
                         pOutput.accept(ModItems.MITHRIL_LEGGINGS.get());
                         pOutput.accept(ModItems.MITHRIL_BOOTS.get());

                         pOutput.accept(ModItems.SUPER_HELMET.get());
                         pOutput.accept(ModItems.SUPER_CHESTPLATE.get());
                         pOutput.accept(ModItems.SUPER_LEGGINGS.get());
                         pOutput.accept(ModItems.SUPER_BOOTS.get());

                         // Bloques
                        pOutput.accept(ModBlocks.MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.KEBBAB_BLOCK.get());


                })
                     .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
