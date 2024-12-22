package Basics.Array;
import java.util.*;
public class _8_multidim_array {
    public static void main(String[] args) {
        // creating two-dimensional array
        Scanner input = new Scanner(System.in);
        int[][] grid = {
                {1,2,3,4,5},
                {3,2,1,4,2},
                {5,4,3,2,1}
        };
        System.out.println(grid[0][1]);
        String[][] texts = new String[2][2];
        texts[0][1] = "hello tests";
        System.out.println(texts[0][1]);
        System.out.println(texts[0][0]);
        for(int i = 0; i<texts.length; i++){
            for(int j  = 0; j<texts[i].length; j++){
                System.out.println(texts[i][j]+'\t');
            }
        }


    }
}
