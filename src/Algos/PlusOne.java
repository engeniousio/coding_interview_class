package Algos;

public class PlusOne {

    // 1, 2, 9, 9, 9
    // 1, 2, 9, 10, 0
    // 1, 2, 10, 0, 0
    // 1, 3, 0, 0, 0


    // 9, 9, 9
    // 9, 9, 10
    // 9, 10, 0
    // 10, 0, 0
    // 1, 0, 0, 0


    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] ++;

        for(int i = digits.length - 1; i>=1; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits [i-1] += 1;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int [] array = new int[digits.length + 1];
            array[0] = 1;
            for(int i = 1; i<array.length; i++) {
                array[i] = 0;
            }
            return array;
        }
        return digits;

        // TIME: O(n)
        // MEMORY: O(n)
    }
}
