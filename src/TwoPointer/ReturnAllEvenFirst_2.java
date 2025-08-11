package TwoPointer;

public class ReturnAllEvenFirst_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sortedArr = SortArray(arr);


        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    static int[] SortArray(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }

        return arr;
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
