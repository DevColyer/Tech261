package com.sparta.dc;

public class App {
    private enum Days{
        MONDAY("Mon", 1),
        TUESDAY("Tue", 2),
        WEDNESDAY("Wed", 3),
        THURSDAY("Thu", 4),
        FRIDAY("Fri", 5),
        SATURDAY("Sat", 6),
        SUNDAY("Sun", 7);

        private String name;
        private int noInWeek;

        Days(String name, int noInWeek) {
            this.name = name;
            this.noInWeek = noInWeek;
        }
    }

    public static void main(String[] args) {

    }
}
