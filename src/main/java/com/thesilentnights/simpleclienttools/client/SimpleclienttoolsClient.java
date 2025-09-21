package com.thesilentnights.simpleclienttools.client;

import com.thesilentnights.simpleclienttools.config.ConfigManager;
import com.thesilentnights.simpleclienttools.config.ConfigMenu;
import net.fabricmc.api.ClientModInitializer;

public class SimpleclienttoolsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ConfigManager.initialize();
        ConfigMenu.initialize();
    }
}
