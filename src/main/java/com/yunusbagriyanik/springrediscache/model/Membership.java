package com.yunusbagriyanik.springrediscache.model;

public enum Membership {
    BASIC("Basic"),
    PREMIUM("Premium"),
    VIP("VIP");

    private final String level;

    Membership(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }
}
