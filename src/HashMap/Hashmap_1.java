package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_1 {
    public static void main(String[] args) {
        hashmap();
    }

    static void hashmap() {
        Map<String, Integer> mp = new HashMap<>();
        // Adding elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Rishika", 17);
        mp.put("Rishi", 19);
        mp.put("Yashika", 18);
        System.out.println(mp);

        // Getting value of a key from hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Ravi")); // null

        // Updating value of a key in hashmap
        mp.put("Yash", 20);
        System.out.println("Updating age of Yash : " + mp.get("Yash"));

        // Removing a pair from hashmap
        System.out.println("Removing method : " + mp.remove("Akash"));
        System.out.println("Return null for non-existing value : " + mp.remove("Deepali"));
        System.out.println("After removing : " + mp);

        // Checking if key is in hashmap
        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsKey("Rishi"));

        // Adding a new entry only if the new key doesn't exist already
        mp.put("Ishika", 12);
        mp.put("Mahi", 19);
        System.out.println("Check method before adding : " + mp.putIfAbsent("Yash", 18));
        System.out.println("Adding new keys here : " + mp);

        // Get all keys in hashmap
        System.out.println("Getting all keys : " + mp.keySet());

        // Get all values in hashmap
        System.out.println("Getting values : " + mp.values());

        // Get all entries in hashmap
        System.out.println("Getting all entries in hashmap : " + mp.entrySet());

        // Traversing all entries - 2 methods

        // Method 1: Using keySet()
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        System.out.println();

        // Method 2: Using entrySet()
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", entry.getKey(), entry.getValue());
        }
    }
}
