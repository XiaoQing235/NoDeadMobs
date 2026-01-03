package com.github.xiaoqing235.nodeathmobs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoDeathMobs implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("NoDeathMobs");

    @Override
    public void onInitialize() {
        NoDeathMobs.LOGGER.info("NoDeathMobs initialized.");
    }
}
