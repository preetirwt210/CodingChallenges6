package academy.learnprogramming;

import java.util.HashSet;

public class FirstDuplicate {
    public static void duplicateElements(int[] arr){
        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=arr.length-1;i>=0;i--){
            if(hs.contains(arr[i])){
                temp=i;
            }else{
                hs.add(arr[i]);
            }
        }
        if(temp!=-1){
            System.out.println("First duplicate element is: " + arr[temp]);
        }else{
            System.out.println("No Such duplicate element present.");
        }

    }
}
