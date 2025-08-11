package BinarySearch;

public class Search_11_Rotated_SortedBinary {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1,0 ,1,1,2,2,22};
        System.out.println(search(arr, 0));  // Expected output: 4
    }

    static int search(int[] nums, int target){
        int pivot = findPivotWithDuplicates(nums);

        // If no pivot is found, it means the array is not rotated, so just do a normal binary search
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the pivot element is the target, return the pivot index
        if(nums[pivot] == target){
            return pivot;
        }

        // If the target is in the left sorted portion
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If the target is in the right sorted portion
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid - 1;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // Check for pivot condition
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // Check for pivot condition
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

           // if elements at mid, start, end are equal then just skip duplicaes
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                // NOTE : What if these elements at start and end were the pivot?
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check whether end is pivot or not?
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;

            }
            //left side is sorted so , pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid]) && arr[mid] > arr[end]){
             start = mid + 1;
            }
        }

        return -1;
    }
}
