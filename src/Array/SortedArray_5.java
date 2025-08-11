package Array;

import java.util.Scanner;

public class SortedArray_5 {

    static boolean isSorted(int[] arr){
         boolean check = true;

         for (int i = 1; i < arr.length; i++){
             if(arr[i] < arr[i - 1]){
                 //not sorted
                 check = false;
                 break;
             }
         }
         return check;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "  + n +  " elements");
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Sorted : " + isSorted(arr));
    }
}
