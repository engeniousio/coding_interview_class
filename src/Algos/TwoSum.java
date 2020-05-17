package Algos;


// 1. Input: What is the input parameter?
// 2. Output: What is the datatype of your answer that your function has to return?
// 3. What data structures and methods associated with it will be used?
// 4. Where are you going to store temporary data (if needed)?
// 5. Describe the model of your algorithm before implementing solution in code
// 6. Write unit tests for your solution -- think about edge cases
// 7. Runtime Complexity?
// 8. Memory Complexity?

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Given nums = [2, 7, 11, 15], target = 9,

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                if (i != j && num1 + num2 == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
        // Time: O(n^2)
        // Memory: O(1)
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i=0; i < nums.length; i++) {
            int num1 = nums[i];
            int complement = target - num1;
            if (map.containsKey(complement) && i != map.get(complement)) {
                int indexOfnum2 = map.get(complement);
                return new int[] { i, indexOfnum2 };
            }
        }
        return new int[]{0, 0};

        // Time: O(n)
        // Memory: O(n)
    }
}
