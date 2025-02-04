package com.lavandula.lavglen;

import com.lavandula.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Commenting to match lines with KaupenJoe
public class LavenderGlen implements ModInitializer {
	public static final String MOD_ID = "lavglen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}