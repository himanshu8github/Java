package Matrix;

public class Sorted_1_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 16;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // n = row, m = col
        int n = matrix.length;
        int m = matrix[0].length;
        int st = 0;
        int end = n * m - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midElement = matrix[mid / m][mid % m];

            if (midElement == target) {
                return true;
            }
            if (midElement > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
}
