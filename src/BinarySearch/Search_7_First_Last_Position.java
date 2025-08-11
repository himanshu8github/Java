package BinarySearch;

public class Search_7_First_Last_Position {
    public static void main(String[] args) {
        // Sample test to demonstrate functionality
        int[] nums = {5, 7, 7, 7, 7 , 8, 8, 10};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last positions: [" + result[0] + ", " + result[1] + "]");
    }

    // Static method to find the first and last positions
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};  // Initialize answer array

        // Check for first and last occurrence of target
        int start = searchIn(nums, target, true);
        int end = searchIn(nums, target, false);

        // Store the results in ans array
        ans[0] = start;
        ans[1] = end;

        return ans;  // Return the final result array
    }

    // Static method to find the index of the first or last occurrence of target
    static int searchIn(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Compare target with nums[mid]
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Target found, store index
                ans = mid;

                // If searching for the first occurrence, move left
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    // If searching for the last occurrence, move right
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
