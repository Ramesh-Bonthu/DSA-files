package BitWise;

public class NumberComplement {
  public static void main(String[] args) {
    int n = 2147483647;
    System.out.println(numberComplement(n));
  }

  static int numberComplement(int n){
    int bits = (int)(Math.log(n)/Math.log(2)) + 1;

    System.out.println(bits);

    int mask =(1 << bits) - 1;
    System.out.println(mask);

    int result = n ^ mask;
    
    return result;
  }
}
