import Algos.SortArrayOfZeroOnes;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sortArrayOfZeroOnes();
    }

    static void sortArrayOfZeroOnes() {
//        int arr[] = {0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0};
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 0};
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();
        sortArrayOfZeroOnes.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
