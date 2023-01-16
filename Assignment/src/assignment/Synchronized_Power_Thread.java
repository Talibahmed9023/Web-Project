package assignment;

public class Synchronized_Power_Thread extends Thread {

    private int roll_no;
    Synchronized_Power power;

    public Synchronized_Power_Thread(Synchronized_Power power, int roll_no) {
        this.power = power;
        this.roll_no = roll_no;
    }

    @Override
    public void run() {
        power.power(roll_no);
    }

}
