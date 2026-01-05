package BitWise;

public class SingleNumber2 {
    public static void main(String[] args) {
      int[] nums = {2,2,3,2};
      //System.out.println((3 & (1 << 1)));
      System.out.println(singleNumber(nums)); 
    }

    static int singleNumber(int[] nums) {
      int result = 0;

      for(int i = 0; i < 32; i++){
        int count = 0;

        for(int n : nums){
          if ((n & (1 << i)) != 0) {
            count++;
          }
        }

        if (count % 3 != 0) {
          result |= (1 << i);
        }
      }

      return result;    
    }
}
