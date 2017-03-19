package com.company.Lesson21_OOP.OOP_test;

/**
 * Created by Саша on 17.01.2017.
 */
public abstract class Test01 {
    private String name;


    public Test01(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String method() {
        return "Text";
    }

    public abstract void met();

}
