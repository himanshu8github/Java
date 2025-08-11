package BinarySearch;

public class Search_9_findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int result = search(arr, target);
        System.out.println("Target found at index: " + result);
    }

    static int search(int[] arr, int target){
        int peak = findPeakIndexInMountArr(arr);
        int firstTry = orderAgnosticSearch(arr, target, 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticSearch(int[] arr, int target, int strt, int end){
        //find whether the array is sorted in dec or inc order
        boolean isAscend = (arr[strt] < arr[end]);

        while(strt <= end){
            int mid = strt + (end - strt) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAscend) {
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    strt = mid + 1;
                }

            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    strt = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findPeakIndexInMountArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // this may be the ans but look in l.h.s
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
