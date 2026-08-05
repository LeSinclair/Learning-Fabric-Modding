package org.lesinclair.tutorialmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import org.lesinclair.tutorialmod.TutorialMod;
import org.lesinclair.tutorialmod.food.ModFoods;
import org.lesinclair.tutorialmod.item.custom.Midas;
import org.lesinclair.tutorialmod.item.custom.Refiner;


import java.util.function.Function;

public class Moditems {
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item DORITOS = registerItem("doritos", properties -> new Item(properties.food(ModFoods.DORITOS, ModFoods.DORITOS_CONSUMABLE))) ;
    public static final Item REFINER = registerItem("refiner", properties -> new Refiner(properties.durability(32)));
    public static final Item MIDAS = registerItem("midas", Midas::new);
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            properties -> new Item(properties.sword(ModToolMaterials.RUBY, 3, -2.4f)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.RUBY, 1, -2.8f)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            properties -> new Item(properties.shovel(ModToolMaterials.RUBY, 1.5f, -3.0f)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            properties -> new Item(properties.axe(ModToolMaterials.RUBY, 6f, -3.2f)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            properties -> new Item(properties.hoe(ModToolMaterials.RUBY, 0f, -3.0f)));
    public static final Item RUBY_SPEAR = registerItem("ruby_spear",
            properties -> new Item(properties.spear(ModToolMaterials.RUBY, 0.95F,
                    0.95F, 0.6F, 2.5F, 11.0F,
                    6.75F, 5.1F, 11.25F, 4.6F
            )));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering items for " + TutorialMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
                output.accept(RUBY);
                output.accept(DORITOS);
                output.accept(REFINER);
                output.accept(MIDAS);
        });
    }
}
