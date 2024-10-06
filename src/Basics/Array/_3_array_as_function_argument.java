package Basics.Array;
import java.util.*;

// we are know that in the java language if we want to access the value of any variable  from the main() to any user define function  we should pass the values as a < pass by values> and others like(pass by reference and pass by address) not works but in case of array passing as a parameter it is automatically pass by reference

public class _3_array_as_function_argument {
    // creating an update method for an array marks
    public static void update(int[] marks){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args){
        // creating an array
        Scanner sc = new Scanner(System.in);
        int[] marks = {12,23,45};
        update(marks);

        // printing the elements present int an array marks
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
    }
}
