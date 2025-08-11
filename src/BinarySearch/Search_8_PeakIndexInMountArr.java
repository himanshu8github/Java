package BinarySearch;

public class Search_8_PeakIndexInMountArr {
    public static void main(String[] args) {
     int[] arr = {0,1,2,3,4,9,12};
      int peakIndex = findPeakIndexInMountArr(arr);
        System.out.println("Peak Index value : " + peakIndex);
        System.out.println("Index of peak index value is : "  + arr[peakIndex]);
    }

    static int findPeakIndexInMountArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // this may be the ans but look in l.h.s
                end = mid;
            } else{
                start =  mid + 1;

            }
        }

        return start;
    }
}
