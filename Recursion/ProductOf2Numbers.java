package Recursion;

public class ProductOf2Numbers {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        System.out.println(productOf2Numbers(x, y));
    }

    static int productOf2Numbers(int x, int y){
        
        if (x > y) {
            return productOf2Numbers(y, x);
        }

        if (y != 0) {
            return x + productOf2Numbers(x, y-1);
        }

        return 0;
    }
}
