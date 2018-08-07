package Stacks;

import java.util.Stack;

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int opA = 0;
        int opB = 0;
        for(String s : tokens) {
            if(s.equals("+")) {
                opB = stack.pop();
                opA = stack.pop();
                result = opA + opB;
                stack.push(result);
            } else if(s.equals("-")) {
                opB = stack.pop();
                opA = stack.pop();
                result = opA - opB;
                stack.push(result);
            } else if(s.equals("*")) {
                opB = stack.pop();
                opA = stack.pop();
                result = opA * opB;
                stack.push(result);
            } else if(s.equals("/")) {
                opB = stack.pop();
                opA = stack.pop();
                result = opA / opB;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
