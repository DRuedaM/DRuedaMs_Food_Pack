package es.druedam.friedchicken.item;

import es.druedam.friedchicken.FriedChickenMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FriedChickenMod.MOD_ID);

    public static final RegistryObject<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_CHICKEN)));

    public static final RegistryObject<Item> RAW_FRIED_CHICKEN = ITEMS.register("raw_fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_FRIED_CHICKEN)));

    public static final RegistryObject<Item> PEPSI = ITEMS.register("pepsi",
            () -> new Item(new Item.Properties().food(ModFoods.PEPSI)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
