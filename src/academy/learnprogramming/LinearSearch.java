package academy.learnprogramming;

public class LinearSearch {
    public static void search(int[] intArray){
        int search=56;
         int flag=0;
        for(int i=0; i<intArray.length;i++){
            if(intArray[i]==search){
                System.out.println(" Element found at: " + i + " index position.");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("No such element found.");
        }
    }
}
