package OppsProgramming;

class Car{
    public void start(){
        System.out.println("Car started.");

    }
}
class SuperCar extends Car{
    public void selfStart(){
        System.out.println("Super car is created using basic car design");
    }
}
public class _8_Inheritance {
    public static void main(String[] args) {
    Car c = new Car();
    c.start();
    SuperCar sc = new SuperCar();
    sc.selfStart();
    sc.start();
    }
}
