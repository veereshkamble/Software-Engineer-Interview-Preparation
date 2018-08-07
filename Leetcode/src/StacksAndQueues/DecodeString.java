package StacksAndQueues;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<String> charStack = new Stack<String>();
        charStack.push("");
        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9') {
                int start = i;
                while(s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') {
                    i++;
                }
                numStack.push(Integer.parseInt(s.substring(start, i+1)));
            } else if(ch == '[') {
                charStack.push("");
            } else if(ch == ']') {
                String str = charStack.pop();
                int times = numStack.pop();
                StringBuilder sb = new StringBuilder();

                for(int j = 0; j < times; j++) {
                    sb.append(str);
                }
                charStack.push(charStack.pop() + sb.toString());
            } else {
                charStack.push(charStack.pop() + ch);
            }
            i = i + 1;
        }
        return charStack.pop();
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("3[a]2[bc]"));
    }
}
