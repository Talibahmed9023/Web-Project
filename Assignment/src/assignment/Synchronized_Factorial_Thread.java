package assignment;

public class Synchronized_Factorial_Thread extends Thread {

    private int roll_no;
    Synchronized_Factorial factorial;

    public Synchronized_Factorial_Thread(Synchronized_Factorial factorial, int roll_no) {
        this.factorial = factorial;
        this.roll_no = roll_no;
    }

    @Override
    public void run() {
        factorial.Factoiral(roll_no);
    }
}
