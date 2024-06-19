package com.sparta.dc;

// state and behaviour
public abstract class Animal implements Sleepable, Drinkable{
    private String name;
    private String breed;
    private int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void play(){
        System.out.println(name + " wants to play.\n");
    }

    //implements Sleepable, Drinkable
    @Override
    public void drink() {
        Sleepable.super.drink();
        Drinkable.super.drink();
        System.out.println(Sleepable.litres);
        // you can choose which interface to use? or both?
    }
}
