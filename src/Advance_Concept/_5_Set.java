package Advance_Concept;

import java.util.HashSet;
import java.util.Set;

public class _5_Set {
    public static void main(String[] args) {
        Set<String > set1 = new HashSet<String >();
        set1.add("dog");
        set1.add("cat");
        set1.add("dog");
        set1.add("bear");
        set1.add("snake");

        System.out.println(set1);
    }
}
