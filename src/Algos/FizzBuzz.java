package Algos;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //Write a program that outputs the string representation of numbers from 1 to n.
    //But for multiples of three it should output “Fizz” instead of the number and for the
    // multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

    public List<String> fizzBuzz(int n) {

        List<String> resultList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                resultList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultList.add("Fizz");
            } else if (i % 5 == 0) {
                resultList.add("Buzz");
            } else {
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }
}


// Time ~ O(n)
// Memory - O(n)