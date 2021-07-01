package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DublicateElements {

    public static void dublicate(int[] arr){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int no: arr){
            Integer count=hm.get(no);
            if(count==null){
                hm.put(no,1);
            }else{
                count=count+1;
                hm.put(no,count);
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
