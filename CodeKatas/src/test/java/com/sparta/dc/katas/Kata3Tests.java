package com.sparta.dc.katas;

import com.sparta.dc.katas.logging.CustomFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

//20/06/24
public class Kata3Tests {

//    @ParameterizedTest
//    @CsvSource({
//            "Civic",
//            "dad",
//            "rAcEcAr",
//            "abcddcba",
//            "787",
//            "105501",
//            "##!##"
//    })
//    void testValidPalindromes(String input) {
//        boolean result = Kata3.isStringPalindrome(input);
//        Assertions.assertTrue(result);
//    }
//
//    @ParameterizedTest
//    @CsvSource({
//            "Johnny",
//            "Father",
//            "rAcE cAr",
//            "abcdecba",
//            "7987",
//            "104501",
//            "#~!##"
//    })
//    void testInvalidPalindromes(String input) {
//        boolean result = Kata3.isStringPalindrome(input);
//        Assertions.assertFalse(result);
//    }
//
//    static Stream<Arguments> getBadData() {
//        return Stream.of(
//                Arguments.of(""),
//                Arguments.of("7"),
//                Arguments.of(":)"),
//                Arguments.of("JJ"),
//                Arguments.of((Object) null)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("getBadData")
//    void testInvalidInputs(String input) {
//        boolean result = Kata3.isStringPalindrome(input);
//        Assertions.assertFalse(result);
//    }
//
//    static Stream<StringToStringArrayTestData> getWordsFromStringData() {
//        return Stream.of(
//                new StringToStringArrayTestData("My name Jeff", new String[]{"my", "name", "jeff"}),
//                new StringToStringArrayTestData("My! Name! Jeff!", new String[]{"my", "name", "jeff"}),
//                new StringToStringArrayTestData("        My!             Name!            Jeff!            ", new String[]{"my", "name", "jeff"}),
//                new StringToStringArrayTestData("M y n a m e J e f f", new String[]{"m", "y", "n", "a", "m", "e", "j", "e", "f", "f"}),
//                new StringToStringArrayTestData("-M-y- -n-a-m-e- -J-e-f-f-", new String[]{"my", "name", "jeff"}),
//                new StringToStringArrayTestData("Jeff", new String[]{"jeff"}),
//                new StringToStringArrayTestData("", new String[]{}),
//                new StringToStringArrayTestData(null, new String[]{}));
//    }
//
//    @ParameterizedTest
//    @MethodSource("getWordsFromStringData")
//    void testStringExtraction(StringToStringArrayTestData testData) {
//        long startTime1 = System.nanoTime();
//        ArrayList<String> actual = Kata3.getWordsFromString1(testData.input);
//        long endTime1 = System.nanoTime();
//        System.out.println("getWordsFromString1 execution time: " + (endTime1 - startTime1) + " ns");
//        Assertions.assertArrayEquals(testData.expected, actual.toArray());
//
//        long startTime2 = System.nanoTime();
//        actual = Kata3.getWordsFromString2(testData.input);
//        long endTime2 = System.nanoTime();
//        System.out.println("getWordsFromString2 execution time: " + (endTime2 - startTime2) + " ns");
//        Assertions.assertArrayEquals(testData.expected, actual.toArray());
//    }

    static Stream<StringToStringArrayTestData> getStringsContainingOneLongestPalindrome() {
        return Stream.of(
                new StringToStringArrayTestData("Madam Arora teaches malayalam at noon.", new String[]{"malayalam"}),
                new StringToStringArrayTestData("Madam? Madam, please? Madam, please wait!", new String[]{"madam"}),
                new StringToStringArrayTestData("-A-n-n-a- -a-n-d- -h-e-r- -k-a-y-a-k- -w-e-r-e- -s-e-e-n- -o-n- -t-h-e- -l-a-k-e-.-", new String[]{"kayak"}),
                new StringToStringArrayTestData("        Dad         ", new String[]{"dad"})
        );
    }

    @ParameterizedTest
    @MethodSource("getStringsContainingOneLongestPalindrome")
    void givenAnyStringContainingAPalindromeReturnAnArrayContainingOneStringOfThatPalindrome(StringToStringArrayTestData testData) {
        long startTime1 = System.nanoTime();
        ArrayList<String> actual = Kata3.getLongestPalindrome(testData.input);
        long endTime1 = System.nanoTime();
        System.out.println("OneLongestPalindrome execution time: " + (endTime1 - startTime1) + " ns");
        Assertions.assertArrayEquals(testData.expected, actual.toArray());
    }

    static Stream<StringToStringArrayTestData> getStringsContainingMultipleLongestPalindromes() {
        return Stream.of(
                new StringToStringArrayTestData("The madam was last in her kayak.", new String[]{"madam", "kayak"}),
                new StringToStringArrayTestData("Anna          and           Otto        went             for             a        drive          in          their         car.", new String[]{"anna", "otto"}),
                new StringToStringArrayTestData("Eve and Ava found a radar and a rotor in the attic", new String[]{"radar", "rotor"}),
                new StringToStringArrayTestData("Dad Mum Dad Mum DaD MUM DAD mUM", new String[]{"dad", "mum"}),
                new StringToStringArrayTestData("-I- -g-o-t- -t-h-i-s- -n-e-w- -r-a-c-i-n-g- -g-a-m-e- -a-n-d- -I-'-m- -s-t-u-c-k- -o-n- -t-h-e- -c-i-v-i-c- -l-e-v-e-l-.-", new String[]{"civic", "level"})
        );
    }

    @ParameterizedTest
    @MethodSource("getStringsContainingMultipleLongestPalindromes")
    void givenAnyStringContainingMultiplePalindromesReturnAnArrayOfTheLargestPalindromesContained(StringToStringArrayTestData testData) {
        long startTime1 = System.nanoTime();
        ArrayList<String> actual = Kata3.getLongestPalindrome(testData.input);
        long endTime1 = System.nanoTime();
        System.out.println("MultipleLongestPalindromes execution time: " + (endTime1 - startTime1) + " ns");
        Assertions.assertArrayEquals(testData.expected, actual.toArray());
    }

    static Stream<StringToStringArrayTestData> getStringsContainingNoPalindromes() {
        return Stream.of(
                new StringToStringArrayTestData("No lemon, no melon.", new String[]{}),
                new StringToStringArrayTestData("M y n a m e J e f f", new String[]{}),
                new StringToStringArrayTestData("-J-a-m-e-s- -B-o-n-d- -i-s- -0-0-7-", new String[]{}),
                new StringToStringArrayTestData("Make a wish! It's 11:11", new String[]{}),
                new StringToStringArrayTestData("Can you tell me what happened in the year 1001?", new String[]{}),
                new StringToStringArrayTestData("Sometimes profanity can be censored with special characters such as ####", new String[]{}),
                new StringToStringArrayTestData("I         Promise          This              Isn't               A             Palindrome", new String[]{}),
                new StringToStringArrayTestData("", new String[]{}),
                new StringToStringArrayTestData(null, new String[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("getStringsContainingNoPalindromes")
    void givenAnyStringContainingNoPalindromesReturnAnEmptyArray(StringToStringArrayTestData testData) {
        long startTime1 = System.nanoTime();
        ArrayList<String> actual = Kata3.getLongestPalindrome(testData.input);
        long endTime1 = System.nanoTime();
        System.out.println("NoPalindromes execution time: " + (endTime1 - startTime1) + " ns");
        Assertions.assertArrayEquals(testData.expected, actual.toArray());
    }
}
