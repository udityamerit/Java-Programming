package Advance_Concept;

import java.util.HashMap;
import java.util.Map;

public class _3_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "five");
        map.put(4,"four");
        map.put(3,"three");
        map.put(6,"six");
        map.put(8,"eight");
        String text  = map.get(4);
        String text2  = map.get(10);
        System.out.println(text);
        System.out.println(text2); // if the key value is not present in the HasMap then it is return the null

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+ ": "+ value);
        }
    }
}
