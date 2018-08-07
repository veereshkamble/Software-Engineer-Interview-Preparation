package StacksAndQueues;

import java.util.Stack;

public class QueueUsingStack {

        Stack<Integer> input;
        Stack<Integer> output;

        /** Initialize your data structure here. */
        public QueueUsingStack() {
            input = new Stack<Integer>();
            output = new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            input.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return output.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(output.isEmpty()) {
                while(!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        public static void main(String[] args) {
            QueueUsingStack queueUsingStack = new QueueUsingStack();
            queueUsingStack.push(1);
            queueUsingStack.push(2);
            System.out.println(queueUsingStack.peek());
            System.out.println(queueUsingStack.pop());
            System.out.println(queueUsingStack.peek());
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
