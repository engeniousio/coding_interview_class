package Tests;

import Algos.FizzBuzz;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz5() {

        int n = 5;

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> actualResult = fizzBuzz.fizzBuzz(n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzz15() {

        int n = 15;

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> actualResult = fizzBuzz.fizzBuzz(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
