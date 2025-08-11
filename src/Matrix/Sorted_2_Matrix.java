package Matrix;

public class Sorted_2_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (current > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Sorted_2_Matrix solution = new Sorted_2_Matrix();

        int[][] matrix1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target1 = 5;
        System.out.println("Example 1 - Target 5: " + solution.searchMatrix(matrix1, target1));


        int[][] matrix3 = {{1, 4}, {2, 5}};
        int target3 = 2;

        System.out.println("Example 3 - Target 10 in empty matrix: " + solution.searchMatrix(matrix3, target3));
    }
}
