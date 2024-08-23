package com.ismailmesutmujde.methodsandclasses;

public class Musicians {

    // attribute : özellik
    public String name;
    public String instrument;
    public int age;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
    }
}
