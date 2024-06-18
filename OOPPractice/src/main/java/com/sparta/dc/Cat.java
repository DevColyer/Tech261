package com.sparta.dc;

public class Cat extends Animal{
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(getName() + " wants to sleep.\n");
    }
}
