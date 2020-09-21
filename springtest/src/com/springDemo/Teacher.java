package com.springDemo;

public class Teacher {

    private String name;

    public Teacher() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print(){
        System.out.println("Teacher name is " + name);
    }
}
