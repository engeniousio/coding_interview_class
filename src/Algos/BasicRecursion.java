package Algos;

public class BasicRecursion {

    // 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

    public int iterativeFibonacci(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }

        int fibo1 = 1;
        int fibo2 = 1;
        int fibo = 1;

        for (int i = 3; i <= number; i++) {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return fibo;

        // TIME: O(n)
        // MEMORY: O(1)
    }

    // F(number) = F(number - 1) + F(number - 2)
    public int recursiveFibonacci(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }

        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);

        // TIME: O(2^n)
        // Memory: O(n)
    }

    // 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
    // F(n) = n * (n-1) * (n-2) * ... * 1
    // F(n-1) =   (n-1) * (n-2) * ... * 1
    // F(n) = n * F(n-1)

    public int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

        // TIME: O(n)
        // MEMORY: O(n)
    }


    // 34324
    public int sumOfDigits(int n) {

        if (n < 10) {
            return n;
        }

        int reminder = n % 10 ;
        return reminder + sumOfDigits(n / 10);

        // TIME: O(lg(n))
        // MEMORY: O(lg(n))
    }
}
