package Algos;

//        1. Input: What is the input parameter?
//        2. Output: What is the datatype of your answer that your function has to return?
//        3. What data structures and methods associated with it will be used?
//        4. Where are you going to store temporary data (if needed)?
//        5. Describe the model of your algorithm before implementing solution in code
//        6. Write unit tests for your solution -- think about edge cases
//        7. Runtime Complexity?
//        8. Memory Complexity?
public class PrimeNumber {

    // 15 => 5 * 3
    // 17 => 1,17 ==> prime

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Time: O(sqrt(n))
    // Memory: O(1)
}