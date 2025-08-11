package BinarySearch;

public class Search_1 {
    public static void main(String[] args) {
        int[] arr = {-8,10, 12, 20, 25, 29, 39, 50, 51, 55, 89, 478, 72325, 20246562};
        int target = 20;
        int ans = bSearch(arr, target);
        System.out.println(ans);

    }

    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//        int mid = (start + end)/2;
        // might be possible that (start + end) exceeds the range of integer in java

        int mid = start + (end - start) / 2;

        if(target < arr[mid]){
            end = mid -1;
        } else if(target > arr[mid]){
         start=  mid + 1;
        } else{
            return mid;
        }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int start, int end, int mid, int target){
        start = 0;
        end = arr.length-1;

        while (start <= end){

            mid = start + (end - start ) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}


