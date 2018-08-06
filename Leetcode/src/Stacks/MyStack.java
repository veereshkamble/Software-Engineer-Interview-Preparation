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

    
}
