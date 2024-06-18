package com.sparta.dc;

public class FizzBuzz {
    public static String getFizzBuzz(int inputNum) {
        // this implementation of string concat is less efficient. Use string builder?
        StringBuilder outputStr = new StringBuilder();
        if (inputNum % 3 == 0) outputStr .append("Fizz");
        if (inputNum % 5 == 0) outputStr .append("Buzz");
        if (outputStr.isEmpty()) outputStr.append(inputNum);
        return outputStr.toString();
    }
}
