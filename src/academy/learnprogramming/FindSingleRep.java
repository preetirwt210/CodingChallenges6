package academy.learnprogramming;

public class FindSingleRep {
    public static void findSingleRep(int[] arr){
        int res= arr[0];

        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println("Element That Appears Once In An Array Where Every Other " +
                "Element Appears Twice is: " + res + " ");
    }
}
