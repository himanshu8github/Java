package Math_For_DSA;

public class Reverse_Number {
    public static int reverse(int n) {
        int revNum  = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum  = (revNum * 10) + lastDigit;
            n /= 10;
        }
        return revNum ;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed Number: " + reverse(num));
    }
}
