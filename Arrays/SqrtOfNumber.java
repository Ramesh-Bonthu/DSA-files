package Arrays;
// https://leetcode.com/problems/sqrtx/submissions/1859343224/

public class SqrtOfNumber{
 public static void main(String[] args) {
    int n = 8; 
    int p = 1;
    System.out.println(sqrt(n,p));
 }
 static int sqrt(int n,int p){
    double x = n;
    double root = 0;

    if(n == 0){
        return 0;
    }

    while(true){
        root = 0.5 * (x + (n/x));

        if(Math.abs(root - x) < 0.5){
            break;
        }

        x = root;
    }

    return (int)(root);
 }
}