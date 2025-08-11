package HashMap;
import java.util.HashMap;
import java.util.Arrays;

public class Hashmap_4_TwoSum {

        static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int part = target - nums[i];

                if (map.containsKey(part)) {
                    return new int[]{map.get(part), i};
                }

                map.put(nums[i], i);
            }

            return new int[]{-1, -1}; // If no solution found
        }

    public static void main(String[] args) {
        int [] nums = {10,12,3,5,1,2,3,8,9,0};
        int target = 10;
        Hashmap_4_TwoSum obj1 = new Hashmap_4_TwoSum();
        int[] result = obj1.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
    }

