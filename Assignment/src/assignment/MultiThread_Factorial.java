package assignment;

public class MultiThread_Factorial extends Thread {

    private int roll_no = 0;

    public MultiThread_Factorial(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public void run() {
        try {
            int table;
            for (int i = 4; i >= 1; i--) {
                table = roll_no;
                roll_no *= i;
                System.out.println(table + " X " + i + " = " + roll_no);
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}
