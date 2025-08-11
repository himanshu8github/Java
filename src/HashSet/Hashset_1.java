package HashSet;

import java.util.HashSet;

public class Hashset_1 {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("Himanshu");
        str.add("Ashwin");
        str.add("vasu");
        str.add("neeraj");
        str.add("Kanan");
//        str.add("Ashwin");
        System.out.println(str);
        System.out.println(str.contains("vasu"));
        System.out.println(str.size());
    }
}
