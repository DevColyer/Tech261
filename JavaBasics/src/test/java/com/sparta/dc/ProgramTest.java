package com.sparta.dc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalTime;

public class ProgramTest {

    // example test with junit
//    @Test //Carries metadata, passes to JVM
//    @DisplayName("First basic jUnit test.")
//    public void basicTest() {
//        Assertions.assertTrue(5==5);
//    }
//    @Test
//    @DisplayName("Given a time of 21, Then the greeting should be Good Evening")
//    public void testGreetingReturnsGoodEvening() {
//        int time = 21;
//        Assertions.assertEquals("Good evening!", Program.getGreeting(time));
//    }

    @Test
    @DisplayName("Given a time is between 6:00 & 11:59, Then the greeting should be \"Good morning!\"")
    public void testGreetingReturnsGoodMorning() {
        for (int h = 6; h < 12; h++) { // hour
            for (int m = 0; m < 60; m++) { // minute
                Assertions.assertEquals("Good morning!", Program.getGreeting(LocalTime.of(h, m)));
            }
        }
    }

    @Test
    @DisplayName("Given a time is between 12:00 & 17:59, Then the greeting should be \"Good afternoon!\"")
    public void testGreetingReturnsGoodAfternoon() {
        for (int h = 12; h < 18; h++) { // hour
            for (int m = 0; m < 60; m++) { // minute
                Assertions.assertEquals("Good afternoon!", Program.getGreeting(LocalTime.of(h, m)));
            }
        }
    }

    @Test
    @DisplayName("Given a time is between 18:00 & 5:59, Then the greeting should be \"Good evening!\"")
    public void testGreetingReturnsGoodEvening() {
        for (int h = 0; h < 6; h++) { // hour
            for (int m = 0; m < 60; m++) { // minute
                Assertions.assertEquals("Good evening!", Program.getGreeting(LocalTime.of(h, m)));
            }
        }
        for (int h = 18; h < 24; h++) { // hour
            for (int m = 0; m < 60; m++) { // minute
                Assertions.assertEquals("Good evening!", Program.getGreeting(LocalTime.of(h, m)));
            }
        }
    }

    @Test
    @DisplayName("Given an invalid time, Then the method should throw DateTimeException | LocalTime range: 00:00:00 <= x <= 23:59:59")
    public void testGreetingThrowsExceptionForInvalidTime() {
        Assertions.assertThrows(DateTimeException.class, () -> Program.getGreeting(LocalTime.of(-1, 0)));
        Assertions.assertThrows(DateTimeException.class, () -> Program.getGreeting(LocalTime.of(24, 0)));
        Assertions.assertThrows(DateTimeException.class, () -> Program.getGreeting(LocalTime.of(23, -1)));
        Assertions.assertThrows(DateTimeException.class, () -> Program.getGreeting(LocalTime.of(23, 60)));
    }

//    @Test
//    @DisplayName("Given a time is between invalid, Then the greeting should be \"ERROR MSG HERE\"")
//    public void testGreetingReturnsInvalid() {
//        Assertions.assertEquals("ERROR MSG HERE", Program.getGreeting(-1));
//        Assertions.assertEquals("ERROR MSG HERE", Program.getGreeting(25));
//
//    }
}
