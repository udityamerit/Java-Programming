package OppsProgramming;
import java.util.*;
//import java.lang.Override;
class robot{
    public void start(){
        System.out.println("Starting the robot");

    }
}

//creating a different anonymous class
interface plant{
    public void grow();
}

public class _13_Anonymous {
    public static void main(String[] args) {
        robot r1 = new robot(){// this is called as anonymous class because the orverriden function is not belongs to any other class we have just override the instance
            @Override public void start(){
                System.out.println("Camera snapping");
            }
        };
        r1.start();
        plant p1 = new plant() {
            @Override
            public void grow() {
                System.out.println("plant is growing");
            }
        };
        p1.grow();
    }
}
