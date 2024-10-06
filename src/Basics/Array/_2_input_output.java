package Basics.Array;
import java.util.*;

public class _2_input_output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // initialisation of an array
        int[] marks = new int[3];

        // taking the input from the user
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy: "+ marks[0]);
        System.out.println("chy: "+ marks[1]);
        System.out.println("math: "+ marks[2]);

        // update the value present in an array
        marks[2] = 45;
        for(int i: marks){
            System.out.println(i);

        }
        // length of the array
        int l = marks.length;
        System.out.println(l);
    }
}
