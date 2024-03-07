package uk.fallingsloth.mc;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.fallingsloth.mc.items.ModItemGroups;
import uk.fallingsloth.mc.items.ModItems;

public class Kingdoms implements ModInitializer {
	public static final String MOD_ID = "kingdoms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}