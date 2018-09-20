package Trees;

import java.util.Stack;

public class ZigZagLevelOrderTraversalTwoStacks {

    // Java implementation of a O(n) time
    // method for Zigzag order traversal
        // function to print the
        // zigzag traversal
        void printZigZagTraversal(Node rootNode) {

            // if null then return
            if (rootNode == null) {
                return;
            }

            // declare two stacks
            Stack<Node> currentLevel = new Stack<>();
            Stack<Node> nextLevel = new Stack<>();

            // push the root
            currentLevel.push(rootNode);
            boolean leftToRight = true;

            // check if stack is empty
            while (!currentLevel.isEmpty()) {

                // pop out of stack
                Node node = currentLevel.pop();

                // print the data in it
                System.out.print(node.data + " ");

                // store data according to current
                // order.
                if (leftToRight) {
                    if (node.left != null) {
                        nextLevel.push(node.left);
                    }

                    if (node.right != null) {
                        nextLevel.push(node.right);
                    }
                }
                else {
                    if (node.right != null) {
                        nextLevel.push(node.right);
                    }

                    if (node.left != null) {
                        nextLevel.push(node.left);
                    }
                }

                if (currentLevel.isEmpty()) {
                    leftToRight = !leftToRight;
                    Stack<Node> temp = currentLevel;
                    currentLevel = nextLevel;
                    nextLevel = temp;
                }
            }
        }
    }


