package OppsProgramming;

class Frog{
    private String name;
    private int age;
    /* If you create a variable or methods inside the java programming and your methods and variables are in private data type then only the class can be access it outside the class those  variables and methods are not accessible so if any class want the access of those variables then we have to set that variables and methods as a public keywords
    * so using the setter and getter function name we can make the private variables and methods public for public use but the condition is that you have to create the setter and getter inside the same class where the private variables and methods are present or defined. */

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
    public void getInfo(){
        System.out.println("The name of the Frog is: "+ name + "\nthe age is: "+ age);
    }
}
public class _4_getter_and_setters {
    public static void main(String[] args) {
        Frog frog1  = new Frog();
        frog1.setName("Sinu");
        frog1.setAge(23);
        int Age = frog1.getAge();
        String Name = frog1.getName();
        frog1.setInfo(Name, Age);
        frog1.getInfo();

    }
}
