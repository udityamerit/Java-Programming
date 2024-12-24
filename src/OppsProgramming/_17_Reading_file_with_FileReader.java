package OppsProgramming;

import java.io.*;

public class _17_Reading_file_with_FileReader {
    public static void main(String[] args) {
        File file = new File( "C:\\Users\\Uditya\\Desktop\\hello.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nto found: "+ file.toString());

        } catch (IOException e) {
            System.out.println("Unable to read file: "+ file.toString());

        }
    }
}
