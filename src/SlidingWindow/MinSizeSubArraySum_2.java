package SlidingWindow;

public class MinSizeSubArraySum_2 {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;

        //We loop through the array with the end pointer,
        // which represents the right side of the current subarray.
        //For each element, we add it to currentSum.
        for ( end = 0; end < n; end++) {
            currentSum += nums[end];


            //Whenever currentSum is greater than or equal to target, we enter the while loop.
            while (currentSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                currentSum -= nums[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        MinSizeSubArraySum_2 solution = new MinSizeSubArraySum_2();

        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.print(solution.minSubArrayLen(target1, nums1));

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.print(solution.minSubArrayLen(target2, nums2));
    }
}
