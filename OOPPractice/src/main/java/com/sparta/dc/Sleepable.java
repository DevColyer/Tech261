package com.sparta.dc;

public interface Sleepable {
    int litres =3;
    default void drink(){
        System.out.println("me sleep");
    }
}
