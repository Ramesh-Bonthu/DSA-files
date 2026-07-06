package Training.Day_10;

public class DisJoint {
    public static void main(String[] args) {
        
    }
    static int find(int par[], int x) {
        // add code here.
        if(par[x] == x){
            return x;
        }
        return find(par,par[x]);
    }

    static void unionSet(int par[], int x, int z) {
        // add code here.
        int px = find(par,x);
        int py = find(par,z);
        
        if(px != py){
            par[px] = py;
        }
    }
}
