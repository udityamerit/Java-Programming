package Advance_Concept;

import java.util.*;
public class _1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // adding the elements in the ArrayList
        numbers.add(10);
        numbers.add(200);
        numbers.add(400);

        // Retrieving with the normal for loop
        for(int i = 0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));

        }

        // using the for each loop
        for(Integer value: numbers){
            System.out.println(value);
        }

        numbers.remove(0);
        // creating the String ArrayList
        ArrayList<String> name = new ArrayList<String>();

    }
}
