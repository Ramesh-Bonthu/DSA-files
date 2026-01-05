package Recursion;

public class Geek_oncci {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        System.out.println(geek_oncci(a, b, c, 6, 4));
        
    }
    static int geek_oncci(int a, int b, int c,int n,int count){
        if (count == n) {
            return a+b+c;
        }
        return geek_oncci(b, c, a+b+c, n, ++count);
    }
}
