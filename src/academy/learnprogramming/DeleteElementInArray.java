package academy.learnprogramming;

public class DeleteElementInArray {
    static void delete(int[] arr){
        int delete_elm=4;

        for(int i=0;i<arr.length;i++){
            if(delete_elm==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
