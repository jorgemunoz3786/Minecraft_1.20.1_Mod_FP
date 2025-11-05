package net.prueba.kebabmod.item.custom;

import net.prueba.kebabmod.TutorialMod;
import net.prueba.kebabmod.block.ModBlocks;
import net.prueba.kebabmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DURUM.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((parameters, output) -> {


                        //Se han ocultado algunos items por el bien del mod y no eliminar el contenido

                        // Comida y materiales
                        output.accept(ModItems.KEBBAB.get());
                        output.accept(ModItems.DURUM.get());
                        //output.accept(ModItems.RAW_MITHRIL.get());
                        //output.accept(ModItems.MITHRIL_INGOT.get());

                        // Herramientas
                        //output.accept(ModItems.MITHRIL_SWORD.get());
                        //output.accept(ModItems.MITHRIL_PICKAXE.get());
                        //output.accept(ModItems.MITHRIL_AXE.get());
                        //output.accept(ModItems.MITHRIL_SHOVEL.get());
                        //output.accept(ModItems.MITHRIL_HOE.get());
                        //output.accept(ModItems.FIRE_SWORD.get());

                        // Armaduras
                        //output.accept(ModItems.MITHRIL_HELMET.get());
                        //output.accept(ModItems.MITHRIL_CHESTPLATE.get());
                        //output.accept(ModItems.MITHRIL_LEGGINGS.get());
                        //output.accept(ModItems.MITHRIL_BOOTS.get());

                        // Anillos normales
                        output.accept(ModItems.GELIDA_RING.get());
                        output.accept(ModItems.ANTIGUA_RING.get());
                        output.accept(ModItems.MUSGOSA_RING.get());
                        output.accept(ModItems.FUNGICA_RING.get());
                        output.accept(ModItems.CRISTAL_RING.get());
                        output.accept(ModItems.TRANSLUCIDA_RING.get());
                        output.accept(ModItems.CORAL_RING.get());
                        output.accept(ModItems.BRUTA_RING.get());
                        output.accept(ModItems.DIVIDIDA_RING.get());
                        output.accept(ModItems.ALMAS_RING.get());
                        output.accept(ModItems.PURPURA_RING.get());

                        // Anillos dorados
                        output.accept(ModItems.GOLD_GELIDA_RING.get());
                        output.accept(ModItems.GOLD_ANTIGUA_RING.get());
                        output.accept(ModItems.GOLD_MUSGOSA_RING.get());
                        output.accept(ModItems.GOLD_FUNGICA_RING.get());
                        output.accept(ModItems.GOLD_CRISTAL_RING.get());
                        output.accept(ModItems.GOLD_TRANSLUCIDA_RING.get());
                        output.accept(ModItems.GOLD_CORAL_RING.get());
                        output.accept(ModItems.GOLD_BRUTA_RING.get());
                        output.accept(ModItems.GOLD_DIVIDIDA_RING.get());
                        output.accept(ModItems.GOLD_ALMAS_RING.get());
                        output.accept(ModItems.GOLD_PURPURA_RING.get());

                        // Bloques
                        //output.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                        output.accept(ModBlocks.KEBBAB_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
