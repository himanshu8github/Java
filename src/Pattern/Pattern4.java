package Pattern;
import java.util.Scanner;

public class Pattern4 {

    public static void nTriangle(int N) {
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
                if(j < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = scanner.nextInt();
        nTriangle(N);
        scanner.close();

    }
}
