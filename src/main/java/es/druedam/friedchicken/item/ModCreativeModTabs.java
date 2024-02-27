package es.druedam.friedchicken.item;

import es.druedam.friedchicken.FriedChickenMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FriedChickenMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FRIEDCHICKEN_TAB = CREATIVE_MODE_TABS.register("friedchicken_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FRIED_CHICKEN.get()))
                    .title(Component.translatable("creativetab.friedchicken_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.RAW_FRIED_CHICKEN.get());
                        pOutput.accept(ModItems.PEPSI.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
