package net.kaupenjoe.tutorialmod.datagen;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Bloque normal (misma textura en todos los lados)
        blockWithItem(ModBlocks.RAW_MITHRIL_BLOCK);

        // Bloque con textura distinta arriba/abajo/lados
        cubeBottomTopBlock(ModBlocks.KEBBAB_BLOCK.get(),
                modLoc("block/kebbab_block_bottom"), // textura inferior
                modLoc("block/kebbab_block_top"),    // textura superior
                modLoc("block/kebbab_block_side"));  // textura lateral
    }

    // Bloques normales
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    // Bloques con textura superior/inferior/lateral diferente
    private void cubeBottomTopBlock(Block block, ResourceLocation bottom, ResourceLocation top, ResourceLocation side) {
        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        // Modelo del bloque (usado en el mundo)
        ModelFile model = models().cubeBottomTop(blockName, side, bottom, top);

        // Generar el estado del bloque y su item
        simpleBlock(block, model);

        // Generar modelo del ítem para el inventario (usa el del bloque)
        itemModels().getBuilder(blockName)
                .parent(model);
    }
}
