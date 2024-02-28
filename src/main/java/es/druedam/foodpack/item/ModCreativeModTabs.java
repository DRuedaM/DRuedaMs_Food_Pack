package es.druedam.foodpack.item;

import es.druedam.foodpack.FoodPackMod;
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

    public static final RegistryObject<CreativeModeTab> FOODPACK_TAB = CREATIVE_MODE_TABS.register("foodpack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CROQUETTE.get()))
                    .title(Component.translatable("creativetab.foodpack_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.RAW_FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.PEPSI.get());
                        pOutput.accept(ModItems.CAMPURRIANA.get());
                        pOutput.accept(ModItems.CROQUETTE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
