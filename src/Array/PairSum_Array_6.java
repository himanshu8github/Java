package Array;

import java.util.Scanner;

public class PairSum_Array_6 {

    static int pairSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "  + n +  " elements : ");
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter target : ");
        int target = sc.nextInt();
        System.out.println("No. Of pairs : " + pairSum(arr, target));
    }
}
