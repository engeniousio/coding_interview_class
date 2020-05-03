package Tests;

import Algos.MaximumDifference;
import org.junit.Assert;

public class MaximumDifferenceTest {

    @org.junit.jupiter.api.Test
    void maxDifferenceTest() {

        int arr[] = {2, 1, 9, -5, 10, 4};
        int expectedResult = 15;

        MaximumDifference maximumDifference = new MaximumDifference();
        int actualResult = maximumDifference.maximumDifference(arr);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
