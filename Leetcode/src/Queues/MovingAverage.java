package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private double previosSum = 0.0;
    private int maxSixe;
    private Queue<Integer> queue;

    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        maxSixe = size;
    }

    public double next(int val) {
        if(queue.size() == maxSixe) {
            previosSum -= queue.remove();
        }

        previosSum += val;
        queue.add(val);
        return previosSum / queue.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}
