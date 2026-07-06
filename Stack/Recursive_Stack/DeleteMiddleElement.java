package Stack.Recursive_Stack;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        deleteMid(s);

    }
    public static void deleteMid(Stack<Integer> s) {
        int size = (s.size()/2) + 1;

        ArrayList<Integer> arr = new ArrayList<>();
        
        int val = 1;

        while (! s.empty()) {
            if (!(val == size)) {
                arr.add(s.pop());
            }else{
                s.pop();
            }
            val++;
        }

        for(int i = 0; i < arr.size(); i++){
            s.push(arr.get(i));
        }

        System.out.println(s);
    }
}
