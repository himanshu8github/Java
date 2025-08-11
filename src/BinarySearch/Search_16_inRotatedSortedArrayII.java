package BinarySearch;

public class Search_16_inRotatedSortedArrayII {

        public static void main(String[] args) {
            int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
            int target1 = 0;
            System.out.println(search(nums1, target1));  // Expected output: true

            int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
            int target2 = 3;
            System.out.println(search(nums2, target2));  // Expected output: false
        }

        static boolean search(int[] nums, int target) {
            int pivot = findPivotWithDuplicates(nums);

            // If no pivot is found, it means the array is not rotated, so just do normal binary search
            if (pivot == -1) {
                return binarySearch(nums, target, 0, nums.length - 1) != -1;
            }

            // If the pivot element is the target, return true
            if (nums[pivot] == target) {
                return true;
            }

            // If the target is in the left sorted portion
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot - 1) != -1;
            }

            // If the target is in the right sorted portion
            return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
        }

        static int binarySearch(int[] nums, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] > target) {
                    end = mid - 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

        static int findPivotWithDuplicates(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check for pivot condition
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }

                // Handle duplicates
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    // Skip duplicates
                    if (arr[start] > arr[start + 1]) {
                        return start;
                    }
                    start++;

                    if (arr[end] < arr[end - 1]) {
                        return end - 1;
                    }
                    end--;
                }
                // Left side is sorted, so pivot should be in the right
                else if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                }
                // Right side is sorted, so pivot should be in the left
                else {
                    end = mid - 1;
                }
            }

            return -1;
        }
    }

  