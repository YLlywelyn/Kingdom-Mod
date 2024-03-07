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

//%KINGDOM_ITEMS%
                    }))
                    .build());

    public static void registerItemGroups()
    {
        Kingdoms.LOGGER.info("Registering item groups for " + Kingdoms.MOD_ID);
    }
}
