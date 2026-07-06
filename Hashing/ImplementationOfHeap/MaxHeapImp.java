package Hashing.ImplementationOfHeap;

import java.util.ArrayList;

public class MaxHeapImp {

    ArrayList<Integer> maxHeap;

    public MaxHeapImp(){
        maxHeap = new ArrayList<>();
    }
    public static void main(String[] args) {
        MaxHeapImp obj = new MaxHeapImp();
        
        obj.push(3);
        obj.push(7);

        System.out.println(obj.peek());
        obj.push(2);
        System.out.println(obj.peek());

    }

    public void push(int x) {
        // Insert x into the heap

        if (maxHeap.size() == 0) {
            maxHeap.add(x);
        }else if(maxHeap.get(maxHeap.size() - 1) >= x){
            maxHeap.add(maxHeap.size(), x);
        }else{
            int left = 0;
            int right = maxHeap.size() - 1;

            int ans = 0;

            while (left <= right) {
                int mid = left + (right - left)/2;

                if (maxHeap.get(mid) <= x) {
                    ans = mid;
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }

            maxHeap.add(ans, x);
        }
        System.out.println(maxHeap);
    }

    public void pop() {
        // Remove the top (minimum) element

        maxHeap.remove(0);
    }

    public int peek() {
        // Return the top element or -1 if empty
        if (maxHeap.isEmpty()) {
            return -1;
        }

        return maxHeap.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return maxHeap.size();
    }
    
}
