package HashMap;
import java.util.*;
public class Hashmap_2_que {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,6,4,9,1,3,1,1,1,1,6};
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int el : arr){
            if(!frequency.containsKey(el)){
                frequency.put(el, 1);
            } else{
                frequency.put(el, frequency.get(el) + 1);
            }
        }
        System.out.print("Frequency map :" );
        System.out.println(frequency.entrySet());
        int maxFreqVal=0;
        int anskey=0;

        for(var e : frequency.entrySet()){
            if(e.getValue() > maxFreqVal){
                maxFreqVal = e.getValue();
                anskey = e.getKey();

            }
        }
        System.out.println(anskey);
    }
}
