package com.sparta.ah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PalindromeCheckerTest {

    @Test
    @DisplayName("check isPalindrome returns false for non palindrome words")
        void checkIsPalindromeReturnsFalse() {
            Assertions.assertEquals(false, PalindromeChecker.isPalindrome("Sparta"));
        }

    @Test
    @DisplayName("check isPalindrome returns true given a palindrome word")
    void checkIsPalindromeReturnsTrue() {
        Assertions.assertEquals(true, PalindromeChecker.isPalindrome("radar"));
    }

    @Test
    @DisplayName("check isPalindrome returns false given a sentence containing a palindrome")
    void checkIsPalindromeReturnsFalseGivenASentence() {
        Assertions.assertEquals(false, PalindromeChecker.isPalindrome("a sentence containing radar"));
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns 'No palindromes found.' given a sentence ")
    void checkfindLargestPalindromeReturnsMessageForNoPalindromes() {
        Assertions.assertEquals("No palindromes found.",
                PalindromeChecker.findLargestPalindrome("A sentence without palindromes"));
    }


    @Test
    @DisplayName("check that findLargestPalindrome returns a single palindrome in a sentence")
    void checkFindLargestPalindromeReturnsSinglePalindrome() {
        Assertions.assertEquals("racecar ",
                PalindromeChecker.findLargestPalindrome("a racecar has a radar"));
    }

    @Test
    @DisplayName("check that findLargestPalindrome returns multiple largest palindromes with same length")
    void checkFindLargestPalindromeReturnsMultiplePalindromesOfSameLength() {
        Assertions.assertEquals("racecar rotator ",
                PalindromeChecker.findLargestPalindrome("a racecar has a radar and a rotator"));
    }


}
