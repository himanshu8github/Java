package Sorting;

import java.util.Arrays;

public class Cycle_7_MissingNum {

    public static void main(String[] args) {
        int[] nums = {0, 5, 2, 1, 4};
        int missing = missingNumber(nums);
        System.out.println("Missing Number: " + missing);
        System.out.println(Arrays.toString(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Search for the missing element
        for ( i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }


    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
