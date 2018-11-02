package com.denilson;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Corkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Polly");
        parrot.fly();
        parrot.breathe();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();



    }
}
