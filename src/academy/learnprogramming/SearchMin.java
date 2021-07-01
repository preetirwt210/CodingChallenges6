package academy.learnprogramming;

public class SearchMin {
    public static void searchMin(int[] arr){
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element in an array is: " + min);
    }
}
