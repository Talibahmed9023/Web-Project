package assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first digit of your roll no#");
        int roll_no = sc.nextInt();

        
//        MultiThread_Factorial mtf = new MultiThread_Factorial(roll_no);
//        mtf.start();
//
//        MultiThread_Power mtp = new MultiThread_Power(roll_no);
//        mtp.start();


        Synchronized_Factorial factorial = new Synchronized_Factorial();
        Synchronized_Factorial_Thread factorial_Thread = new Synchronized_Factorial_Thread(factorial, roll_no);
        factorial_Thread.start();

        Synchronized_Power power = new Synchronized_Power();
        Synchronized_Power_Thread power_Thread = new Synchronized_Power_Thread(power, roll_no);
        power_Thread.start();
    }
}
