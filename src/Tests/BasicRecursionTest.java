package Tests;

import Algos.BasicRecursion;
import Algos.IntegerPalindrome;
import org.junit.Assert;

public class BasicRecursionTest {

    @org.junit.jupiter.api.Test
    void iterativeFiboTest() {
        int number = 9;
        BasicRecursion basicRecursion = new BasicRecursion();
        int expectedResult = 34;
        int actualResult = basicRecursion.iterativeFibonacci(number);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void recursionFiboTest() {
        int number = 9;
        BasicRecursion basicRecursion = new BasicRecursion();
        int expectedResult = 34;
        int actualResult = basicRecursion.recursiveFibonacci(number);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void recursionFactorialTest() {
        int number = 5;
        BasicRecursion basicRecursion = new BasicRecursion();
        int expectedResult = 120;
        int actualResult = basicRecursion.factorial(number);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void recursionSumOfDigitsTest() {
        int number = 12345;
        BasicRecursion basicRecursion = new BasicRecursion();
        int expectedResult = 15;
        int actualResult = basicRecursion.sumOfDigits(number);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
