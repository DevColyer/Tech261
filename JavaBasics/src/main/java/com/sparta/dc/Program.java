package com.sparta.dc;

import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        LocalTime timeOfDay = LocalTime.of(21, 0);
        //int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(LocalTime timeOfDay) {
        if (
                timeOfDay.isAfter(LocalTime.of(5, 59))
                        && timeOfDay.isBefore(LocalTime.of(12, 0))
        ) {
            return "Good morning!";
        } else if (
                timeOfDay.isAfter(LocalTime.of(11, 59))
                        && timeOfDay.isBefore(LocalTime.of(18, 0))
        ) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}