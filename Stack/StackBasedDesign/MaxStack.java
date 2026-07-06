package Stack.StackBasedDesign;

import java.util.Stack;

class SpecialStack {
    
    Stack<Integer> stack;
    Stack<Integer> maxStack;
    
    public SpecialStack() {
        // Define Stack
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int val) {
        // Add an element to the top of Stack
        stack.push(val);

        if (maxStack.empty() || maxStack.peek() <= val) {
            maxStack.push(val);
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if (stack.empty()) {
            return;
        }

        int val = stack.pop();

        if (val == maxStack.peek()) {
            maxStack.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return stack.isEmpty();
    }

    public int getMax() {
        // Finds minimum element of Stack
        if(maxStack.isEmpty()){
            return -1;
        }
        return maxStack.peek(); 
    }
}
