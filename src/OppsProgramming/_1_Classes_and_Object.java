package OppsProgramming;
import java.util.*;
// creating a class

class Employee{
    Scanner sc = new Scanner(System.in);
    //  creating the attributes of the class variables;
    String name;
    int age;
    String salary;
    String company_name;
    String location;
    // creating the methods for the employ class
    public void get_data(){
        System.out.println("Getting the details of Employee: ");
        System.out.print("Please enter the name of Employee: ");
        name = sc.next();
        System.out.print("Please enter the age of Employee: ");
        age = sc.nextInt();
        System.out.print("Please enter the salary of Employee: ");
        salary = sc.next();
        System.out.print("Please enter the company name of the Employee where he work: ");
        company_name = sc.next();
        System.out.print("Please enter the home location of the Employee where he live: ");
        location = sc.nextLine();
    }
    public void Display_data(){
        System.out.println("Printing the details of Employee: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(company_name);
        System.out.println(location);
    }
}

public class _1_Classes_and_Object {
    public static void main(String[] args) {
        Employee e1 = new Employee();
            e1.get_data();
            e1.Display_data();
    }
}
