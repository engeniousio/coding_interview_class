package Algos;

public class MoveZeroes {

    // [0, 1, 0, 3, 12]
    // [1, 1, 0, 3, 12]
    // [1, 3, 0, 3, 12]
    // [1, 3, 12, 3, 12]

    // [1, 3, 12, 0, 0]
    public void moveZeroes(int[] nums) {

        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer++] = nums[readPointer];
            }
        }

        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }

        // Time: O(n)
        // Memory: O(1)
    }
}

// 15  => 3 * 5
// 17 => prime