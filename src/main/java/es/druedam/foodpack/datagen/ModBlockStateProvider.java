package es.druedam.foodpack.datagen;

import es.druedam.foodpack.FoodPackMod;
import es.druedam.foodpack.block.ModBlocks;
import es.druedam.foodpack.block.custom.StrawberryCropBlock;
import es.druedam.foodpack.block.custom.TomatoCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FoodPackMod.MOD_ID, exFileHelper);
    }

    public void makeTomatoCrop(CropBlock block, String modelName, String textureName)
    {
        Function<BlockState, ConfiguredModel[]> function = state -> tomatoStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tomatoStates(BlockState state, CropBlock block, String modelName, String textureName)
    {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TomatoCropBlock) block).getAgeProperty()),
                new ResourceLocation(FoodPackMod.MOD_ID, "block/" + textureName + state.getValue(((TomatoCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    public void makeStrawberryCrop(CropBlock block, String modelName, String textureName)
    {
        Function<BlockState, ConfiguredModel[]> function = state -> strawberryStages(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] strawberryStages(BlockState state, CropBlock block, String modelName, String textureName)
    {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()),
                new ResourceLocation(FoodPackMod.MOD_ID, "block/" + textureName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    @Override
    protected void registerStatesAndModels()
    {
        makeTomatoCrop((CropBlock) ModBlocks.TOMATO_CROP.get(), "tomato_stage", "tomato_stage");
        makeStrawberryCrop((CropBlock) ModBlocks.STRAWBERRY_CROP.get(), "strawberry_stage", "strawberry_stage");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
