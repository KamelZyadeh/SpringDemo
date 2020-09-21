package com.springDemo;

public class Student {

    private String name;

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void print() {
        System.out.println("student name is " + name);
    }
}
