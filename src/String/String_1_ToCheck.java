package String;

public class String_1_ToCheck {
    public static void main(String[] args) {
        String a = new String ("Himanshu");
        String b = new String ("Himanshu");

        System.out.println(a == b); // give false
        //a == b: This will return false because the == operator compares
        // object references (memory locations), not the content of the objects.
        // Since a and b are created using the new keyword, they refer to two different objects in memory,
        // even though they contain the same string. Therefore, a == b will return false.

        System.out.println(a.equals(b)); // give true
        //a.equals(b): This will return true because the equals() method compares
        // the contents of the strings, not the references.
        // Since both a and b contain the same string value ("Himanshu"), a.equals(b) will return true.



        String name1 = "Himanshu";
        String name2 = "Himanshu";

        System.out.println(name1 == name2);  // true
        //name1 == name2: This will return true because string literals are
        // stored in the string pool. Both name1 and name2 refer to the same string
        // literal ("Himanshu") in the pool. So, name1 and name2 point to the same memory location,
        // and the == operator checks for reference equality. Since both refer to the same object,
        // name1 == name2 will return true.

        System.out.println(name1.equals(name2)); // true
        //name1.equals(name2): This will also return true because equals() checks the content of the strings,
        // and both name1 and name2 contain the same string ("Himanshu").


    }
}
