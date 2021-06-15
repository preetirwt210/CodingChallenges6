package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello!! from Main thread.");

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i]> intArray[i+1]){
               BubbleSort.swap(intArray, i, i + 1);
            }

        }

    }
     for(int i=0; i<intArray.length;i++){
        System.out.println(intArray[i]);
    }
     }


    }

