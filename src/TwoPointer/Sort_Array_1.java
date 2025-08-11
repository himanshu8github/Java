package TwoPointer;

public class Sort_Array_1 {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        sortZeroesAndOnes(arr);
        printArray(arr);  // Print the sorted array
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left , right );
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();  // New line after printing the array
    }
}
