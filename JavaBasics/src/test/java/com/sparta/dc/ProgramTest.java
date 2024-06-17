package com.sparta.dc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Given a time is between 5 & 12, Then the greeting should be \"Good morning!\"")
    public void testGreetingReturnsGoodMorning() {
        for (int i = 5; i < 13; i++) {
            Assertions.assertEquals("Good morning!", Program.getGreeting(i));
        }
    }

    @Test
    @DisplayName("Given a time is between 12 & 18, Then the greeting should be \"Good afternoon!\"")
    public void testGreetingReturnsGoodAfternoon() {
        for (int i = 12; i < 19; i++) Assertions.assertEquals("Good afternoon!", Program.getGreeting(i));
    }

    @Test
    @DisplayName("Given a time is between 19 & 4, Then the greeting should be \"Good evening!\"")
    public void testGreetingReturnsGoodEvening() {
        for (int i = 0; i < 25; i++) {
            if (i < 5 || i > 18) {
                Assertions.assertEquals("Good evening!", Program.getGreeting(i));
            }
        }
    }

    @Test
    @DisplayName("Given a time is between invalid, Then the greeting should be \"ERROR MSG HERE\"")
    public void testGreetingReturnsInvalid() {
        Assertions.assertEquals("ERROR MSG HERE", Program.getGreeting(-1));
        Assertions.assertEquals("ERROR MSG HERE", Program.getGreeting(25));

    }
}
