package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void nForest(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        nForest(N);

        scanner.close();
    }
}
