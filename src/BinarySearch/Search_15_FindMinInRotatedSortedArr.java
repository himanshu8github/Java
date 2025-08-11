package BinarySearch;

public class Search_15_FindMinInRotatedSortedArr {
        public static void main(String[] args) {
            int[] nums = {11,12,13,2,3,4,5,6,7,8};
            System.out.println(findMin(nums));  // Return Min Element from nums
        }

        static int findMin(int[] nums) {
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check if mid is the minimum element
                //It simply ensures that mid is not the last element of the array.
                //This is important because if mid is the last element of the array,
                // mid + 1 would go out of bounds, and we don't want to access an invalid index.
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return nums[mid + 1];
                }
                if (mid > start && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                }

                // If the left part is sorted, then the minimum must be in the right half
                if (nums[start] <= nums[mid]) {
                    start = mid + 1;
                } else {
                    // If the right part is sorted, then the minimum must be in the left half
                    end = mid - 1;
                }
            }

            // If no pivot is found, the array is not rotated and already sorted, so return the first element
            return nums[0];
        }
    }




