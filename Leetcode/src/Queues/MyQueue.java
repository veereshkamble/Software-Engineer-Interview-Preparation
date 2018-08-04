package Queues;
import  java.util.*;

public class MyQueue {

    //store elements
    private List<Integer> data;

    //a pointer to indicate the starting position
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    //insert an element into the queue. Return true if the operation is successfull
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    //delete an element from the queue. Return true if the operation is successfull
    public boolean deQueue() {
        if(isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    
}
