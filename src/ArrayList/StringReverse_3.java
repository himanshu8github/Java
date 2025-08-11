package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringReverse_3 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Hello!");
        str.add("Welcome");
        str.add("to");
        str.add("coding");
        System.out.println("Hey!" + str);

        Collections.sort(str);
        System.out.println("After sort :  " + str);

        Collections.sort(str, Collections.reverseOrder());
        System.out.println("Reverse Using collections method : " + str);

    }
}
