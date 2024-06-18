package com.sparta.dc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PracticeAlgorithmTests {

    private static class SortTestData {
        int[] input, expected;

        SortTestData(int[] _input, int[] _expected) {
            input = _input;
            expected = _expected;
        }
    }

    static Stream<SortTestData> getTestData() {
        return Stream.of(
                new SortTestData(new int[]{100, 7, 9, 60, 6, 42, 8}, new int[]{6, 7, 8, 9, 42, 60, 100}), // randomised
                new SortTestData(new int[]{5, 19, 29, 44, 49, 67, 87}, new int[]{5, 19, 29, 44, 49, 67, 87}), // already sorted
                new SortTestData(new int[]{79, 79, 78, 73, 68, 31, 30}, new int[]{30, 31, 68, 73, 78, 79, 79}), // inverted
                new SortTestData(new int[]{85, 16, 85, 16, 16, 42, 11}, new int[]{11, 16, 16, 16, 42, 85, 85}), // duplicates
                new SortTestData(new int[]{72}, new int[]{72}), // single value
                new SortTestData(new int[]{}, new int[]{}) // empty
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    @DisplayName("Given any array, it is sorted appropriately")
    void testQuicksort(SortTestData testData) {
        PracticeAlgorithms.quickSort(testData.input, 0, testData.input.length - 1);
        Assertions.assertArrayEquals(testData.expected, testData.input);
    }
}
