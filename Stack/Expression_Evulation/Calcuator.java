package Stack.Expression_Evulation;

public class Calcuator {
    public static void main(String[] args) {
        
    }
    public static void utility(int a, int b, int opr) {
    
    String ans = " ";
    if(opr == 1){
        ans = String.valueOf(a + b);
    }else if(opr == 2){
        ans = String.valueOf(b - a);
    }else if(opr == 3){
        ans = String.valueOf(a * b);
    }else{
        ans = "Invalid Input";
    }
    
    System.out.print(ans);
}
}
