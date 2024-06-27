package com.sparta.dc;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan spartan;

    @BeforeEach
    void setup() {
        spartan = new Spartan(1, "Dev", "Tech261", LocalDate.of(2024, 6, 10));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Test")
    public class hamcrestSpartanTest{
        @Test
        void checkThatSpartanCalledDev(){
            assertThat(spartan.getName(), equalTo("Dev"));
        }
        @Test
        void checkThatSpartanHasFieldCalledName(){
            assertThat(spartan, hasProperty("name"));
        }

        @Test
        void checkThatSpartanHasFieldCalledCourseSetToTech261(){
            assertThat(spartan, hasProperty("course", equalTo("Tech261")));
        }

    }
    @Nested
    public class HamcrestStringMethods{
        @Test
        void checkThatNameIsNotEmptyOrNull(){
            assertThat(spartan.getName(), is(not(emptyOrNullString())));
        }

        @Test
        void checkThatNameEndsWithEV(){
            assertThat(spartan.getName(), endsWith("ev"));
        }
    }
}
