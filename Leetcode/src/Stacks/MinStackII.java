package Stacks;
import java.util.*;

public class MinStackII {

    // stack: store the stack numbers
    private Stack<Integer> stack = new Stack<Integer>();
    // minStack: store the current min values
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x) {
        // store current min value into minStack
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        // use equals to compare the value of two object, if equal, pop both of them
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStackII minStack = new MinStackII();
        minStack.push(5);
        minStack.push(4);
        minStack.push(6);
        minStack.push(3);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
    }
}
