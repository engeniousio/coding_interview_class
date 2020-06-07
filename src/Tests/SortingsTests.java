package Tests;

import Algos.Sortings;
import org.junit.Assert;

import java.util.Arrays;

public class SortingsTests {


    @org.junit.jupiter.api.Test
    void bubbleSort() {
        int[] arr = {100, -4, 5, 0, 10, 6};
        int[] expectedResult = {-4, 0, 5, 6, 10, 100};
        Sortings sortings = new Sortings();
        sortings.bubbleSort(arr);
        Assert.assertArrayEquals(expectedResult, arr);
    }

    @org.junit.jupiter.api.Test
    void selectionSort() {
        int[] arr = {100, -4, 5, 0, 10, 6};
        int[] expectedResult = {-4, 0, 5, 6, 10, 100};
        Sortings sortings = new Sortings();
        sortings.selectionSort(arr);
        Assert.assertArrayEquals(expectedResult, arr);
    }

    @org.junit.jupiter.api.Test
    void countingSort() {
        int[] arr = {9, 5, 0, 10, 6, 5, 5};
        int[] expectedResult = {0, 5, 5, 5, 6, 9, 10};
        Sortings sortings = new Sortings();
        int[] actualResult = sortings.countingSort(arr, 10);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
