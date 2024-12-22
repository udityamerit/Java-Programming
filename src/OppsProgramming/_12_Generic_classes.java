package OppsProgramming;
import java.util.ArrayList;
import java.util.HashMap;

public class _12_Generic_classes {
    public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("cat");
    strings.add("dog");
    strings.add("alligator");

    String animal = strings.get(1);
        System.out.println(animal);

    }
    HashMap<Integer, String > map = new HashMap<Integer, String>();

}
