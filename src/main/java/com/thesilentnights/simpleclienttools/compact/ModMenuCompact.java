package com.thesilentnights.simpleclienttools.compact;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.thesilentnights.simpleclienttools.config.ConfigMenu;
import net.minecraft.client.gui.screen.Screen;

public class ModMenuCompact implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return (ConfigScreenFactory<Screen>) parent -> ConfigMenu.getConfigScreen();
    }
}
