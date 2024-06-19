package com.sparta.dc.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

// 18/06/2024 - consider future extensions to your code, use single tests for these cases
//              tests should test for ONE particular outcome not each case
public class Kata1Tests {
    static Stream<Arguments> getIntArrayToIntTestData() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 2, 3}, 123), // leading 0s
                Arguments.of(new int[]{1, 23, 4, 5}, 12345), // multiple digits
                Arguments.of(new int[]{3, -6, -2, -8}, 3628), // handle negatives
                Arguments.of(new int[]{1}, 1), // single digit
                Arguments.of(new int[]{}, 0) // empty array
        );
    }

    @ParameterizedTest
    @MethodSource("getIntArrayToIntTestData")
    @DisplayName("Given a series of integers, return the integer value of the appended digits")
    void testGetIntegerConcat(int[] input, int expected) {
        int actual = Kata1.getIntegerConcat(input);
        Assertions.assertEquals(expected, actual);
    }

    // good test
    static Stream<Arguments> getLeadingZeroData() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 2, 3}, 123),
                Arguments.of(new int[]{0, 0, 0, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 0, 3}, 103)
                );// leading 0s
    }

    @ParameterizedTest
    @MethodSource("getLeadingZeroData")
    void testLeadingZeros(int[] input,int expected){
        int actual = Kata1.getIntegerConcat(input);
        Assertions.assertEquals(expected, actual);

    }

}
