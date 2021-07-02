package academy.learnprogramming;

import java.util.ArrayList;

public class EvenOddNumbers {

    static void evenOddNumbers(int[] arr){

        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        for(int i=0;i<arr.length; i++){

            if(arr[i]%2==0){
                a1.add(arr[i]);
            }else{
                a2.add(arr[i]);
            }
        }
  int total1=0;
        System.out.println("Even Numbers are: ");
        for(int no: a1 ){
            total1=total1+ no;
            System.out.print(no + " ");

        }
        System.out.println();
        System.out.println("Total Number of Size of even no. is: " + a1.size());
        System.out.println("Total of even no.s are: " + total1);

        System.out.println();
        int total2=0;
        System.out.println("Odd Numbers are: " );
        for(int no: a2 ){
            System.out.print(no + " ");
            total2=total2+ no;

        } System.out.println();
        System.out.println("Total Number of Size of odd no. is: " + a2.size());
        System.out.println("Total of even no.s are: " + total2);
    }
}
