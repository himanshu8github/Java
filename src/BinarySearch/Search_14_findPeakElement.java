package BinarySearch;

public class Search_14_findPeakElement {
    static int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }

        int strt = 0;
        int end = n - 1;

        while (strt <= end) {
            int mid = strt + (end - strt) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                    (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }

            if (nums[mid] < nums[mid + 1]) {
                strt = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex);
    }
}
