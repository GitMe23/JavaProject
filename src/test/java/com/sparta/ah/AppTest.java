package com.sparta.ah;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5==5);
    }

    @Test
    @DisplayName("check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(15));
    }

    @Test
    @DisplayName("check that we can return Evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening!", App.greeting(19));
    }

    @Test
    @DisplayName("check that we can return an error message if time of day is out of range")
    void checkWeCanReturnOutOfRangeMessage() {
        Assertions.assertEquals("Time of day entered is out of 24hr range", App.greeting(30));
    }


}
