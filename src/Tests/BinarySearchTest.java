package Tests;

import Algos.BinarySearch;
import org.junit.Assert;

public class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void searchAnElementTest() {
        int arr[] = {10, -100, 7, 19, 9, 10, 5};
        int target = -100;
        int expectedResult = 1;
        BinarySearch binarySearch = new BinarySearch();
        int actualResult = binarySearch.searchAnElement(arr, target);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest() {
        int arr[] = {-100, 5, 7, 9, 10, 19, 123, 10000};
        int target = 123;
        int expectedResult = 6;
        BinarySearch binarySearch = new BinarySearch();
        int actualResult = binarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest2() {
        int arr[] = {-100, 5, 7, 9, 10, 19, 123, 10000};
        int target = -19;
        int expectedResult = -1;
        BinarySearch binarySearch = new BinarySearch();
        int actualResult = binarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest3() {
        int arr[] = {-100, 5, 7, 9, 10, 19, 123, 10000};
        int target = -100;
        int expectedResult = 0;
        BinarySearch binarySearch = new BinarySearch();
        int actualResult = binarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
