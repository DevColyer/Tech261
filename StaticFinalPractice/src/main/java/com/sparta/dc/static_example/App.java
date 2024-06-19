package com.sparta.dc.static_example;

public class App {
    public static void main(String[] args){
        Spartan dev = new Spartan();
        Spartan johnny = new Spartan();

        Spartan.printSpartan(dev);
        dev.setName("Dev");
        Spartan.printSpartan(dev);
        johnny.setName("Jimbo");
        Spartan.printSpartan(dev);

        System.out.println(dev.getName() + "\n" + johnny.getName());
    }
}
