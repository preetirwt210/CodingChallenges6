package academy.learnprogramming;

public class SearchMax {
    public static void searchMax(int[] arr){
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element in an array is: " + max);
    }
}
