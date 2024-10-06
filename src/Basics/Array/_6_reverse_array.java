package Basics.Array;
import java.util.*;

public class _6_reverse_array {
    // method for reverse the array
    public static void reverse(int[] number){
        int first = 0, last = number.length-1;
        while (first < last){
            // swap the first element with the last element
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
        System.out.println(" ");
    }

    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,8};
        System.out.println("array before reverse: ");
        for(int i:number){
            System.out.print(i+" ");
        }
        reverse(number);
        System.out.println("array after reverse: ");
        for(int i: number){
            System.out.print(i+" ");
        }

    }
}
