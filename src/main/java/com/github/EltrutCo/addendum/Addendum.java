package com.github.EltrutCo.addendum;

import com.github.EltrutCo.addendum.registry.AddendumBlocks;
import com.github.EltrutCo.addendum.registry.AddendumItemGroup;
import com.github.EltrutCo.addendum.registry.AddendumItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addendum implements ModInitializer {
	public static final String MODID = "addendum";
	public static final String MOD_NAME = "Addendum";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {
		AddendumItems.init();
		AddendumBlocks.init();

		log(Level.INFO, "Add-End-Um");
		AddendumItemGroup.registerItemGroups();
	}

	public static void log(Level level, String message){
		LOGGER.log(level, "["+MOD_NAME+"] " + message);
	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
