package Advance_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _6_Sorting {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String >();
        animals.add("cat");
        animals.add("dog");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mangoose");

        Collections.sort(animals);
        for(String animal: animals){
            System.out.println(animal);
        }

        List<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(35);
        num.add(13);
        num.add(73);
        num.add(63);
        num.add(34);
        num.add(43);

        Collections.sort(num);
        for(Integer n: num){
            System.out.println(n);
        }

    }
}
