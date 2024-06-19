package com.sparta.dc.katas;

public class App {
    public static void main(String[] args) {
        System.out.println("Week 2 Kata 1\n");
        System.out.println("input data: 1, 0, 2, 4");
        System.out.println(getIntegerConcat(new int[]{1, 0, 2, 4}));
    }

    // 18/06/2024
    public static int getIntegerConcat(int[] arr) {
        StringBuilder concatVal = new StringBuilder();
        for (int i : arr) {
            concatVal.append(Integer.toString(Math.abs(i)));
        }

        return concatVal.toString().isEmpty() ? 0 : Integer.parseInt(concatVal.toString());
    }
}