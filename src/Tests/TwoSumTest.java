package Tests;

import Algos.SumElementsInArray;
import Algos.TwoSum;
import org.junit.Assert;

public class TwoSumTest {

    @org.junit.jupiter.api.Test
    void testTwoSumBruteForce() {
        TwoSum twoSum = new TwoSum();
        int array[] = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = new int[]{0,1};
        int[] actualResult = twoSum.twoSumBruteForce(array, target);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testTwoSumBruteForceSame() {
        TwoSum twoSum = new TwoSum();
        int array[] = {3, 2, 4};
        int target = 6;
        int[] expectedResult = new int[]{1,2};
        int[] actualResult = twoSum.twoSumBruteForce(array, target);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int array[] = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = new int[]{0,1};
        int[] actualResult = twoSum.twoSum(array, target);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testTwoSumSame() {
        TwoSum twoSum = new TwoSum();
        int array[] = {3, 2, 4};
        int target = 6;
        int[] expectedResult = new int[]{1,2};
        int[] actualResult = twoSum.twoSum(array, target);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
