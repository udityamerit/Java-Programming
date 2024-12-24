package OppsProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class _15_Exceptions_Handling {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hello.txt");
        FileReader fr = new FileReader(file);

        // so this is a one way to handle the exception using the throws method

        /* there is another method to resolve the exception handling using hte try and catch block ==>

         instead of writing the throws FileNotFoundException after the main method(public static void main(String[] args) so we are writing the throws method here we use the :

        try{
        FileReader fr = new FileReader(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
         */

    }
}
