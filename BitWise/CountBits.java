package BitWise;

public class CountBits {
  public static void main(String[] args) {
    int n = 12;
    System.out.println(countBits(n));
  }

  static int[] countBits(int n){
    int[] ans = new int[n+1];

    for(int i = 0; i <= n; i++){
      int count = 0;
      if (i == 0 ) {
        ans[i] = 0;
      }else{
        int m = i;
        while (m > 0) {
          count++;
          m = m - (m & (-m)); 
        }
        ans[i] = count;
      }
    }

    for(int i : ans){
      System.out.print( i + " ");
    }

    return ans;
  }
}
