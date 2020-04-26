package Tests;

import Algos.SortArrayOfZeroOnes;
import org.junit.Assert;

class SortArrayOfZeroOnesTest {

    @org.junit.jupiter.api.Test
    void sortArray() {
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {0, 1, 1, 0, 0, 1, 1, 1, 0};
        sortArrayOfZeroOnes.sortArray(arr);
        int expectedValue[] = {0, 0, 0, 0, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(arr, expectedValue);
    }

    @org.junit.jupiter.api.Test
    void sortEmptyArray() {
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {};
        sortArrayOfZeroOnes.sortArray(arr);
        int expectedValue[] = {};
        Assert.assertArrayEquals(arr, expectedValue);
    }

    @org.junit.jupiter.api.Test
    void sortOneElementArray() {
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {1};
        sortArrayOfZeroOnes.sortArray(arr);
        int expectedValue[] = {1};
        Assert.assertArrayEquals(arr, expectedValue);
    }
}