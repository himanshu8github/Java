package Array;
import java.util.Scanner;

public class Array2D_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] arr = {
//                {1,2,3},    //0th index
//                {4,5,6,11}, //1st index
//                {7,9}       //2nd index
//        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows

        //take input from user
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print( arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
