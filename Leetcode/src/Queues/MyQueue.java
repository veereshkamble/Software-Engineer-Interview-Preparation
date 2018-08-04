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
}
