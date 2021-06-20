package academy.learnprogramming;

import java.util.Arrays;

public class SortingArrays {
    public static void sortingArrays(int[] intArray){
    Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
        System.out.println(intArray[i]);
    }
}
}
