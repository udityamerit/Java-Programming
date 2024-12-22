package OppsProgramming;

class Machine{
    private String name;
    private int code;

    // default constructor
    public Machine(){
        System.out.println("constructor calling!");
    }
    // parameterised constructor
    public Machine(String name, int code){
        this.name = name;
        System.out.println("Name of the parameterised constructor machine is: "+ this.name);
        this.code = code;
        System.out.println("Age to the machine is: "+this.code);
    }

}

public class _5_Constructor {
    public static void main(String[] args) {
    Machine m1 = new Machine();
    Machine m2 = new Machine("Uditya", 20);
    }
}
