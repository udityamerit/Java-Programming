package Basics;

// importing the module
import java.util.Scanner;
// or you can write the " import java.util.* " if you write this then the system import all the essential modules or packages
public class _05_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // we are define sc object, so that by using the sc object name we can get the input from the user at the run time.
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        double mul = a*b;
        System.out.println("Sum of the numbers is: "+ (a+b));
        System.out.println("Multiplication of the numbers is: "+ mul);

        // Taking the input of string from the user side
        System.out.print("Enter your name : ");
        String name = sc.next(); // it is read only the one word present in the sentence
        System.out.println("Your name is: "+ name);

        // In order to read the full sentence we have used the another different method name is: sc.nextLine()
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Your given address is: "+ address);

    }
}
