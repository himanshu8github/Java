package Linear_Search;

public class Linear_Search1 {
    public static void main(String[] args){
        int[] nums = {21, 56, 323 , 12 ,-7,-21,10,24,45};
        int target = 0;
        int ans = linearSerach(nums ,target);
        System.out.println(ans);
    }

    static int linearSerach(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
