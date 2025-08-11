package HashMap;

import java.util.HashMap;

public class Hashmap_3_Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("ab", "aa")); // false
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false; // Lengths must be same

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            // Check if mapping in s -> t exists and is consistent
            if (sToT.containsKey(sCh)) {
                if (sToT.get(sCh) != tCh) return false;
            } else {
                sToT.put(sCh, tCh);
            }

            // Check if mapping in t -> s exists and is consistent
            if (tToS.containsKey(tCh)) {
                if (tToS.get(tCh) != sCh) return false;
            } else {
                tToS.put(tCh, sCh);
            }
        }
        return true;
    }
}
