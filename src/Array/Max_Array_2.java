package Array;

public class Max_Array_2 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 23, 65, 0, 2};
        int ans = arr[0]; // Initialize with first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        System.out.println("Maximum element: " + ans);
    }
}
