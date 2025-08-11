package BinarySearch;

public class Search_13_SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Calculate start and end values for binary search
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  // The minimum possible max sum is the largest element
            end += nums[i];  // The maximum possible sum is the sum of all elements
        }

        // Binary search to find the smallest possible max sum
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Calculate how many subarrays are needed for the given mid value
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // If adding num exceeds mid, we need a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            // If the number of pieces is more than k, we need a larger max sum
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;  // This is the smallest max sum that allows splitting into k parts
    }
}
