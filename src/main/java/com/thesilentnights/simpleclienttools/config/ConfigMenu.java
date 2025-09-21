package com.thesilentnights.simpleclienttools.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ConfigMenu {
    static Config config;

    public static void initialize(){
        config = ConfigManager.getConfig();
    }
    public static Screen getConfigScreen() {
        ConfigBuilder builder = ConfigBuilder.create();
        builder.setTitle(Text.translatable("title.simpleclienttools.config")).getOrCreateCategory(Text.literal("mainConfig")).addEntry(ConfigEntryBuilder.create().startBooleanToggle(Text.translatable("name.simpleclienttools.enableSort"), config.isEnableSort()).setSaveConsumer(newValue->config.setEnableSort(newValue)).build());
        return builder.build();
    }
}
