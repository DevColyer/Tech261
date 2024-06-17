package com.sparta.dc;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    private static String getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}