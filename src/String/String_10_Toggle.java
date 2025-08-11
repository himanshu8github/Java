package String;
import java.util.Scanner;

public class String_10_Toggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder(input.nextLine());
        System.out.println(str);

        // toggle
        for(int i = 0; i < str.length(); i++){
            // H --> h
            //check out letter is small or capital
            boolean flag = true; // true --> capital
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            int asci = (int)ch;

            if(asci >= 97) flag = false; // small letter

            if(flag == true){
                asci += 32;

                char ch2 = (char)asci;
                str.setCharAt(i, ch2);

            }

       else{ // small
           asci -= 32;
           char ch2 = (char)asci;
           str.setCharAt(i, ch2);

            }
        }
        System.out.println(str);
    }
}
