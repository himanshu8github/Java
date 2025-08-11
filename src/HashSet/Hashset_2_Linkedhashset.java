package HashSet;
import java.util.LinkedHashSet;
public class Hashset_2_Linkedhashset {
        public static void main(String[] args) {
            LinkedHashSet<String> str = new LinkedHashSet<>();
            str.add("Himanshu");
            str.add("Ashwin");
            str.add("vasu");
            str.add("neeraj");
            str.add("Kanan");
            str.add("Ashwin");  // duplicate

            // Output will follow the insertion order
            System.out.println(str);
        }
    }


