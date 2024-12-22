package OppsProgramming;
class Person{
    String name;
    int age;
    void speak(){
        System.out.println("My name is: "+ name);
    }
    int calculateYearToRetirement(){
        int yearLeft = 65-age;
        return yearLeft;
    }
}
public class _3_Getter {
    public static void main(String[] args) {
    Person Person1 = new Person();
    Person1.name = "Rohan";
    Person1.age = 25;
    Person1.speak();
    System.out.println(Person1.calculateYearToRetirement());
    }
}
