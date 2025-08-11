package HashMap;
import java.util.HashMap;

public class Hashmap_2_Ananagram {

    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        return mp;
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }

    static boolean isAnagram1(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currentFreq = mp.get(ch);
            mp.put(ch, currentFreq-1);
    }
        for(Integer i : mp.values()){
            if(i != 0) return false;
        } return true;
        }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are the strings anagrams? " + isAnagram(s1, s2)); // Expected output: true

        String s3 = "rat";
        String s4 = "car";
        System.out.println("Are the strings anagrams? " + isAnagram(s3, s4)); // Expected output: false
    }
}
