package Array;

import java.util.Scanner;

public class Second_Max_Array_7 {

    // Find Maximum Element
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Find Second Maximum Element
    static int secondMax(int[] arr) {
        int mx = findMax(arr); // Find the max

        // Replace max value with Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        return findMax(arr); // Find the second max
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max value is : " + findMax(arr));
        System.out.println("Second Max value is : " + secondMax(arr));

        sc.close(); // Closing Scanner
    }
}
