package com.example.xhh.listviewtest;

/**
 * Created by xhh on 2017/11/24.
 */

public class Fruit {
    private String name;
    private String text;

    public Fruit(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
