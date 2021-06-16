package academy.learnprogramming;

public class SelectionSort {

    public static void selectionSort(int[] intArray){
        for(int lastSortIndex=intArray.length-1; lastSortIndex>0;lastSortIndex--){
            int largest=0;
            for(int i=1; i<=lastSortIndex;i++){
                if(intArray[i]>intArray[largest]){
                    largest =i;
                }
            }
            swap(intArray,largest,lastSortIndex);
        }
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array,int i,int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
