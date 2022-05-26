package com.sparta.ah;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PalindromeChecker {

    /*
    Returns an array list of the largest palindromes
    in a given sentence.
    Returns an empty array list if there are no palindromes.
     */
    public static ArrayList<String> findLargestPalindrome(String sentenceToCheck) {

        String[] splitSentence = sentenceToCheck.replaceAll("\\p{Punct}", "").split(" ");

        ArrayList<String> palindromeList = new ArrayList<>();
        ArrayList<String> longestPalindromes = new ArrayList<>();
        int largestPalindromeLength = 0;

        // get palindromes 3 chars or more:
        for (String word : splitSentence) {
            if (word.length() >= 3 && isPalindrome(word)) {
                palindromeList.add(word);
            }
        }

            // set length to same as largest palindrome in list:
            for (String word : palindromeList) {
                if (word.length() > largestPalindromeLength) {
                    largestPalindromeLength = word.length();
                }
            }
                // get palindromes with most chars only:
                for (String word : palindromeList) {
                    if (word.length() == largestPalindromeLength) {
                        longestPalindromes.add(word.toLowerCase());
                    }

                }

        // Convert to a set temporarily to get rid of any duplicates
        Set<String> palindromesWithoutDuplicates = new HashSet<>(longestPalindromes);
        longestPalindromes.clear();
        longestPalindromes.addAll(palindromesWithoutDuplicates);

        return longestPalindromes;



}
    /*
    returns boolean on whether a singular word is a palindrome
     */
    public static boolean isPalindrome(String wordToCheck) {

        char[] charArray = wordToCheck.toCharArray();
        String reversedWord = "";

        for(int i = charArray.length -1; i >= 0; i--) {
            reversedWord += charArray[i];
        }

        return (wordToCheck.equalsIgnoreCase(reversedWord));

    }

}
