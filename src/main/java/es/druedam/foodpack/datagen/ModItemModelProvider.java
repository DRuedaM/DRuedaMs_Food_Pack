package es.druedam.foodpack.datagen;

import es.druedam.foodpack.FoodPackMod;
import es.druedam.foodpack.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoodPackMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BOCATA_LOMO_QUESO);
        simpleItem(ModItems.CAMPURRIANA);
        simpleItem(ModItems.CHEESE);
        simpleItem(ModItems.CHOCOLATE_MILKSHAKE);
        simpleItem(ModItems.CHOCOLATE_TABLE);
        simpleItem(ModItems.CROQUETTE);
        simpleItem(ModItems.PEPSI);
        simpleItem(ModItems.RAW_FRIED_CHICKEN);
        simpleItem(ModItems.FRIED_CHICKEN);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.TOMATO_SEEDS);
        simpleItem(ModItems.FRIED_CHICKEN);
        simpleItem(ModItems.TOMATO);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FoodPackMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
