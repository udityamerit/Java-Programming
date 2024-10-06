package PracticeSets;

// importing the necessary modules
import java.util.*;

public class Exe_1_Percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  creating the object to take the system input

        // Creating the 5 different subject inputs which is store the marks given by the user side:
        System.out.println("Maximum marks is 100 of each paper..  ");
        System.out.print("Enter the Marks of Physics: ");
        float phy = sc.nextFloat();
        System.out.print("Enter the Marks of Chemistry: ");
        float chy = sc.nextFloat();
        System.out.print("Enter the Marks of Hindi: ");
        float hindi = sc.nextFloat();
        System.out.print("Enter the Marks of English: ");
        float eng = sc.nextFloat();
        System.out.print("Enter the Marks of Math: ");
        float math = sc.nextFloat();

        float total = phy + chy + hindi + eng + math;
        float percentage = total/500;
        System.out.println("Your total percentage: "+ percentage*100);
    }
}
