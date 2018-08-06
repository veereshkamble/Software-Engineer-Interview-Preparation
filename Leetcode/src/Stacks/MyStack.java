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
}
