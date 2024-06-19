package com.sparta.dc.static_example;

public class Spartan {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Spartan.name = name;
    }

    private static String name;

    public static void printSpartan(Spartan spartan){
        System.out.println("name: " + spartan.getName());
    }
}
