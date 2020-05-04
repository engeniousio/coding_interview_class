package Algos;

import javafx.beans.binding.StringBinding;

public class Palindrome {

    // palindrome - a word, phrase, or sequence that reads the same backwards as forwards
    // abcba ; abddba; anna; racecar;

    // write a function that takes a string and returns boolean - whether this string is palindrome

    public boolean isPalindromeFirstDraft(String str) {

        String reversedStr = "";

        for (int i = str.length() -1; i>= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr.equals(str);

        // Time: O(n)
        // Memory: O(n)
    }

    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int leftChar = str.charAt(i);
            int rightChar = str.charAt(str.length() - 1 - i);
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;

        // Time: O(n)
        // Memory: O(1)
    }
}
