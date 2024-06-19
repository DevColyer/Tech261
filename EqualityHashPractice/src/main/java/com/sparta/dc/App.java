package com.sparta.dc;

public class App {
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan("Devin", "Colyer");
        Spartan spartan2 = new Spartan("Devin", "Colyer");

        System.out.println(spartan1 == spartan2);
        System.out.println(spartan1.equals(spartan2));
        System.out.println(spartan1.equals(null));

        System.out.println(spartan1.hashCode() + "\n" + spartan2.hashCode());
    }
}
