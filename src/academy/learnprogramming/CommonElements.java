package academy.learnprogramming;

import java.util.HashSet;

public class CommonElements {
    static  void commonElements(int[] array1, int[] array2 ){
//           for(int i=0; i<array1.length;i++){
//               for(int j=0;j<array2.length;j++){
//                   if(array1[i]==array2[j]){
//                       System.out.println("Common numbers are: " + array1[i]);
//                   }
//               }
//           }

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                   hs.add(array1[i]);
                }
            }
        }
        for(int no: hs){
            System.out.println("Common numbers are: " + no);
        }

    }
}
