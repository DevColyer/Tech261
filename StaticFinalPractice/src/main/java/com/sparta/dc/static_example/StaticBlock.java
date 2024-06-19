package com.sparta.dc.static_example;

import java.util.ArrayList;

public class StaticBlock {
    private static ArrayList<String> names = new ArrayList<>();

    static{ //block is only run once when class is loaded in JVM mem
        names.add("Dev");
        names.add("Billy");
    }

    public static void main(String[] args){
        System.out.println(names);
    }
}
