package com.sparta.ah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts given array")
    void checkBubbleSortIntArray() {
        Assertions.assertArrayEquals(new int[]{2, 19, 212}, BubbleSort.bubbleSortIntegerArray(new int[]{19, 212, 2}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts negative values")
    void checkBubbleSortIntArraySortsNegativeValues() {
        Assertions.assertArrayEquals(new int[]{-212, -19, -2}, BubbleSort.bubbleSortIntegerArray(new int[]{-19, -212, -2}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts positive and negative values")
    void checkBubbleSortIntArraySortsPositiveAndNegativeValues() {
        Assertions.assertArrayEquals(new int[]{-212, -19, -2, 2, 300}, BubbleSort.bubbleSortIntegerArray(new int[]{300, 2, -19, -212, -2}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts arrays with 0")
    void checkBubbleSortIntArraySortsArraysContainingZero() {
        Assertions.assertArrayEquals(new int[]{-212, -19, -2, 0}, BubbleSort.bubbleSortIntegerArray(new int[]{-19, 0, -212, -2}) );
    }

}
