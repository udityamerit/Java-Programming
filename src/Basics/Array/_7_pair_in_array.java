package Basics.Array;
import java.util.*;
public class _7_pair_in_array {
    public static void printpair(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.println("("+arr[i]+", "+ arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // printing the array element
//        for(int i: arr){
//            System.out.println(i);
//        }
        printpair(arr);


    }
}
