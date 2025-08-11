package Array;

public class Array_1 {

    // Multi-dimensional array example
    void multiArr() {
        int[][] arr_1 = new int[5][3]; // Just an example, not used in your code
        int[][] arr_2 = {{1, 2, 51}, {21, 55, 6}};

        // Printing elements of arr_2 using for loop
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_2[i].length; j++) {
                System.out.print(arr_2[i][j] + " "); // Print on same line, space-separated
            }
        }
    }

    // 1D Array example with multiple types of loops
    void arr() {
        String[] names = {"Rahul", "Riya", "Rocky"};
        int[] ages = {12, 52, 25};

        // for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int age : ages) {
            System.out.println(age); // Print each age in a new line
        }

        // while loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]); // Print each age in a new line
            i++; // Increment the index
        }
    }

    public static void main(String[] args) {
        Array_1 arrayExample = new Array_1();

        // Call methods to see the output
        System.out.println("Multi-dimensional Array Output:");
        arrayExample.multiArr(); // Prints the multi-dimensional array

        // Print a new line for better separation of outputs
        System.out.println("\n");

        // Print 1D array values
        System.out.println("1D Array Output:");
        arrayExample.arr(); // Prints the 1D array values
    }
}
