package uk.fallingsloth.mc.datagen;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import uk.fallingsloth.mc.items.ModItems;

public class ModModelPredicateProvider
{
    public static void registerModModels()
    {
//%KINGDOM_ITEMS%
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
