package BitWise;

public class ReverseBits {
  public static void main(String[] args) {
    int num =  12;
    System.out.println(reverseBits2(num));
  }

  static int reverseBits(int num){
    StringBuilder sb = new StringBuilder();

    while (num > 0) {
      sb.append(Integer.toString( num % 2));
      num /= 2;
    }
    int length = 32 - sb.length();
    for(int i = 0; i < length; i++){
      sb.append('0');
    }
    System.out.println(sb);

    
    return Integer.parseInt(sb.toString(),2);
  }

  static int reverseBits1(int n){
    if (n == 0) return 0;
    
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result <<= 1;
        if ((n & 1) == 1) result++;
        n >>= 1;
    }
    return result;
  }


   static int reverseBits2(int n){
    
    int result = 0;

    int len = ((int) (Math.log(n)/ Math.log(2))) + 1;

    while (n > 0) {
      result <<= 1;
      if ((n & 1) == 1) result++;
      n >>= 1;
    }

    result <<= (32-len);
    return result;
  }
}
