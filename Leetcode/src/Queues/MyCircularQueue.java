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

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            front = 0;
        }
        rear = (rear + 1) % size;
        data[rear] = value;
        return true;
    }


}
