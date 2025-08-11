package Math_For_DSA;

public class Armstrong {
    public static boolean isArmstrong(int n) {
            int originalNumber = n;
            int sum = 0;

            // Calculate the sum of each digit raised to the kth power
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit * digit);
                n /= 10;
            }
            return sum == originalNumber;
        }

        public static void main(String[] args) {
            System.out.println(isArmstrong(371));  // true
            System.out.println(isArmstrong(123));  // false
        }
    }


