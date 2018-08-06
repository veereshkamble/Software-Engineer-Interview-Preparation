package Stacks;

import java.util.Stack;

public class MinStack {
    int min;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if(x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);

    }

    public void pop() {
        if(stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {

    }

    public int getMin() {

    }
}
