package Math_For_DSA;

public class Prime_Number {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 15;

        System.out.println(isPrime(num1));  // Output: true
        System.out.println(isPrime(num2));  // Output: false
    }
}



