package com.sparta.dc.katas;

// 18/06/2024
public class Kata1 {
    public static int getIntegerConcat(int[] arr) {
        StringBuilder concatVal = new StringBuilder();
        for (int i : arr) {
            concatVal.append(Math.abs(i));
        }

        return concatVal.toString().isEmpty() ? 0 : Integer.parseInt(concatVal.toString());
    }
}
