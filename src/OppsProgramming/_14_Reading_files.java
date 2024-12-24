package OppsProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class _14_Reading_files {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\Uditya\\Desktop\\hello.txt";
        //  or you can write as the "C:/User/Uditya/Desktop/hello.txt"; both are same
        File textFile = new File(fileName);
        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("integer value is: "+ value);

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }

        in.close();
    }
}
