package Basics.Array;

import java.util.*;

// Array: List of elements of the same type placed in a contiguous memory location

// Syntax of creating an array
/*
  <data type> array name [] = new <data type> [size]
                    or
   <data type> [] array name = new <data type> [size]



 */
public class _1_basic  {
    public static void main(String[] args){
        // creating some arrays in java
        int[] marks = new int[10];
        int[] numbers = {1,2,3};
        String[] fruits = {"apple", "mango"};
        for(String i: fruits){ // this is for each loop
            System.out.println(i);
        }

    }
}
