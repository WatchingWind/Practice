package newCode.stack;

import java.util.Stack;

public class Solution {
    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();


    public void push(int node) {
        if(stack2.size() == 0){
            stack2.push(node);
        }else{
            if(stack2.peek() > node){
                stack2.push(node);
            }else{
                stack2.push(stack2.peek());
            }
        }
        stack1.push(node);
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
