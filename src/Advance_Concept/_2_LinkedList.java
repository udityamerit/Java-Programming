package Advance_Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.LinkedList;
public class _2_LinkedList {

    private static void doTimings(String type, List<Integer> list){
        for(int i = 0 ; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //add the items at the end of the list
        for(int i = 0 ; i<1E5; i++){
            list.add(i);
        }

//        // add the items elsewhere in the list
//        for(int i = 0; i<1E5; i++){
//            list.add(0,1);
//        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+ (end-start)+ " ms for "+ type);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedLIst = new LinkedList<Integer>();
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedLIst);
    }
}
