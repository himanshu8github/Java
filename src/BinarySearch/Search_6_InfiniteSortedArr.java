package BinarySearch;

public class Search_6_InfiniteSortedArr {
    public static void main(String[] args) {
     int[] arr = {2,3,4,5,6,7,8,10,11,12,15,20,23,30};
     int target = 15;
        System.out.println((findRange(arr, target)));
    }

    static int findRange(int[] arr, int target){
        // start with the box size 2
      // first find the range
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart =  end + 1;
            // double the box value
            // end = previous end + size of box * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return bSearch(arr, target, start , end);

    }

    static int bSearch(int[] arr, int target, int start , int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;

    }

}
