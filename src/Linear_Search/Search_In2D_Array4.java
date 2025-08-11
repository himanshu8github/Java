package Linear_Search;

 class SearchIn2D_Array4 {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 58, 31},
                {54, 7, 52, 3},
                {27, 36},
                {20, 10, 210, 33}
        };

        int maxValue = Max(arr);
        System.out.println("Maximum Value: " + maxValue);
    }

    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
}
