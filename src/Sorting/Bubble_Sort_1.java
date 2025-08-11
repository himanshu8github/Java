package Sorting;

public class Bubble_Sort_1 {
    public static void main(String[] args) {
   int [] arr = {7, 6, 5, 4, 3};
   bubbleSort(arr);
   for(int i : arr){
       System.out.print(( i + " "));
   }
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++ ){
            boolean flag = false;  // to check swap happened or not
            for(int j = 0; j < n-i-1; j++){

                if(flag == false){
                    return;  //we stopped here because no swap is happened

                }

                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }
}
