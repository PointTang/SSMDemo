package com.point.spring;

/**
 * Created by Point on 2017/6/12.
 */
public class Bye implements Action{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void greet() {
        System.out.println("Goodbye " + name);
    }
}
