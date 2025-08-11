package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        list.add(11);

        System.out.println("Original list: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);

        Collections.reverse(list);
        System.out.print("Reverse Using collection : " + list);

        System.out.println("Sort using Collections.sort method : ");
        Collections.sort(list);
        System.out.println("Sort in reverse order using Collections methods i.e descending order : ");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println( list);
    }

    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        // Reversing the list by swapping elements
        while (i < j) {
            Integer temp = list.get(i);      // Store element at i
            list.set(i, list.get(j));        // Set element at i to element at j
            list.set(j, temp);               // Set element at j to the stored element at i
            i++;
            j--;
        }
    }
}
