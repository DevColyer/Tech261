package com.sparta.dc;

public class FizzBuzz {
    public static String getFizzBuzz(int inputNum) {
        // this implementation of string concat is less efficient. Use string builder?
        String outputStr = "";
        if (inputNum % 3 == 0) outputStr += "Fizz";
        if (inputNum % 5 == 0) outputStr += "Buzz";
        if (outputStr.isEmpty()) outputStr = Integer.toString(inputNum);
        return outputStr;
    }
}
