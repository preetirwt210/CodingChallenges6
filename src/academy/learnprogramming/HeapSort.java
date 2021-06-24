package academy.learnprogramming;

public class HeapSort {

    public static void sort(int[] arr) {
        int leng = arr.length;
        for (int i = leng / 2 - 1; i >= 0; i--) {
            heapify(arr, leng, i);
        }
        for (int i = leng - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
      public static void heapify(int[] arr ,int n,int i){
            int largest=i;
            int li=2*i+1;
            int ri=2*i+2;

            if(li<n&&arr[li]>arr[largest]){
                largest=li;
            }

            if(ri<n&&arr[ri]>arr[largest]){
                largest=ri;
            }
            if(largest!=i){
                int temp=arr[i];
                arr[i]=arr[largest];
                arr[largest]=temp;

                heapify(arr,n,largest);
            }

        }

        public static void printArray(int[] array){
        for(int i: array){
            System.out.println(i + " ");
        }
    }

}
