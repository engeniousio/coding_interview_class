package Algos;

//  1. Input: What is the input parameter?
//  2. Output: What is the datatype of your answer that your function has to return?
//  3. What data structures and methods associated with it will be used?
//  4. Where are you going to store temporary data (if needed)?
//  5. Describe the model of your algorithm before implementing solution in code
//  6. Write unit tests for your solution -- think about edge cases
//  7. Runtime Complexity?
//  8. Memory Complexity?

public class Sortings {

    // { 100, -4, 5, 0, 10, 6 }
    // { -4, 100, 5, 0, 10, 6}
    // { -4, 5, 100, 0, 10, 6 }
    // { -4, 5, 0, 100, 10, 6 }
    // { -4, 5, 0, 10, 100, 6 }
    // { -4, 5, 0, 10, 6, 100 }
    // ....

    // => { -4, 0, 5, 6, 10, 100 }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public void bubbleSort(int[] arr) {
        boolean swapDetected = true;
        while (swapDetected) {
            swapDetected = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    swapDetected = true;
                }
            }
        }
        // TIME: O(n^2)
        // MEMORY: O(1)
    }

    // {100, -4, 5, 0, 10, 6 }

    public void selectionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minI = left;
            for(int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minI]) {
                    minI = i;
                }
            }
            swap(arr, left, minI);
        }

        // TIME: O(n^2)
        // MEMORY: O(1)
    }

    // {9, 5, 0, 10, 6, 5, 5}

    // 0  1  2  3  4  5  6  7  8  9  10
    // 1              3  1        1  1

    // 0, 5, 5, 5, 6, 9, 10

    public int[] countingSort(int[] arr, int maxValue) {

        int values[] = new int[maxValue + 1];

        for (int i = 0; i < arr.length; i++) {
            values[arr[i]]++;
        }

        int[] sortedArray = new int[arr.length];
        int k = 0;

        for(int i = 0; i < values.length; i++) {
            for(int j= 0; j < values[i]; j++) {
                sortedArray[k] = i;
                k++;
            }
        }
        return sortedArray;

        // TIME: O(n+k)  -- where k is max element
        // MEMORY: O(k), k is max element
    }
}
