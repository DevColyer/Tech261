package com.sparta.dc;

import java.time.LocalTime;

public class Program {
    public static final LocalTime MORNING_LOWER = LocalTime.of(5, 59);
    public static final LocalTime MORNING_UPPER = LocalTime.of(12, 0);
    public static final LocalTime AFTERNOON_LOWER = LocalTime.of(11, 59);
    public static final LocalTime AFTERNOON_UPPER = LocalTime.of(18, 0);

    public static void main(String[] args) {
        LocalTime timeOfDay = LocalTime.of(21, 0);
        //int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(LocalTime timeOfDay) {
        if (timeOfDay.isAfter(MORNING_LOWER) && timeOfDay.isBefore(MORNING_UPPER)) {
            return "Good morning!";
        } else if (timeOfDay.isAfter(AFTERNOON_LOWER) && timeOfDay.isBefore(AFTERNOON_UPPER)) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}