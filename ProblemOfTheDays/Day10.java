package ProblemOfTheDays;

public class Day10 {
    public static void main(String[] args) {
        
    }

    public double angleClock(int hour, int minutes) {
        double angle = 30 * hour - 5.5 * minutes;
        
        if (angle > 180) {
            return 360 - angle;
        }

        return Math.abs(angle);
    }
}
