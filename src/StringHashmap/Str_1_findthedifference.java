package StringHashmap;
import java.util.HashMap;

 class Str_1_findthedifference {
        static char findTheDifference(String s, String t) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : t.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    return c;
                } else {
                    map.put(c, map.get(c) - 1);
                }
            }

            return ' ';
        }

        public static void main(String[] args) {
            Str_1_findthedifference solution = new Str_1_findthedifference();
            String s = "abcd";
            String t = "abcdef";
            System.out.println(Str_1_findthedifference.findTheDifference(s, t));  // Output: 'e'
        }
    }


