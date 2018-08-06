package Stacks;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<Integer> data;

    public MyStack() {
        data = new ArrayList<>();
    }

    //Insert an element into the stack
    public void push(int x) {
        data.add(x);
    }
    //Check if the stack is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }

    //get an item from the top of the stack
    public int top() {
        return data.get(data.size() - 1);
    }

    public boolean pop() {
        if(isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
}
