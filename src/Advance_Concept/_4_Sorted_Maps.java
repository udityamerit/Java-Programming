package Advance_Concept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _4_Sorted_Maps {

    public static void testMap(Map<Integer, String > map){
        map.put(6," fox");
        map.put(61," lion");
        map.put(16," cat");
        map.put(3," dog");
        map.put(64," rock");
        map.put(5," paper");
        map.put(7," snake");
        map.put(69," giraffe");

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key+ ": "+ value);
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        System.out.println("/////////////HasMap////////////////");
        testMap(hashMap);
        System.out.println("////////////////Tree map/////////////");
        testMap(treeMap);
        System.out.println("///////////////Linkedlist//////////////");
        testMap(linkedHashMap);
    }
}
