package Basics.Methods;
import java.util.*;

public class _4_check_prime {

    // creating a function which is check the number is prime of not
    public static boolean isprime(int x){
        boolean isPrime = true;
        for(int i = 2; i<x; i++){
            if (x%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isprime(a));

    }
}
