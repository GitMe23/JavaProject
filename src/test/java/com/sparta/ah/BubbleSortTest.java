package com.sparta.ah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("Checking that bubbleSortIntArray returns empty array given an empty array")
    void checkBubbleSortIntArrayReturnsEmptyArray() {
        Assertions.assertArrayEquals(new int[]{}, BubbleSort.bubbleSortIntegerArray(new int[]{}) );
    }
    @Test
    @DisplayName("Checking that bubbleSortIntArray returns array given a single int array")
    void checkBubbleSortIntArraySortsArraysContainingOneInt() {
        Assertions.assertArrayEquals(new int[]{212}, BubbleSort.bubbleSortIntegerArray(new int[]{212}) );
    }
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

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts arrays with casted doubles")
    void checkBubbleSortIntArraySortsArraysContainingCastedDoubles() {
        Assertions.assertArrayEquals(new int[]{-212, -19, -2, 0,(int) 3.14}, BubbleSort.bubbleSortIntegerArray(new int[]{-19, 0, -212, -2, (int) 3.14}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts arrays containing Max Integer ")
    void checkBubbleSortIntArraySortsArraysContainingMaxInteger() {
        Assertions.assertArrayEquals(new int[]{-212, -19, -2, 0,(int) 3.14, Integer.MAX_VALUE}, BubbleSort.bubbleSortIntegerArray(new int[]{-19, 0, -212, -2, (int) 3.14, Integer.MAX_VALUE}) );
    }

    @Test
    @DisplayName("Checking that bubbleSortIntArray sorts arrays containing Min and Max Integer ")
    void checkBubbleSortIntArraySortsArraysContainingMinAndMaxInteger() {
        Assertions.assertArrayEquals(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, BubbleSort.bubbleSortIntegerArray(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}) );
    }




}
