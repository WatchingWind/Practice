package newCode;

import java.util.Stack;

public class Solution_StackAndQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        int size = stack2.size();
        for(int i = 0;i < size;i++ ) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        int size = stack1.size();
        for(int i = 0; i < size; i++ ) {

            System.out.println(stack1.peek());
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Solution_StackAndQueue s = new Solution_StackAndQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
