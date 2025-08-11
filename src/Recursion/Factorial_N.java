package Recursion;

public class Factorial_N {
    static int factorial(int n ){
        if(n == 0 ){
            return 1;
        }

//        int smallans = factorial(n-1);
//        int ans = n * smallans;
//        return ans;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
