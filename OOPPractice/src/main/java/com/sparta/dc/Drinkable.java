package com.sparta.dc;

public interface Drinkable {
    int litres =9;
    default void drink(){
        System.out.println("me drink");
    }
}
