package Basics.Array;

public class _4_Linear_search {
    // creating a function
    public static int Linearsearch(int[] number, int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // Linear search: finding the index of element in a given array
        int [] number = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = Linearsearch(number, key);
        if(index==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Your key at index: "+ index);
        }
    }
}
