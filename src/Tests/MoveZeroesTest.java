package Tests;

import Algos.MoveZeroes;
import Algos.TwoSum;
import org.junit.Assert;

public class MoveZeroesTest {

    @org.junit.jupiter.api.Test
    void testMoveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int array[] = {0,1,0,3,12};
        int[] expectedResult = new int[]{1, 3, 12, 0, 0};
        moveZeroes.moveZeroes(array);
        Assert.assertArrayEquals(array, expectedResult);
    }
}
