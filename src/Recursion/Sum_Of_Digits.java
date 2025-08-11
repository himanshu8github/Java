package Recursion;

public class Sum_Of_Digits {
    static int sod(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
//        int lastDigit = n % 10;
//        int smalAns = sod(n/10);
//        int ans = smalAns + lastDigit;
//        return ans

//  (/) is used to remove the last digit and reduce the problem to a smaller number.
     // and the modulus operator (%) is used to get the last digit of the number.

        return sod(n/10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(sod(5523));
    }
}
