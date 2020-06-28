package Algos;

//1. Input: What is the input parameter?
//2. Output: What is the datatype of your answer that your function has to return?
//3. What data structures and methods associated with it will be used?
//4. Where are you going to store temporary data (if needed)?
//5. Describe the model of your algorithm before implementing solution in code
//6. Write unit tests for your solution -- think about edge cases
//7. Runtime Complexity?
//8. Memory Complexity?

public class BinarySearch {


    // given an array of integers and target; please find the location of target.

    // [10, -39, 100, 3, 6, 19, 2] ; target = 19

    public int searchAnElement(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

        // Time: O(n)
        // Memory: O(1)
    }


    // what if array is sorted?

    // [-39, 2, 3, 6, 10, 19, 100] ; target = 19

    // mid element = 6
    // 19 > 6 => target is in the right part
    // [10, 19, 100]
    // mid element = 19 == target => found!

    public int binarySearch(int[] arr, int target) {
        return binarySearchRecursion(arr, target, 0, arr.length - 1);
    }

    public int binarySearchRecursion(int arr[], int target, int l, int r) {
        int middleIndex = (l + r) / 2;

        if (r < l) {
            return -1;
        }

        if (arr[middleIndex] == target) {
            return middleIndex;
        } else if (target < arr[middleIndex]) {
            int newR = middleIndex - 1;
            return binarySearchRecursion(arr, target, l, newR);
        } else {
            int newL = middleIndex + 1;
            return binarySearchRecursion(arr, target, newL, r);
        }

        // TIME: O(log n)
        // MEMORY: O(1)
    }
}
