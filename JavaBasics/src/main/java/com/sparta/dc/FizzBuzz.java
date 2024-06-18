package com.sparta.dc;

public class FizzBuzz {
    public static String getFizzBuzz(int inputNum) {
        String outputStr = "";
        if (inputNum % 3 == 0) outputStr += "Fizz";
        if (inputNum % 5 == 0) outputStr += "Buzz";
        if (outputStr.isEmpty()) outputStr = Integer.toString(inputNum);
        return outputStr;
    }
}
