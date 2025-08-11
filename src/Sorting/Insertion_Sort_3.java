package Sorting;
import java.util.Arrays;

public class Insertion_Sort_3  {
    public static void main(String[] args) {
    int[] arr = {0, 1 , 2, -52, 50, 25};
    insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
     for(int i = 0; i < arr.length-1; i++ ){
         for(int j = i + 1; j > 0; j--){
             if(arr[j] < arr[j-1]){
                 swapp(arr, j , j -1);
             } else{
                 break;
             }
         }
     }
    }

    static void swapp(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
