package Sorting;

public class Cycle_9_FindDuplicateInArray {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i]; // Return duplicate
                }
            } else {
                i++; // Move to next element if it's at the correct position
            }
        }
        return -1; // No duplicate found
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Cycle_9_FindDuplicateInArray obj = new Cycle_9_FindDuplicateInArray();
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println("Duplicate: " + obj.findDuplicate(nums)); // Should print 3
    }
}
