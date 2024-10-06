package Basics.Array;
import java.util.*;

public class _4_Linear_search {

    // creating a function which is find the largest value in an array
    public static int getLargest(int[] number){
        int largest = Integer.MIN_VALUE; // this is for the '-inf' value in the java
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Your smallest number present in an array is: "+ smallest);
        return largest;
    }
    // creating a function for search
    public static int Linearsearch(int[] number, int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // Linear search: finding the index of element in a given array
        int [] number = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = Linearsearch(number, key);
        if(index==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Your key at index: "+ index);
        }

        System.out.println("Largest value present in an array is: "+getLargest(number));
    }
}
