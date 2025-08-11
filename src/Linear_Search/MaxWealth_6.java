package Linear_Search;

public class MaxWealth_6 {
    public static void main(String[] args) {

    }

    /// here i = person
    // and j = account
    static int checkWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];

            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
