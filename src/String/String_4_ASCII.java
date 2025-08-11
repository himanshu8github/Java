package String;

public class String_4_ASCII {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            System.out.print(ch + " ");

            series = series + ch;
        }
        System.out.println(series);
    }
}
