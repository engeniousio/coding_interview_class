package Algos;

import java.util.Arrays;

public class MaximumDifference {

    // Given an array of integers, return the difference between
    // the largest and smallest integers in the array.

    // [2, 1, 9, -5, 10, 4] => 15

    // sorted array: [-5, 1, 2, 4, 9, 10]

    public int maximumDifferenceFirstDraft(int arr[]) {
        Arrays.sort(arr);

        if (arr.length < 1) {
            return -1;
        }

        int minElement = arr[0];
        int lastIndex = arr.length - 1;
        int maxElement = arr[lastIndex];
        return maxElement - minElement;

        // O(n * log(n))
    }

    public int maximumDifference(int arr[]) {
        if (arr.length < 1) {
            return -1;
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    // Time: O(n)
    // Memory: O(1)
}