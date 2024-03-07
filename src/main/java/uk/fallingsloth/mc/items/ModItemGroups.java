package uk.fallingsloth.mc.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import uk.fallingsloth.mc.Kingdoms;

public class ModItemGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Kingdoms.MOD_ID, "kingdoms_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.kingdoms"))
                    .icon(() -> new ItemStack(ModItems.GOLD_COIN))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_COIN);

                        // ITEMS FOR KINGDOM 1
                        entries.add(ModItems.KINGDOM1_ESSENCE);
                        entries.add(ModItems.KINGDOM1_SWORD);
                        entries.add(ModItems.KINGDOM1_SHIELD);
                        entries.add(ModItems.KINGDOM1_BOW);
                        entries.add(ModItems.KINGDOM1_HELMET);
                        entries.add(ModItems.KINGDOM1_CHESTPLATE);
                        entries.add(ModItems.KINGDOM1_LEGGINGS);
                        entries.add(ModItems.KINGDOM1_BOOTS);

                        // ITEMS FOR KINGDOM 2
                        entries.add(ModItems.KINGDOM2_ESSENCE);
                        entries.add(ModItems.KINGDOM2_SWORD);
                        entries.add(ModItems.KINGDOM2_SHIELD);
                        entries.add(ModItems.KINGDOM2_BOW);
                        entries.add(ModItems.KINGDOM2_HELMET);
                        entries.add(ModItems.KINGDOM2_CHESTPLATE);
                        entries.add(ModItems.KINGDOM2_LEGGINGS);
                        entries.add(ModItems.KINGDOM2_BOOTS);

                        // ITEMS FOR KINGDOM 3
                        entries.add(ModItems.KINGDOM3_ESSENCE);
                        entries.add(ModItems.KINGDOM3_SWORD);
                        entries.add(ModItems.KINGDOM3_SHIELD);
                        entries.add(ModItems.KINGDOM3_BOW);
                        entries.add(ModItems.KINGDOM3_HELMET);
                        entries.add(ModItems.KINGDOM3_CHESTPLATE);
                        entries.add(ModItems.KINGDOM3_LEGGINGS);
                        entries.add(ModItems.KINGDOM3_BOOTS);

                        // ITEMS FOR KINGDOM 4
                        entries.add(ModItems.KINGDOM4_ESSENCE);
                        entries.add(ModItems.KINGDOM4_SWORD);
                        entries.add(ModItems.KINGDOM4_SHIELD);
                        entries.add(ModItems.KINGDOM4_BOW);
                        entries.add(ModItems.KINGDOM4_HELMET);
                        entries.add(ModItems.KINGDOM4_CHESTPLATE);
                        entries.add(ModItems.KINGDOM4_LEGGINGS);
                        entries.add(ModItems.KINGDOM4_BOOTS);

                        // ITEMS FOR KINGDOM 5
                        entries.add(ModItems.KINGDOM5_ESSENCE);
                        entries.add(ModItems.KINGDOM5_SWORD);
                        entries.add(ModItems.KINGDOM5_SHIELD);
                        entries.add(ModItems.KINGDOM5_BOW);
                        entries.add(ModItems.KINGDOM5_HELMET);
                        entries.add(ModItems.KINGDOM5_CHESTPLATE);
                        entries.add(ModItems.KINGDOM5_LEGGINGS);
                        entries.add(ModItems.KINGDOM5_BOOTS);

                        // ITEMS FOR KINGDOM 6
                        entries.add(ModItems.KINGDOM6_ESSENCE);
                        entries.add(ModItems.KINGDOM6_SWORD);
                        entries.add(ModItems.KINGDOM6_SHIELD);
                        entries.add(ModItems.KINGDOM6_BOW);
                        entries.add(ModItems.KINGDOM6_HELMET);
                        entries.add(ModItems.KINGDOM6_CHESTPLATE);
                        entries.add(ModItems.KINGDOM6_LEGGINGS);
                        entries.add(ModItems.KINGDOM6_BOOTS);

                        // ITEMS FOR KINGDOM 7
                        entries.add(ModItems.KINGDOM7_ESSENCE);
                        entries.add(ModItems.KINGDOM7_SWORD);
                        entries.add(ModItems.KINGDOM7_SHIELD);
                        entries.add(ModItems.KINGDOM7_BOW);
                        entries.add(ModItems.KINGDOM7_HELMET);
                        entries.add(ModItems.KINGDOM7_CHESTPLATE);
                        entries.add(ModItems.KINGDOM7_LEGGINGS);
                        entries.add(ModItems.KINGDOM7_BOOTS);

                        // ITEMS FOR KINGDOM 8
                        entries.add(ModItems.KINGDOM8_ESSENCE);
                        entries.add(ModItems.KINGDOM8_SWORD);
                        entries.add(ModItems.KINGDOM8_SHIELD);
                        entries.add(ModItems.KINGDOM8_BOW);
                        entries.add(ModItems.KINGDOM8_HELMET);
                        entries.add(ModItems.KINGDOM8_CHESTPLATE);
                        entries.add(ModItems.KINGDOM8_LEGGINGS);
                        entries.add(ModItems.KINGDOM8_BOOTS);

                        // ITEMS FOR KINGDOM 9
                        entries.add(ModItems.KINGDOM9_ESSENCE);
                        entries.add(ModItems.KINGDOM9_SWORD);
                        entries.add(ModItems.KINGDOM9_SHIELD);
                        entries.add(ModItems.KINGDOM9_BOW);
                        entries.add(ModItems.KINGDOM9_HELMET);
                        entries.add(ModItems.KINGDOM9_CHESTPLATE);
                        entries.add(ModItems.KINGDOM9_LEGGINGS);
                        entries.add(ModItems.KINGDOM9_BOOTS);

                        // ITEMS FOR KINGDOM 10
                        entries.add(ModItems.KINGDOM10_ESSENCE);
                        entries.add(ModItems.KINGDOM10_SWORD);
                        entries.add(ModItems.KINGDOM10_SHIELD);
                        entries.add(ModItems.KINGDOM10_BOW);
                        entries.add(ModItems.KINGDOM10_HELMET);
                        entries.add(ModItems.KINGDOM10_CHESTPLATE);
                        entries.add(ModItems.KINGDOM10_LEGGINGS);
                        entries.add(ModItems.KINGDOM10_BOOTS);

                        // ITEMS FOR KINGDOM 11
                        entries.add(ModItems.KINGDOM11_ESSENCE);
                        entries.add(ModItems.KINGDOM11_SWORD);
                        entries.add(ModItems.KINGDOM11_SHIELD);
                        entries.add(ModItems.KINGDOM11_BOW);
                        entries.add(ModItems.KINGDOM11_HELMET);
                        entries.add(ModItems.KINGDOM11_CHESTPLATE);
                        entries.add(ModItems.KINGDOM11_LEGGINGS);
                        entries.add(ModItems.KINGDOM11_BOOTS);

                        // ITEMS FOR KINGDOM 12
                        entries.add(ModItems.KINGDOM12_ESSENCE);
                        entries.add(ModItems.KINGDOM12_SWORD);
                        entries.add(ModItems.KINGDOM12_SHIELD);
                        entries.add(ModItems.KINGDOM12_BOW);
                        entries.add(ModItems.KINGDOM12_HELMET);
                        entries.add(ModItems.KINGDOM12_CHESTPLATE);
                        entries.add(ModItems.KINGDOM12_LEGGINGS);
                        entries.add(ModItems.KINGDOM12_BOOTS);

                        // ITEMS FOR KINGDOM 13
                        entries.add(ModItems.KINGDOM13_ESSENCE);
                        entries.add(ModItems.KINGDOM13_SWORD);
                        entries.add(ModItems.KINGDOM13_SHIELD);
                        entries.add(ModItems.KINGDOM13_BOW);
                        entries.add(ModItems.KINGDOM13_HELMET);
                        entries.add(ModItems.KINGDOM13_CHESTPLATE);
                        entries.add(ModItems.KINGDOM13_LEGGINGS);
                        entries.add(ModItems.KINGDOM13_BOOTS);


                    }))
                    .build());

    public static void registerItemGroups()
    {
        Kingdoms.LOGGER.info("Registering item groups for " + Kingdoms.MOD_ID);
    }
}
