package es.druedam.foodpack.item;

import es.druedam.foodpack.FoodPackMod;
import es.druedam.foodpack.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodPackMod.MOD_ID);

    //We create the method to create a new section for our mod and add our blocks, items, and more
    public static final RegistryObject<CreativeModeTab> FOODPACK_TAB = CREATIVE_MODE_TABS.register("foodpack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOCATA_LOMO_QUESO.get()))
                    .title(Component.translatable("creativetab.foodpack_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.RAW_FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.PEPSI.get());
                        pOutput.accept(ModItems.CAMPURRIANA.get());
                        pOutput.accept(ModItems.CROQUETTE.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.CHOCOLATE_TABLE.get());
                        pOutput.accept(ModItems.CHOCOLATE_MILKSHAKE.get());
                        pOutput.accept(ModItems.BOCATA_LOMO_QUESO.get());
                        pOutput.accept(ModItems.TOMATO_SEEDS.get());
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.DURUM.get());
                        pOutput.accept(ModItems.BURGUER.get());
                        pOutput.accept(ModItems.FOOD_COMBINED.get());
                        pOutput.accept(ModBlocks.PIZZA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
