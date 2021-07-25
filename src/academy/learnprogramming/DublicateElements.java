package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DublicateElements {

    public static void dublicate(int[] arr){   //1,4,3,2,6,5,9,8,4,1,7,5,3
        Map<Integer,Integer> hm=new HashMap<>();
        for(int no: arr){    //no: 1,4,3,2,6,5,9,8,4,1,7,5,3
            Integer count=hm.get(no); //count= hm.get(1,4,3,2,6,5,9,8,4,1,7,5,3)
            if(count==null){  //
                hm.put(no,1);//hm.put(1,1)
            }else{
                count=count+1; // count=1+1
                hm.put(no,count); //hm.put(4,2)
            }
        }

        Set<Map.Entry<Integer,Integer>> me=hm.entrySet();
        for(Map.Entry<Integer,Integer> es: me){
                 if(es.getValue()>1){
                     System.out.println("Duplicate Elements in an array: " + es.getKey());
                 }
        }
    }
}
