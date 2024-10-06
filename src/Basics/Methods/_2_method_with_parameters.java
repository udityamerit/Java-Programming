package Basics.Methods;
import java.util.*;

public class _2_method_with_parameters {
    // creating a function
    public static void calculatesum(int a, int b){
        int sum = a+b;
        System.out.println("sum of a and b is: "+sum);

    } public static int calculateproduct(int a, int b){
        int mul = a*b;
        return mul;
    }

    // creating a function for swapping of two numbers
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }
    // code for factorial using recursion
    public static int factorral(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return (x*factorral(x-1));
        }
    }
    // factorial using for loop
    public static int fact(int x){
        int f = 1;
        for(int i =1; i<=x; i++){
            f = f*i;
        }
        return f;
    }

    // in java language only call by value is present java does not support the call by reference and call by address

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);
        System.out.println("a*b = "+ calculateproduct(a, b));

        swap(a, b);
        System.out.println("Enter the number for factorial: ");
        int f = sc.nextInt();
        System.out.println(f+" factorial is: "+factorral(f));

        int c = sc.nextInt();
        System.out.println(c+" factorial is: "+ fact(c));
    }

}
