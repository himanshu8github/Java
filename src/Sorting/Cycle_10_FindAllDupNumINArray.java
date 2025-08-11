package Sorting;
import java.util.ArrayList;
import java.util.List;

public class Cycle_10_FindAllDupNumINArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Cycle_10_FindAllDupNumINArray solution = new Cycle_10_FindAllDupNumINArray();
        //creating an instance (or object) of the class
        List<Integer> result = solution.findDuplicates(nums);
        System.out.println(result);
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
