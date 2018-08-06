package Stacks;

import java.util.Stack;

public class StackUsage {

    public static void main(String[] args) {
        //1. Initialize a stack
        Stack<Integer> stack = new Stack<>();

        //2. Push new element
        stack.push(7);
        stack.push(10);
        stack.push(11);
        stack.push(14);
        stack.push(19);

        //3.check if the stack is empty
        if(stack.isEmpty() == true) {
            System.out.println("Stack is empty");
        }

        //4. pop an element from the stack
        stack.pop();

        //5. get the top element
        System.out.println("The top element is  :" + stack.peek());

        //6. get the stack size
        System.out.println("The size of the stack is: " + stack.size());
    }
}
