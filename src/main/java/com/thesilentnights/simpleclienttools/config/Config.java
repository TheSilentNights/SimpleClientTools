package com.thesilentnights.simpleclienttools.config;

public class Config {
    boolean main;
    boolean enableSort;

    public Config() {
        this.main = false;
        this.enableSort = false;
    }

    public Config(boolean main, boolean enableSort) {
        this.main = main;
        this.enableSort = enableSort;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isEnableSort() {
        return enableSort;
    }

    public void setEnableSort(boolean enableSort) {
        this.enableSort = enableSort;
    }
}
