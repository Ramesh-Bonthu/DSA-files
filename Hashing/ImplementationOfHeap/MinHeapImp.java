package Hashing.ImplementationOfHeap;

import java.util.ArrayList;

public class MinHeapImp {

    ArrayList<Integer> minHeap;

    public MinHeapImp(){
        minHeap = new ArrayList<>();
    }
    public static void main(String[] args) {
        MinHeapImp obj = new MinHeapImp();
        
        obj.push(3);
        obj.push(7);

        System.out.println(obj.peek());
        obj.push(2);
        System.out.println(obj.peek());

    }

    public void push(int x) {
        // Insert x into the heap

        if (minHeap.size() == 0) {
            minHeap.add(x);
        }else if(minHeap.get(0) >= x){
            minHeap.add(0, x);
        }else{
            int left = 0;
            int right = minHeap.size() - 1;

            int ans = 0;

            while (left <= right) {
                int mid = left + (right - left)/2;

                if (minHeap.get(mid) <= x) {
                    ans = mid;
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

            minHeap.add(ans + 1, x);
        }
        System.out.println(minHeap);
    }

    public void pop() {
        // Remove the top (minimum) element

        minHeap.remove(0);
    }

    public int peek() {
        // Return the top element or -1 if empty
        if (minHeap.isEmpty()) {
            return -1;
        }

        return minHeap.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return minHeap.size();
    }
}
