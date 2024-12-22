package OppsProgramming;

class Mach{
    public void start(){
        System.out.println("Machine started.");
    }
}

class  Camera extends Mach{
    public void start(){
        System.out.println("Camera started.");
    }
    public void snap(){
        System.out.println("Photo taken.");
    }
}
public class _11_UpperCasting_and_DownCasting {
    public static void main(String[] args) {
    Mach m1 = new Mach();
    Camera c1 = new Camera();

    m1.start();
    c1.start();
    c1.snap();

    //uppercasting
    Mach m2 = c1;
    m2.start();
     //downcasting
    Mach m3 = new Camera();
    Camera c2 = (Camera)m3;
    c2.start();
    c2.snap();
    }
}
