package Tests;

import Algos.IntegerPalindrome;
import org.junit.Assert;

public class IntegerPalindromeTest {

    @org.junit.jupiter.api.Test
    void integerPalindromeTest() {
        int x = 1234321;
        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        boolean actualResult = integerPalindrome.isPalindrome(x);
        Assert.assertTrue(actualResult);
    }

    @org.junit.jupiter.api.Test
    void integerNotPalindromeTest() {
        int x = 1934321;
        IntegerPalindrome integerPalindrome = new IntegerPalindrome();
        boolean actualResult = integerPalindrome.isPalindrome(x);
        Assert.assertFalse(actualResult);
    }
}
