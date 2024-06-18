package com.sparta.dc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DateTimeException;
import java.time.LocalTime;

public class ProgramTest {

    // example test with junit
//    @Test //Carries metadata, passes to JVM
//    @DisplayName("First basic jUnit test.")
//    public void basicTest() {
//        Assertions.assertTrue(5==5);
//    }

    @ParameterizedTest
    @CsvSource({
            "6, 0",
            "11, 59"
    })
    @DisplayName("Given a time is between 6:00 & 11:59, Then the greeting should be \"Good morning!\"")
    public void testGreetingReturnsGoodMorning(int h, int m) {
        Assertions.assertEquals("Good morning!", Program.getGreeting(LocalTime.of(h, m)));
    }

    @ParameterizedTest
    @CsvSource({
            "12, 0",
            "17, 59"
    })
    @DisplayName("Given a time is between 12:00 & 17:59, Then the greeting should be \"Good afternoon!\"")
    public void testGreetingReturnsGoodAfternoon(int h, int m) {
        Assertions.assertEquals("Good afternoon!", Program.getGreeting(LocalTime.of(h, m)));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "5, 59",
            "18, 0",
            "23, 59"
    })
    @DisplayName("Given a time is between 18:00 & 5:59, Then the greeting should be \"Good evening!\"")
    public void testGreetingReturnsGoodEvening(int h, int m) {
        Assertions.assertEquals("Good evening!", Program.getGreeting(LocalTime.of(h, m)));

    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "24, 0",
            "23, -1",
            "23, 60"
    })
    @DisplayName("Given an invalid time, Then the method should throw DateTimeException | LocalTime range: 00:00:00 <= x <= 23:59:59")
    public void testGreetingThrowsExceptionForInvalidTime(int h, int m) {
        Assertions.assertThrows(DateTimeException.class, () -> Program.getGreeting(LocalTime.of(h, m)));
    }

}
