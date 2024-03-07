package uk.fallingsloth.mc.datagen;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import uk.fallingsloth.mc.items.ModItems;

public class ModModelPredicateProvider
{
    public static void registerModModels()
    {
        // ITEMS FOR KINGDOM 1
        registerBow(ModItems.KINGDOM1_BOW);

        // ITEMS FOR KINGDOM 2
        registerBow(ModItems.KINGDOM2_BOW);

        // ITEMS FOR KINGDOM 3
        registerBow(ModItems.KINGDOM3_BOW);

        // ITEMS FOR KINGDOM 4
        registerBow(ModItems.KINGDOM4_BOW);

        // ITEMS FOR KINGDOM 5
        registerBow(ModItems.KINGDOM5_BOW);

        // ITEMS FOR KINGDOM 6
        registerBow(ModItems.KINGDOM6_BOW);

        // ITEMS FOR KINGDOM 7
        registerBow(ModItems.KINGDOM7_BOW);

        // ITEMS FOR KINGDOM 8
        registerBow(ModItems.KINGDOM8_BOW);

        // ITEMS FOR KINGDOM 9
        registerBow(ModItems.KINGDOM9_BOW);

        // ITEMS FOR KINGDOM 10
        registerBow(ModItems.KINGDOM10_BOW);

        // ITEMS FOR KINGDOM 11
        registerBow(ModItems.KINGDOM11_BOW);

        // ITEMS FOR KINGDOM 12
        registerBow(ModItems.KINGDOM12_BOW);

        // ITEMS FOR KINGDOM 13
        registerBow(ModItems.KINGDOM13_BOW);


    }

    private static void registerBow(Item bow)
    {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) ->
                {
                    if (entity == null) return 0f;
                    if (entity.getActiveItem() != stack) return 0f;
                    return (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20f;
                });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) ->
                {
                    return (entity != null && entity.isUsingItem() && entity.getActiveItem() == stack) ? 1f : 0f;
                });
    }
}
