package BinarySearch;

public class Search_2_OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {45,21,-8,10, 12, 20, 25, 29, 39, 50, 51, 55, 89, 478, 72325, 20246562};
        int target = 20;
        int ans = orderAgnosticSearch(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in dec or inc order
        boolean isAscend = (arr[start] < arr[end]);

//        if(arr[start] < arr[end]){
//            isAscend = true;
//        } else{
//            isAscend = false;
//        }

        while(start <= end){
//        int mid = (start + end)/2;
            // might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end - start) / 2;

            if(target ==  arr[mid]){
            return mid;
            }

          if(isAscend) {
              if(target < arr[mid]){
                  end = mid -1;
              } else {
                  start=  mid + 1;
              }
          } else{
              if(target > arr[mid]){
                  end = mid -1;
              } else{
                  start=  mid + 1;
              }

            }

        }
        return -1;
    }
}
