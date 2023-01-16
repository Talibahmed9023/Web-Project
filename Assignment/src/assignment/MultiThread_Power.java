package assignment;

public class MultiThread_Power extends Thread {

    private int roll_no = 0;

    public MultiThread_Power(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                int power = (int) Math.pow(roll_no, i);
                System.out.println(roll_no + "^" + i + " = " + power);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}
