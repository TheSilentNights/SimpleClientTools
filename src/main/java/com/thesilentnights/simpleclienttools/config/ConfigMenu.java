package com.thesilentnights.simpleclienttools.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ConfigMenu {
    static ConfigBuilder builder = ConfigBuilder.create();
    static Screen configScreen;

    public static void initialize(){
        builder.setTitle(Text.translatable("title.simpleclienttools.config"))
                .getOrCreateCategory(Text.literal("re"));
        configScreen = builder.build();
    }

    public static Screen getConfigScreen() {
        return configScreen;
    }
}
