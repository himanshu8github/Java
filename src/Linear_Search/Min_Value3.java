package Linear_Search;

public class Min_Value3 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 25, 3, 1, 0, 110};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
