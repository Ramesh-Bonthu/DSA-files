package Stack.StackBasedDesign;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    
}

class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }

        int val = second.pop();

        while (!second.empty()) {
            first.push(second.pop());
        }

        return val;
    }
    
    public int peek() {
        while(!first.empty()){
            second.push(first.pop());
        }

        int val = second.peek();

        while (!second.empty()) {
            first.push(second.pop());
        }

        return val;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}
