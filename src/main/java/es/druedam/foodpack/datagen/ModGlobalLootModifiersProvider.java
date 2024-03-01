package es.druedam.foodpack.datagen;

import es.druedam.foodpack.FoodPackMod;
import es.druedam.foodpack.item.ModItems;
import es.druedam.foodpack.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider
{

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, FoodPackMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("tomato_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()
        },ModItems.TOMATO_SEEDS.get()));

        add("pepsi_from", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()
        }, ModItems.PEPSI.get()));

        add("tomato_seeds_from_village", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/mason")).build()
        }, ModItems.TOMATO_SEEDS.get()));

        add("raw_fried_chicken_from_village", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_butcher")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

        add("raw_fried_chicken_from_village2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_weaponsmith")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

        add("raw_fried_chicken_from_village3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_armorer")).build()
        }, ModItems.RAW_FRIED_CHICKEN.get()));

    }

}
