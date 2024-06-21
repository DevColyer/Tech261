package com.sparta.dc.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//20/06/24
public class Kata3 {
    public static final int MINIMUM_STR_LEN = 3;

    // less efficient
//    public static boolean isStringPalindrome(String input) {
//        if (input == null || input.length() < MINIMUM_STR_LEN) return false;
//
//        StringBuilder caseAdjustedInput = new StringBuilder();
//        caseAdjustedInput.append(input.toLowerCase());
//
//        int frontIndex = 0;
//        int backIndex = input.length() - 1;
//
//        while (true) {
//            if (frontIndex >= backIndex) return true;
//            if (frontIndex >= input.length() - 1 || backIndex <= 0) return false;
//            if (caseAdjustedInput.charAt(frontIndex) != caseAdjustedInput.charAt(backIndex)) return false;
//            frontIndex++;
//            backIndex--;
//        }
//    }

    // manual char manipulation
    public static ArrayList<String> getWordsFromString1(String input) {
        if (input == null) return new ArrayList<String>();

        ArrayList<String> finalStrings = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                stringBuilder.append(charArray[i]);
            }
            if (!stringBuilder.isEmpty() && (charArray[i] == ' ' || i == charArray.length - 1)) {
                finalStrings.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }

        return finalStrings;
    }

    // regex
    public static ArrayList<String> getWordsFromString2(String input) {
        if (input == null) return new ArrayList<String>();

        ArrayList<String> finalStrings = new ArrayList<>();
        input = input.replaceAll("[^a-zA-Z ]+", "");

        Pattern pattern = Pattern.compile("([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input.toLowerCase());

//        finalStrings = new ArrayList<>(List.of(input.toLowerCase().split(" ")));

        while (matcher.find()) {
            finalStrings.add(matcher.group());
        }

        return finalStrings;
    }

    // more efficient
    public static boolean isStringPalindrome(String input) {
        if (input == null || input.length() < MINIMUM_STR_LEN) return false;

        input = input.toLowerCase();
        return new StringBuilder(input).reverse().toString().equals(input);
    }

    public static ArrayList<String> getLongestPalindrome(String input) {
        if (input == null || input.length() < MINIMUM_STR_LEN) return new ArrayList<>();

        ArrayList<String> longestPalindromes = new ArrayList<>();
        ArrayList<String> wordsToCheck = getWordsFromString1(input);
        int longestPalindromeLen = 0;

        for (String word : wordsToCheck) {
            if (isStringPalindrome(word) && !longestPalindromes.contains(word)) {
                if (word.length() > longestPalindromeLen) {
                    longestPalindromes.clear();
                    longestPalindromes.add(word);
                    longestPalindromeLen = word.length();
                } else if (word.length() == longestPalindromeLen) {
                    longestPalindromes.add(word);
                }
            }
        }
        return longestPalindromes;
    }
}
