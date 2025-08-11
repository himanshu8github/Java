package Sorting;

public class Cycle_12_SetMismatch {

    public int[] findDuplicateAndMissing(int[] nums) {
        int i = 0;
        int duplicate = -1;
        int missing = -1;

        // First pass: Identify the duplicate number
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    // Swap to put the number in the correct position
                    swap(nums, i, correct);
                } else {
                    duplicate = nums[i]; // Found the duplicate
                    i++;
                }
            } else {
                i++;
            }
        }

        // Second pass: Identify the missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }

    // Helper function to swap elements in the array
    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Cycle_12_SetMismatch obj = new Cycle_12_SetMismatch(); // Correct class name here
        int[] nums = {1, 2, 2, 4};
        int[] result = obj.findDuplicateAndMissing(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]); // Expected [2, 3]
    }
}
