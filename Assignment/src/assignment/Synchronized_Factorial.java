package assignment;

public class Synchronized_Factorial{

    synchronized void Factoiral(int roll_no) {
        try {
            int table;
            for (int i = 4; i >= 1; i--) {
                table = roll_no;
                roll_no *= i;
                System.out.println(table + " X " + i + " = " + roll_no);
            }
        } catch (Exception e) {

        }
    }
}
