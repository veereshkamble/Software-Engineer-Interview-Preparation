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

    //Get an element from the queue
    public int Front() {
        return data.get(p_start);
    }

    //check whether the queue is empty or not
    public boolean isEmpty() {
        return p_start >= data.size();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}
