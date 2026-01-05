package Math;

import java.util.ArrayList;

public class SelfDivingNumber {
    public static void main(String[] args) {
        int left = 66;
        int right = 708;
        ArrayList<Integer> li = selfDivingNumber(left, right);
        System.out.println(li);
    }
    static ArrayList<Integer> selfDivingNumber(int left,int right){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int num = i;
            if(num % 10 != 0){
                while (num != 0) {
                    int rem = num % 10;
                    if (rem != 0) {
                            if ( i % rem == 0) {
                            num /= 10;
                        }else{
                            break;
                        }  
                    }else{
                        break;
                    }
                }
                if (num == 0) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
