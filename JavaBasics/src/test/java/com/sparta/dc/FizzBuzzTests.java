package com.sparta.dc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    // reqs print nums in order
    // if % 3 = 0 print "fizz"
    // if % 5 = 0 print "buzz"
    // if both "fizzbuzz"


    @ParameterizedTest
    @CsvSource({    // list of random primes
            "1, 1",
            "2, 2",
            "7, 7",
            "79, 79",
            "281, 281",
            "647, 647",
            "61, 61",
            "317, 317",
            "769, 769"
    })
    @DisplayName("Given an input number, return the input if it's not divisible by 3 | 5")
    void testFizzBuzzReturnsInput(int input, String expected) {
        // act
        String actual = FizzBuzz.getFizzBuzz(input);

        // assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Given number is divisible by 3, print \"Fizz\"")
    void testFizzPrinted(int input) {
        // arrange
        String expected = "Fizz";

        // act
        String actual = FizzBuzz.getFizzBuzz(input);

        // assert
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Given number is divisible by 5, print \"Buzz\"")
    public void testBuzzPrinted(int input) {
        // arrange
        String expected = "Buzz";

        // act
        String actual = FizzBuzz.getFizzBuzz(input);

        // assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("Given number is divisible by 3 & 5, print \"FizzBuzz\"")
    public void testFizzBuzzPrinted(int input) {
        // arrange
        String expected = "FizzBuzz";

        // act
        String actual = FizzBuzz.getFizzBuzz(input);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}
