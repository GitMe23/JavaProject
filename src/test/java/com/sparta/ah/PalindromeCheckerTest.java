package com.sparta.ah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class PalindromeCheckerTest {


    @Test
    @DisplayName("check that findLargestPalindrome returns empty array given empty string")
    void checkFindLargestPalindromeReturnsEmptyArrayGivenEmptyString() {

        ArrayList<String> expected = new ArrayList<>();
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("").toArray());
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns empty array given non palindrome sentence")
    void checkFindLargestPalindromeReturnsEmptyArray() {

        ArrayList<String> expected = new ArrayList<>();
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("a racing car").toArray());
    }


    @Test
    @DisplayName("check that findLargestPalindrome returns a single palindrome")
    void checkFindLargestPalindromeReturnsSinglePalindrome() {

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("a racecar on a track.").toArray());
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns empty array given palindrome less than 3 chars")
    void checkFindLargestPalindromeReturnsEmptyArrayForPalindromeLessThanThreeChars() {

        ArrayList<String> expected = new ArrayList<>();
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("palindrome less than 3 chars: nn").toArray());
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns Largest palindrome given multiple palindromes")
    void checkFindLargestPalindromeReturnsLargestPalindrome() {

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("a racecar with a radar on a track.").toArray());
    }


    @Test
    @DisplayName("check that findLargestPalindrome returns multiple largest palindromes with same length")
    void checkFindLargestPalindromeReturnsMultiplePalindromesOfSameLength() {

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar", "rotator"));
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("a racecar has a radar and a rotator").toArray());
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns one instance of duplicate palindrome")
    void checkFindLargestPalindromeReturnsOneInstanceOfDuplicatePalindrome() {

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("one racecar is blue and one racecar is red").toArray());
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns palindrome amongst punctuation")
    void checkFindLargestPalindromeReturnsPalindromeAmongstPunctuation() {

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("racecar"));
        Assertions.assertArrayEquals(expected.toArray(),
                PalindromeChecker.findLargestPalindrome("Look at my racecar!").toArray());
    }



}
