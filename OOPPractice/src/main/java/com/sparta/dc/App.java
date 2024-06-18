package com.sparta.dc;

public class App {
    public static void main(String[] args){
        Dog myDog = new Dog("Captain", "Bernese Mountain Dog", 4);
        Cat myCat = new Cat("Grubs", "Scandinavian Longhair", 12);

        myDog.play("Boss");
        myCat.play();
    }
}
