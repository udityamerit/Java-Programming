package Basics.Methods;
import java.util.*;

public class _3_function_overloading {

    // so in Method overloading the functions names are same but there parameters are different and the data types of the parameters may be same or different

    // method overloading
    public  static int sum(int a, int b){
        return a+b;
    }
    // method overloading
    public  static int sum(int a, int b, int c){
        return a+b+c;
    }


    // function overloading using data types;
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum of a and b is: "+ sum(a, b));
        System.out.println("sum of a, b and c is: "+ sum(a, b, c));

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println("sum of float a, b is: "+ sum(x, y));

    }
}
