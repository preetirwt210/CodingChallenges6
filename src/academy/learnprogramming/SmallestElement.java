package academy.learnprogramming;

public class SmallestElement {
    public static void smallestElement(int[] arr){
        int k=5;
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }

}
