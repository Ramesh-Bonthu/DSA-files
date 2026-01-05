package Math;

import java.util.ArrayList;

public class IthKFactorOfNumber {
    public static void main(String[] args) {
        int n = 4;
        int k = 4;
        System.out.println(ithKFactorOfNumber(n, k));
    }
    static int ithKFactorOfNumber(int n,int k){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if (n%i == 0) {
                arr1.add(i);
                if (n / i != i) {
                 arr2.add(n/i);
                }   
            }
                
        }
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        for(int i = arr2.size() - 1; i >= 0; i--){
            arr1.add(arr2.get(i));
        } 
        System.out.println(arr1.toString());

        if (k > arr1.size()) {
            return -1;
        }
        return arr1.get(k-1);
        
    }
}
