# A simple Java Project on GitHub
<p>This document explains what I have created as a basic Java project on GitHub.</p>

- **Creating a simple Java App**
- **Setting up git and a gitHub repository**
- **BubbleSort and BubbleSortTest**
- **PalindromeChecker and PalindromeCheckerTest**
- **FibonacciPositionFinder and FibonacciPositionFinderTest**

<ol>
    <li><h4>App</h4>
        <p>App is a simple class in Java that includes a main method. It calls the Java Date API to get the current datetime and stores the hour. A function consisting of a 
            basic conditional statement then greets the user.</p>
    </li><li><h4>GitHub Repository</h4>
        <p>I set up git using gitbash and linked this account with my Java projects. I created a repository and established a link to my local directory.</p>
    </li>
    <li><h4>BubbleSort</h4>
        <p>The BubbleSort class contains a method that sorts an array of integers by value. It takes an integer array as input and returns a sorted array of the same length.</p>
    <h4>BubbleSortTest</h4>
    <p>A JUnit class to test for empty arrays, single int arrays, negative values, casted non integers and Integer MIN/MAX values.</p>
    </li>
    <li><h4>PalindromeChecker</h4>
        <p>PalindromeChecker contains two methods: <ol><li>given a word, isPalindrome() returns true or false if the word is a palindrome i.e. "ana", "radar".</li><li> findLargestPalindrome() returns an array of the largest palindromes found in a given sentence. 
        It takes a string as input and returns either an empty array (if there are no palindromes), or an array of the palindromes with the most characters.</li></ol></p>
    <h4>PalindromeCheckerTest</h4>
    <p>A JUnit class that tests for non palindrome sentences, empty strings, single palindromes, multiple palindromes, duplicated palindromes and palindromes amongst punctuation. </p>
    </li>
    <li><h4>FibonacciPositionFinder</h4>
        <p>The class has two methods: <ol><li>getFibValueAtIndex() takes an integer as input and gives the value in the Fibonacci sequence at that position</li><li> getFibonacciSequence() takes an integer and returns an array list of the Fibonacci sequence up to that position</li></ol>
        <h4> FibonacciPositionFinderTest</h4>
        <p> A JUnit class that tests for various positions given as input including negative values, zero, one and so forth. The class also tests that the Fibonacci sequence is returned correctly for the first several positions and as well as 0 and null values.</p>
    </li>
</ol>
