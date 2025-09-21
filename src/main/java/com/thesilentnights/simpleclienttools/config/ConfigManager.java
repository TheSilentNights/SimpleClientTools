package com.thesilentnights.simpleclienttools.config;

public class ConfigManager {
    static Config config;
    public static void initialize(){
        //TODO load config from file
        config = new Config();
    }

    public static Config getConfig(){
        return config;
    }
}
