package Algos;

// 1. Input: What is the input parameter?
// 2. Output: What is the datatype of your answer that your function has to return?
// 3. What data structures and methods associated with it will be used
// 4. Where are you going to store temp data ( if needed )
// 5. Describe the model of your algorithm before implementing solution in code
// 6. Write unit tests for your solution -- think about edge cases
// 7. Runtime Complexity?
// 8. Memory Complexity?


public class SumElementsInArray {
    // You are given an array of integers. Please return sum of all elements

    // [5, 1, 10, 24, -4, 10, 5, 3, 6, 7, 0, 20, 30]  ----> n elements
    public int sumElements(int arr[]) {
        int sum = 0;
        for(int element: arr) {
            sum += element;
        }
        return sum;
    }

    // O(1)
    public int firstElement(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        return arr[0];
    }
}

// How much time does the execution take?
    // 1. Hardware?
    // 2. Other processes in background
    // 3. Programming languages
// Number of operation


// Runtime complexity:  n + 2 => ~n  => O(n) -> linear time

// Memory complexity: O(1) -- constant