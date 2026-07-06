package Training.Day_06;

public class FindingProfession {
    public static void main(String[] args) {
        int level = 4;
        int pos = 2;
        System.out.println(profession(level, pos));
    }
    public static char profession(int level, int pos) {
        if(level == 1 || pos == 1){
            return 'e';
        }

        int parPos = (pos + 1)/2;

        char par = profession(level-1, parPos);

        if (pos % 2 == 1) return par;

        if(par == 'e') 
            return 'd';
        else return 'e';
        
    }
}
