package Training.Day_11;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int count = 0;
        int n = gas.length;
        int tg = 0;
        int tc = 0;
        for(int i = 0; i < n; i++){
            tg += gas[i];
            tc += cost[i];
        } 

        if(tg < tc) return -1;

        int trCost = 0;
        for(int i = 0; i < n; i++){
            trCost += (gas[i] - cost[i]);

            if (trCost < 0) {
                trCost = 0;
                count = i+1;
            }
        }
        return count;
    }
}
