package com.springDemo;

public class Janitor {

    private String name;

    public Janitor() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print() {
        System.out.println("Janitor name is " + name);
    }
}
