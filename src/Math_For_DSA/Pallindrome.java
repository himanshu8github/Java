package Math_For_DSA;

public class Pallindrome {
        public static boolean ispallindrome(int n) {
            int revNum  = 0;
            int dup = n;
            while (n > 0) {
                int lastDigit = n % 10;
                revNum  = (revNum * 10) + lastDigit;
                n /= 10;
            }
            return dup == revNum ;
        }



        public static void main(String[] args) {
            int n = 121;
            if (ispallindrome(n)){
                System.out.println("true");
            } else{
                System.out.println("false");
            }

        }
    }

