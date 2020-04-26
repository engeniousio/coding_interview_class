package Tests;

import Algos.SumElementsInArray;
import org.junit.Assert;

public class SumElementsInArrayTest {

    @org.junit.jupiter.api.Test
    void testSumElements() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {1, 5, -5, 10, 4};
        int expectedResult = 15;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testSumEmptyElements() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {};
        int expectedResult = 0;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testSumOneElement() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {5};
        int expectedResult = 5;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
