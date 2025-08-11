package HashMap;
import java.util.HashMap;
public class Hashmap_5_LargestSubarrayWith0Sum {
        public static int maxLen(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int maxLength = 0;
            int prefixSum = 0;

            for (int i = 0; i < arr.length; i++) {
                prefixSum += arr[i];

                // If sum is 0, update maxLength
                if (prefixSum == 0) {
                    maxLength = i + 1;
                }

                // If prefixSum was seen before, update maxLength
                if (map.containsKey(prefixSum)) {
                    maxLength = Math.max(maxLength, i - map.get(prefixSum));
                } else {
                    // Store first occurrence of prefixSum
                    map.put(prefixSum, i);
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
            System.out.println("Output: " + maxLen(arr1)); // Expected Output: 5

            int[] arr2 = {2, 10, 4};
            System.out.println("Output: " + maxLen(arr2)); // Expected Output: 0
        }
    }

