package Recursion;
import java.util.Scanner;

public class Print_N_to_1 {
        static void printNum(int n){
            if(n == 1){
                System.out.println(n);
                return;
            }
            System.out.println(n);
            printNum(n-1);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            printNum(n);
        }
    }



