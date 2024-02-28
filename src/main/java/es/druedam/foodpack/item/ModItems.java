package es.druedam.foodpack.item;

import es.druedam.foodpack.FoodPackMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodPackMod.MOD_ID);

    public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_CHICKEN)));

    public static final RegistryObject<Item> RAW_FRIED_CHICKEN = ITEMS.register("raw_fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_FRIED_CHICKEN)));

    public static final RegistryObject<Item> PEPSI = ITEMS.register("pepsi",
            () -> new Item(new Item.Properties().food(ModFoods.PEPSI)));

    public static final RegistryObject<Item> CAMPURRIANA = ITEMS.register("campurriana",
            () -> new Item(new Item.Properties().food(ModFoods.CAMPURRIANA)));

    public static final RegistryObject<Item> CROQUETTE = ITEMS.register("croqueta",
            () -> new Item(new Item.Properties().food(ModFoods.CROQUETTE)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberrie",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));

    public static final RegistryObject<Item> CHOCOLATE_TABLE = ITEMS.register("chocolate_table",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_TABLE)));

    public static final RegistryObject<Item> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MILKSHAKE)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
