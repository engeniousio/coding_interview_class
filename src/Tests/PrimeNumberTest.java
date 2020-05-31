package Tests;

import Algos.PrimeNumber;
import org.junit.Assert;

public class PrimeNumberTest {

    @org.junit.jupiter.api.Test
    void testPrime() {
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 17;
        Assert.assertTrue(primeNumber.isPrime(n));
    }

    @org.junit.jupiter.api.Test
    void testPrimeOne() {
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 1;
        Assert.assertFalse(primeNumber.isPrime(n));
    }

    @org.junit.jupiter.api.Test
    void testPrimeFalse() {
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 36;
        Assert.assertFalse(primeNumber.isPrime(n));
    }

    @org.junit.jupiter.api.Test
    void testPrimeTwo() {
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 2;
        Assert.assertTrue(primeNumber.isPrime(n));
    }

    @org.junit.jupiter.api.Test
    void testPrimeThree() {
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 3;
        Assert.assertTrue(primeNumber.isPrime(n));
    }
}
