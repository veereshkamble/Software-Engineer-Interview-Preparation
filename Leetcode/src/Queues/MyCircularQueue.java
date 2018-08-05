package Queues;

public class MyCircularQueue {

    int[] data;
    int front;
    int rear;
    int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }

}
