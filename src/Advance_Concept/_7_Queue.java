package Advance_Concept;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class _7_Queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(6);
        q1.add(180);
        q1.add(40);
        q1.add(30);
        q1.add(50);
        q1.add(0);
        q1.add(10);
        try {
            q1.add(90);
        }catch (IllegalStateException e){
            System.out.println("Tried to add many items to the queue.");
        }

        for(Integer value: q1){
            System.out.println("Queue value: "+ value);
        }
        Integer value;
        value = q1.remove();
        System.out.println("Removed from queue: "+ value);
    }
}
