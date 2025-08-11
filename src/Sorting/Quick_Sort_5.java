package Sorting;

public class Quick_Sort_5 {

    public static void main(String[] args) {
        int[] arr = {7, 13, 8, 5, 10, 2, 4};
        System.out.println("Array before sorting: ");
        displayArr(arr);

        System.out.println();

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: ");
        displayArr(arr);
    }

    static int partition(int[] arr, int strt, int end) {
        int pivot = arr[strt];
        int cnt = 0;

        // here i = strt +1 because... strt = pivot
        for (int i = strt + 1; i <= end; i++) {
            if (arr[i] < pivot) cnt++;
        }

        // Move the pivot element to the correct position
        int pivotIndex = strt + cnt;
        swap(arr, strt, pivotIndex);


        int i = strt, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            // Swap elements that are on the wrong side of the pivot
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    static void quickSort(int[] arr, int strt, int end) {
        if (strt >= end) return;

        int pivot = partition(arr, strt, end);
        quickSort(arr, strt, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
