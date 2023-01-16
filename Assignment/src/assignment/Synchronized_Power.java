package assignment;

public class Synchronized_Power {
    
    synchronized void power(int roll_no) {
        try {
            for (int i = 1; i <= 5; i++) {
                int power = (int) Math.pow(roll_no, i);
                System.out.println(roll_no + "^" + i + " = " + power);
            }
        } catch (Exception e) {
        }
    }
}
