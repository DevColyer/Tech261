package com.sparta.dc.katas;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

// 19/06/24
public class Kata2Tests {
    static Stream<Arguments> getLessThanThreeData() {
        return Stream.of(
                Arguments.of((Object) new int[]{3, 4}),
                Arguments.of((Object) new int[]{0}),
                Arguments.of((Object) (int[])null),
                Arguments.of((Object) new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("getLessThanThreeData")
    void checkArrayShorterThanThree(int[] input) {
        boolean actual = Kata2.hasXInARow(input);
        Assertions.assertFalse(actual);
    }

    static Stream<Arguments> getNoMatchingData() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 0, 0}),
                Arguments.of((Object) new int[]{0, 2, 0}),
                Arguments.of((Object) new int[]{0, 0, 3}),
                Arguments.of((Object) new int[]{1, 2, 3}),
                Arguments.of((Object) new int[]{0, -1, 0, 0}),
                Arguments.of((Object) new int[]{0, 0, -2, 0}),
                Arguments.of((Object) new int[]{2, 3, -3, 3, 5, 7}),
                Arguments.of((Object) new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arguments.of((Object) new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}),
                Arguments.of((Object) new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, -1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("getNoMatchingData")
    void checkNoMatchingData(int[] input) {
        boolean actual = Kata2.hasXInARow(input);
        Assertions.assertFalse(actual);
    }

    static Stream<Arguments> getMatchingData() {
        return Stream.of(
                Arguments.of((Object) new int[]{0, 0, 0}),
                Arguments.of((Object) new int[]{1, 0, 0, 0}),
                Arguments.of((Object) new int[]{0, 0, 0, 2}),
                Arguments.of((Object) new int[]{0, -3, 0, 0, 0}),
                Arguments.of((Object) new int[]{2, 3, 3, 3, 5, 7}),
                Arguments.of((Object) new int[]{2, -3, -3, -3, 5, 7}),
                Arguments.of((Object) new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1}),
                Arguments.of((Object) new int[]{2, -3, -3, -3, 5, 7}),
                Arguments.of((Object) new int[]{2, 3, 3, 3, 5, 7, 2, 3, 3, 3, 5, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("getMatchingData")
    void checkMatchingData(int[] input) {
        boolean actual = Kata2.hasXInARow(input);
        Assertions.assertTrue(actual);
    }
}
