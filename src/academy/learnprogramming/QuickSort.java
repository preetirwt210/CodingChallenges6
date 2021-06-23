package academy.learnprogramming;

public class QuickSort {
    public static void printArray(int[] intArray){
        for(int i: intArray){
            System.out.println(i + " ");
    }
}
//
//    public static void quickSort(int[] input, int start, int end) {
//        if (end - start < 2) {
//            return;
//        }
//
//        int pivotIndex = partition(input, start, end);
//        quickSort(input, start, pivotIndex);
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
//        quickSort(input, pivotIndex + 1, end);
//    }
//
//    public static int partition(int[] input, int start, int end) {
//        // This is using the first element as the pivot
//        int pivot = input[start];
//        int i = start;
//        int j = end;
//
//        while (i < j) {
//
//            // NOTE: empty loop body
//            while (i < j && input[--j] >= pivot);
//            if (i < j) {
//                input[i] = input[j];
//            }
//
//            // NOTE: empty loop body
//            while (i < j && input[++i] <= pivot);
//            if (i < j) {
//                input[j] = input[i];
//            }
//
//        }
//
//        input[j] = pivot;
//        return j;
//
//    }

   public static int partition(int[] arr, int low, int high){

        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }
       return low;
   }

   public static void quickSortRecursion(int[] arr,int low, int high){
        int pi=partition(arr,low,high);

        if(low<pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if(pi<high){
            quickSortRecursion(arr,pi,high);
        }

   }
}


