package es.druedam.foodpack.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    //Class for creating food and his respective properties
    public static final FoodProperties FRIED_CHICKEN = new FoodProperties.Builder().nutrition(5).
            saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                            200), 1f).meat().build();

    public static final FoodProperties RAW_FRIED_CHICKEN = new FoodProperties.Builder().nutrition(1).
            saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER,
                    600), 0.3f).meat().build();

    public static final FoodProperties PEPSI = new FoodProperties.Builder().nutrition(2).
            saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.WITHER,
                    500), 1f).alwaysEat().build();

    public static final FoodProperties CAMPURRIANA = new FoodProperties.Builder().nutrition(3).
            saturationMod(0.2f).fast().build();

    public static final FoodProperties CROQUETTE = new FoodProperties.Builder().nutrition(3).
            saturationMod(0.4f).meat().fast().build();

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.1f).fast().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500), 0.2f).build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.5f).build();

    public static final FoodProperties CHOCOLATE_TABLE = new FoodProperties.Builder().nutrition(4).
            saturationMod(0.35f).build();

    public static final FoodProperties CHOCOLATE_MILKSHAKE = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.5f).build();

    public static final FoodProperties BOCATA_LOMO_QUESO = new FoodProperties.Builder().nutrition(8).
            saturationMod(0.5f).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).
            saturationMod(0.2f).build();

    public static final FoodProperties DURUM = new FoodProperties.Builder().nutrition(10).
            saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 750), 0.5f).build();

    public static final FoodProperties BURGUER = new FoodProperties.Builder().nutrition(7).
            saturationMod(0.7f).build();

    public static final FoodProperties FOOD_COMBINED = new FoodProperties.Builder().nutrition(5).
            saturationMod(0.5f).build();



}
