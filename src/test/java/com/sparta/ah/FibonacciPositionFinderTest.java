package com.sparta.ah;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciPositionFinderTest {

    @Test
    @DisplayName("check getPosition returns 0 for zero position")
    void checkGetPositionReturnsZero() {
        Assertions.assertEquals(0, FibonacciPositionFinder.getPosition(0));
    }

    @Test
    @DisplayName("check getPosition returns 1 for position 1")
    void checkGetPositionReturnsOneForPositionOne() {
        Assertions.assertEquals(1, FibonacciPositionFinder.getPosition(1));
    }

    @Test
    @DisplayName("check getPosition returns 1 for position 2")
    void checkGetPositionReturnsOneForPositionTwo() {
        Assertions.assertEquals(1, FibonacciPositionFinder.getPosition(2));
    }

    @Test
    @DisplayName("check getPosition returns 2 for position 3")
    void checkGetPositionReturnsTwoForPositionThree() {
        Assertions.assertEquals(2, FibonacciPositionFinder.getPosition(3));
    }

    @Test
    @DisplayName("check getPosition returns 3 for position 4")
    void checkGetPositionReturnsThreeForPositionFour() {
        Assertions.assertEquals(3, FibonacciPositionFinder.getPosition(4));
    }


    @Test
    @DisplayName("check getPosition returns 5 for 5th position")
    void checkGetPositionReturnsFive() {
        Assertions.assertEquals(5, FibonacciPositionFinder.getPosition(5));
    }

    @Test
    @DisplayName("check getPosition returns 13 for position 7")
    void checkGetPositionReturnsThirteenForPositionSeven() {
        Assertions.assertEquals(13, FibonacciPositionFinder.getPosition(7));
    }

    @Test
    @DisplayName("check getPosition returns 0 for a negative value")
    void checkGetPositionReturnsZeroForNegativeValue() {
        Assertions.assertEquals(0, FibonacciPositionFinder.getPosition(-7));
    }

}
