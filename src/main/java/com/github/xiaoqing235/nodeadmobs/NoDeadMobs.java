package com.github.xiaoqing235.nodeadmobs;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoDeadMobs implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("NoDeathMobs");

    @Override
    public void onInitialize() {
        NoDeadMobs.LOGGER.info("NoDeathMobs initialized.");
    }
}
