import java.util.*;
import java.lang.Math;
public class Main{
    // method for the fibonacci series
    static  int fib(int x){
        if (x==0){
            return 0;
        } else if (x ==1) {
            return 1;
        }
        else{
            return fib(x-1) + fib(x-2);
        }
    }

    // method for factorial calculation
    static  int fact(int x){
        if (x==0 || x==1){
            return 1;
        }
        else{
            return x*fact(x-1);
        }
    }

    // method for armstrong number
    public static void armstrong(int x){
        int sum = 0;
        int y = x;
        int z  = x;

        double count = 0;
        while (y!=0){
            y = y/10;
            count++;
        }
        while(x!=0){
            int r = x%10;
            sum = (int) (sum+ Math.pow(r,count));
            x = x/10;
        }
        if (z == sum){
            System.out.println(z+" is a armstrong number");
        }
    }

    // methods for checking for prime numbers
    static void prime(int y){
        int c = 0;
        for(int i = 2; i<y; i++){
            if (y%i==0){
                c = c+1;
            }
        }
        if (c>0){
            System.out.println(y+" is not a prime number ");
        }
        else{
            System.out.println(y+" is a prime number ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1, Given year is Leap year or not.
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println(" ");
        // 2. Given number is odd or even.
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even number ");
        }
        else {
            System.out.println(num+" is odd number ");
        }
        System.out.println(" ");

        // 3. Biggest of N numbers.
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.println("Enter the elements of the array: ");
//            int inp = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i<size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Greatest Elements of the array: "+ max );
        System.out.println(" ");



        // code for the palindrome
        System.out.println("Enter the number to check for palindrome:");
        int poly = sc.nextInt();
        int pl = poly;
        int reverse = 0;
        while (poly != 0){
            int r = poly%10;
            reverse = (reverse*10)+r;
            poly = poly/10;

        }
        if(reverse==pl){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        }
        System.out.println(" ");

//        Find the student grade calculation with Grade A, B, C and Fail.
        System.out.println("Please enter the marks of a student: ");
        double score = sc.nextDouble();
        if(score>90){
            System.out.println("Your grade is A");
        }
        else if(score>80){
            System.out.println("Your grade is B");
        }
        else if(score>70){
            System.out.println("Your grade is C");
        }
        else if(score>60){
            System.out.println("Your grade is D");
        }
        else if(score>50){
            System.out.println("Your grade is E ");
        }
        else{
            System.out.println("Your are fail in the exam ");
        }
        System.out.println(" ");


//        Display given multiplication table.
        System.out.println("Enter the number which table you want: ");
        int m = sc.nextInt();
        System.out.println("Your table of "+m+" is: ");
        for(int i = 1 ; i<=10; i++){
            System.out.println(m+" X "+ i +" = "+ m*i);
        }
        System.out.println(" ");

//        How to Generate Random Number in Java
        System.out.println("Please enter max range of random number: ");
        int max_value = sc.nextInt();
        System.out.println("Please enter the min range fo random number");
        int min_value = sc.nextInt();
        System.out.println("Your random number is: "+Math.random()*(max_value-min_value+1)+min_value);
        System.out.println(" ");

        // display the even number 100
//        int[] display =
        for(int i = 0; i<=100; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        // checking the number is positive zero or negative
        float check = sc.nextFloat();
        if(check>0){
            System.out.println(check+" is Positive");
        }
        else if(check==0){
            System.out.println(check+ " is Zero ");
        }
        else{
            System.out.println(check+" is Negative ");
        }

        // sum of natural numbers
        int sum = 0;
        System.out.println("Enter the number to find the sum of nth natural number ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of "+n+" th natural number is: "+ sum);
    }
}
