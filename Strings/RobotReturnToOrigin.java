package Strings;

// https://leetcode.com/problems/robot-return-to-origin/description/

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String str = "LL";
        System.out.println(robotReturnToOrigin(str));

    }

    static boolean robotReturnToOrigin(String str){
        int right = 0,down = 0;

        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)) {
                case 'R':
                    right++;
                    break;
                case 'D' :
                    down++;
                    break;
                case 'U' :
                    down--;
                    break;
                case 'L' :
                    right--;
                    break;
            }
        }
        
        if (right == 0 && down == 0) {
            return true;
        }
        
        return false;
    }
}
