package com.sparta.ah;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciPositionFinderTest {

    @Test
    @DisplayName("check getFibValueAtIndex returns 0 for zero position")
    void checkGetFibValueAtIndexReturnsZero() {
        Assertions.assertEquals(0, FibonacciPositionFinder.getFibValueAtIndex(0));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 1 for position 1")
    void checkGetFibValueAtIndexReturnsOneForPositionOne() {
        Assertions.assertEquals(1, FibonacciPositionFinder.getFibValueAtIndex(1));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 1 for position 2")
    void checkGetFibValueAtIndexReturnsOneForPositionTwo() {
        Assertions.assertEquals(1, FibonacciPositionFinder.getFibValueAtIndex(2));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 2 for position 3")
    void checkGetFibValueAtIndexReturnsTwoForPositionThree() {
        Assertions.assertEquals(2, FibonacciPositionFinder.getFibValueAtIndex(3));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 3 for position 4")
    void checkGetFibValueAtIndexReturnsThreeForPositionFour() {
        Assertions.assertEquals(3, FibonacciPositionFinder.getFibValueAtIndex(4));
    }


    @Test
    @DisplayName("check getFibValueAtIndex returns 5 for 5th position")
    void checkGetFibValueAtIndexReturnsFive() {
        Assertions.assertEquals(5, FibonacciPositionFinder.getFibValueAtIndex(5));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 13 for position 7")
    void checkGetFibValueAtIndexThirteenForPositionSeven() {
        Assertions.assertEquals(13, FibonacciPositionFinder.getFibValueAtIndex(7));
    }

    @Test
    @DisplayName("check getFibValueAtIndex returns 0 for a negative value")
    void checkGetFibValueAtIndexZeroForNegativeValue() {
        Assertions.assertEquals(0, FibonacciPositionFinder.getFibValueAtIndex(-7));
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of 0 given index 0")
    void checkGetFibonacciSequenceReturnsArrayWithZero() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(0).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of 0 and 1 given index 1")
    void checkGetFibonacciSequenceReturnsFirstTwoInSequence() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0,1}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(1).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of {0,1,1} given index 2")
    void checkGetFibonacciSequenceReturnsFirstThreeInSequence() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0,1,1}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(2).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of {0,1,1,2} given index 3")
    void checkGetFibonacciSequenceReturnsFirstFourInSequence() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,2}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(3).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of {0,1,1,2,3} given index 4")
    void checkGetFibonacciSequenceReturnsFirstFiveInSequence() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,2,3}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(4).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of first ten in sequence given index 9")
    void checkGetFibonacciSequenceReturnsFirstTenInSequence() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,2,3,5,8,13,21,34}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(9).toArray());
    }

    @Test
    @DisplayName("check getFibonacciSequence returns an array of 0 given null")
    void checkGetFibonacciSequenceReturnsZeroGivenNull() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{0}));
        Assertions.assertArrayEquals(expected.toArray(),
                FibonacciPositionFinder.getFibonacciSequence(null).toArray());
    }


}
