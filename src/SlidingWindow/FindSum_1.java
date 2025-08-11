package SlidingWindow;

public class FindSum_1 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int k = 3; // window size
            int maxSum = findMaxSumSubarray(arr, k);
            System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
        }

        public static int findMaxSumSubarray(int[] arr, int k) {
            int n = arr.length;

            // Edge case: if k is greater than the array length
            if (n < k) {
                System.out.println("Window size cannot be greater than array size.");
                return -1;
            }

            // Calculate the sum of the first window of size k
            int currentSum = 0;
            for (int i = 0; i < k; i++) {
                currentSum += arr[i];
            }

            int maxSum = currentSum;

            // Slide the window, removing the leftmost element and adding the next element
            for (int i = k; i < n; i++) {
                currentSum += arr[i] - arr[i - k];  // Slide the window by subtracting the element that's left out and adding the new element.
                maxSum = Math.max(maxSum, currentSum);  // Update maxSum if currentSum is greater
            }

            return maxSum;
        }
    }


