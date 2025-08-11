package ArrayList;

import java.util.ArrayList;

public class List_1 {
    public static void main(String[] args) {

        // Wrapping primitive types in wrapper objects
        Integer i1 = Integer.valueOf(4);
        System.out.println(i1);  // prints: 4
        Float f = Float.valueOf(2.4f);
        System.out.println(f);  // prints: 2.4

        // Creating ArrayLists of Integer and Float
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Float> F1 = new ArrayList<>();

        // Adding elements to the ArrayList
        System.out.println("Before Adding : " + L1);
        L1.add(5);
        L1.add(55);
        L1.add(8);
        L1.add(20);
        System.out.println("After Adding : " + L1);

        // Accessing elements at specific indices
        System.out.println(L1.get(0));  // prints: 5
        System.out.println(L1.get(2));  // prints: 8

        // Looping through ArrayList using enhanced for loop
        for (Integer num : L1) {
            System.out.print(num + " ");  // prints: 5 55 8 20
        }
        System.out.println();

        // Printing ArrayList directly
        System.out.println(L1);  // prints: [5, 55, 8, 20]

        // Adding an element at a specific index
        L1.add(1, 25);
        System.out.println(L1);  // prints: [5, 25, 55, 8, 20]

        // Modifying an element at a specific index
        System.out.println("Before : " + L1);
        L1.set(0, 22);
        System.out.println("After : " + L1);  // prints: [22, 25, 55, 8, 20]

        // Removing an element at a specific index
        L1.remove(2);  // removes element at index 2 (which is 55)
        System.out.println("After removing index value: " + L1);  // prints: [22, 25, 8, 20]

        // Removing a specific value
        L1.remove(Integer.valueOf(55));  // removes the value 55 from the list
        System.out.println("After removing specific value: " + L1);  // prints: [22, 25, 8, 20]

        // Checking if a value exists in the list
        boolean ans = L1.contains(Integer.valueOf(5));
        System.out.println("Check value exists or not: " + ans);  // prints: false
    }
}
