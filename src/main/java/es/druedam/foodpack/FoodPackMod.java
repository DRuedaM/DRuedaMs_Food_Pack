package es.druedam.foodpack;

import com.mojang.logging.LogUtils;
import es.druedam.foodpack.block.ModBlocks;
import es.druedam.foodpack.item.ModCreativeModTabs;
import es.druedam.foodpack.item.ModItems;
import es.druedam.foodpack.loot.ModLootModifiers;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FoodPackMod.MOD_ID)
public class FoodPackMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "druedams_foodpack_mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public FoodPackMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModLootModifiers.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        //This adds the mod items to our creative inventory explorer
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.FRIED_CHICKEN);
            event.accept(ModItems.RAW_FRIED_CHICKEN);
            event.accept(ModItems.PEPSI);
            event.accept(ModItems.CAMPURRIANA);
            event.accept(ModItems.CROQUETTE);
            event.accept(ModItems.STRAWBERRY);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.CHOCOLATE_TABLE);
            event.accept(ModItems.CHOCOLATE_MILKSHAKE);
            event.accept(ModItems.BOCATA_LOMO_QUESO);
            event.accept(ModItems.TOMATO_SEEDS);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.DURUM);
            event.accept(ModItems.BURGUER);
            event.accept(ModItems.FOOD_COMBINED);
            event.accept(ModBlocks.PIZZA);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
