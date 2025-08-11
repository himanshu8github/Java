package String;

public class String_9_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        // hello --> mello
        str.setCharAt(0, 'm');
        System.out.println(str);
    }
}
