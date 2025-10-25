package net.emerald0s.nodumbc;

import net.emerald0s.nodumbc.logic.ChatListener;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoDumbC implements ModInitializer {
	public static final String MOD_ID = "nodumbc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ChatListener.register();
		LOGGER.info("Initializing " + MOD_ID);
	}
}