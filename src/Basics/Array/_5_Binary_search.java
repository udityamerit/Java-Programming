package Basics.Array;
import java.util.*;

// time complexity of binary search is O(log n)
public class _5_Binary_search {

    // method for the binary search
    public static int binarysearch(int[] number, int key){
        Arrays.sort(number);
        int start = 0, end = number.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if (number[mid]<key) { // right
                start = mid+1;
            }
            else { // left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        /*
        Pseudocode for binary search
        start = 0, end = n-1
        while(start<=end)
            find mid ==>(start+end)/2
            compare mid & key
                mid == key ==> found
                mid > key ==> search in left half
                mid < key ==> search in right half
         */
        int[] number = {12,34,56,67,45,23,56,67,456};
        int key = 56;
        int res = binarysearch(number, key);
        if(res == -1){
            System.out.println("Key Not found ");
        }
        else{
            System.out.println("Your key at index is: "+ res);
        }

    }
}
