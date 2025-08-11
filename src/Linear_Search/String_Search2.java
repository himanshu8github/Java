package Linear_Search;

public class String_Search2 {
    public static void main(String[] args) {
        String name = "Himanshu";
        char target = 'e';  // Target character is 'o'

        System.out.println("For Loop : ");
        System.out.println(checkStr(name, target));  // First method call
        System.out.println("For each loop : ");
        System.out.println(checkStr2(name, target));  // Second method call
    }

    static boolean checkStr2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray() ){  // For-each loop over characters
            if(ch == target){
                return true;  // Return true if target is found
            }
        }
        return false;  // Return false if not found
    }

    static boolean checkStr(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target){  // Standard for loop using charAt
                return true;  // Return true if target is found
            }
        }
        return false;  // Return false if not found
    }
}
