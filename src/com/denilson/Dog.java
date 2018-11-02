package com.denilson;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is breathing");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" is breathing in and out");
    }
}
