package com.sparta.dc;

public class App {
    public static void main(String[] args){
        String string1 = "Yo.";
        String string2 = "Yo.";
        String string3 = new String("Yo.");
        String string4 = new String("Yo.");

        System.out.println(System.identityHashCode(string1));
        System.out.println(string1.hashCode());
        System.out.println(System.identityHashCode(string2));
        System.out.println(string2.hashCode());
        System.out.println(System.identityHashCode(string3));
        System.out.println(string3.hashCode());
        System.out.println(System.identityHashCode(string4));
        System.out.println(string4.hashCode());

        System.out.println(string1 == string2);
        System.out.println(string1 == string4);
        System.out.println(string3 == string4);

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string4));
        System.out.println(string3.equals(string4));
    }
}
