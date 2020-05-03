package Tests;

import Algos.Palindrome;
import org.junit.Assert;

public class PalindromeTest {

    @org.junit.jupiter.api.Test
    void testPalindrome() {
        String str = "racecar";
        Palindrome palindrome = new Palindrome();

        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testFalsePalindrome() {
        String str = "abcdbcaa";
        Palindrome palindrome = new Palindrome();

        boolean expectedResult = false;
        boolean actualResult = palindrome.isPalindrome(str);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @org.junit.jupiter.api.Test
    void testEmptyPalindrome() {
        String str = "";
        Palindrome palindrome = new Palindrome();

        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testOneLetterPalindrome() {
        String str = "s";
        Palindrome palindrome = new Palindrome();

        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testEvenPalindrome() {
        String str = "abba";
        Palindrome palindrome = new Palindrome();

        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
