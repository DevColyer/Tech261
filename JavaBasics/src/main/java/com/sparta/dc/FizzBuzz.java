package com.sparta.dc;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int inputNum) {
        return Integer.toString(inputNum);
    }

    public static String getFizzBuzz(int inputNum) {
        String outputStr = "";
        if (inputNum % 3 == 0) outputStr += "Fizz";
        if (inputNum % 5 == 0) outputStr += "Buzz";
        return outputStr;
    }
}
