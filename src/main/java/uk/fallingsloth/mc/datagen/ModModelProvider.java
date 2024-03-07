package uk.fallingsloth.mc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import uk.fallingsloth.mc.items.ModItems;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.GOLD_COIN, Models.GENERATED);

        // ITEMS FOR KINGDOM 1
        itemModelGenerator.register(ModItems.KINGDOM1_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM1_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM1_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM1_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM1_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM1_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM1_BOOTS);

        // ITEMS FOR KINGDOM 2
        itemModelGenerator.register(ModItems.KINGDOM2_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM2_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM2_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM2_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM2_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM2_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM2_BOOTS);

        // ITEMS FOR KINGDOM 3
        itemModelGenerator.register(ModItems.KINGDOM3_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM3_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM3_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM3_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM3_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM3_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM3_BOOTS);

        // ITEMS FOR KINGDOM 4
        itemModelGenerator.register(ModItems.KINGDOM4_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM4_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM4_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM4_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM4_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM4_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM4_BOOTS);

        // ITEMS FOR KINGDOM 5
        itemModelGenerator.register(ModItems.KINGDOM5_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM5_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM5_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM5_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM5_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM5_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM5_BOOTS);

        // ITEMS FOR KINGDOM 6
        itemModelGenerator.register(ModItems.KINGDOM6_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM6_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM6_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM6_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM6_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM6_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM6_BOOTS);

        // ITEMS FOR KINGDOM 7
        itemModelGenerator.register(ModItems.KINGDOM7_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM7_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM7_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM7_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM7_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM7_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM7_BOOTS);

        // ITEMS FOR KINGDOM 8
        itemModelGenerator.register(ModItems.KINGDOM8_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM8_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM8_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM8_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM8_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM8_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM8_BOOTS);

        // ITEMS FOR KINGDOM 9
        itemModelGenerator.register(ModItems.KINGDOM9_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM9_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM9_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM9_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM9_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM9_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM9_BOOTS);

        // ITEMS FOR KINGDOM 10
        itemModelGenerator.register(ModItems.KINGDOM10_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM10_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM10_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM10_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM10_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM10_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM10_BOOTS);

        // ITEMS FOR KINGDOM 11
        itemModelGenerator.register(ModItems.KINGDOM11_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM11_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM11_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM11_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM11_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM11_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM11_BOOTS);

        // ITEMS FOR KINGDOM 12
        itemModelGenerator.register(ModItems.KINGDOM12_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM12_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM12_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM12_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM12_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM12_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM12_BOOTS);

        // ITEMS FOR KINGDOM 13
        itemModelGenerator.register(ModItems.KINGDOM13_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINGDOM13_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KINGDOM13_SHIELD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM13_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM13_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM13_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM13_BOOTS);


        
    }
}
