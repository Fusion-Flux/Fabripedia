package net.yourname.modname;

import net.fabricmc.api.ModInitializer;
import net.yourname.modname.blocks.ModNameBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModName implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Mod Name");
	public static final String MOD_ID = "modname";

	@Override
	public void onInitialize() {
		ModNameBlocks.registerBlocks();
	}
}
