package com.sparta.dc.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Kata3HamcrestTests {
//    @ParameterizedTest
//    @CsvSource({"Civic", "dad", "rAcEcAr", "abcddcba", "787", "105501", "##!##"})
//    void testValidPalindromes(String input) {
//        assertThat(Kata3.isStringPalindrome(input), is(true));
//    }
//
//    @ParameterizedTest
//    @CsvSource({"Johnny", "Father", "rAcE cAr", "abcdecba", "7987", "104501", "#~!##"})
//    void testInvalidPalindromes(String input) {
//        assertThat(Kata3.isStringPalindrome(input), is(false));
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
        assertThat(Kata3.getLongestPalindrome(testData.input).getFirst(), equalTo(testData.expected[0]));
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
        assertThat(Kata3.getLongestPalindrome(testData.input).toArray(), equalTo(testData.expected));
    }

    static Stream<String> getStringsContainingNoPalindromes() {
        return Stream.of(
                "No lemon, no melon.",
                "M y n a m e J e f f",
                "-J-a-m-e-s- -B-o-n-d- -i-s- -0-0-7-",
                "Make a wish! It's 11:11",
                "Can you tell me what happened in the year 1001?",
                "Sometimes profanity can be censored with special characters such as ####",
                "I         Promise          This              Isn't               A             Palindrome",
                "",
                null
        );
    }

    @ParameterizedTest
    @MethodSource("getStringsContainingNoPalindromes")
    void givenAnyStringContainingNoPalindromesReturnAnEmptyArray(String input) {
        assertThat(Kata3.getLongestPalindrome(input).toArray(), is(emptyArray()));
    }
}
