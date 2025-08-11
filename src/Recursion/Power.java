package Recursion;

public class Power {
    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return pow(a, b - 1) * a;
        //how its work first b-1=5 so multiply 3 by 5 times then multipy with 3 i.e a
    }
        public static void main(String[] args) {
            System.out.print("The ans is : ");
        System.out.println(pow(3,6));

    }
}


