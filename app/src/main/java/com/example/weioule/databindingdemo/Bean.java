package com.example.weioule.databindingdemo;

public class Bean {
    public String title;
    public String name;
    public boolean visible;

    public Bean(String name) {
        this.name = name;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
