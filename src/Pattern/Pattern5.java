package Pattern;
import java.util.Scanner;

public class Pattern5 {
    public static void nTriangle(int n) {
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                if(j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nTriangle(n);
        scanner.close();

    }
}

