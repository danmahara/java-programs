package Assignment_07;

import java.util.Scanner;

class SumThread extends Thread {

    private int a, b;

    public SumThread(int a, int b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public void run() {
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
}

class EvenOddThread extends Thread {

    private int num1, num2;

    public EvenOddThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        String resultA = (num1 % 2 == 0) ? " is even " : " is odd";
        String resultB = (num2 % 2 == 0) ? " is even " : " is odd";
        System.out.println(num1 + " " + resultA);
        System.out.println(num2 + " " + resultB);
    }
}

class UserInputsThread extends Thread {

    private int a, b;

    public UserInputsThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("First number is " + a);
        System.out.println("Second number is " + b);
    }
}

public class MultithreadingDemo_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer");
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumThread sumThread = new SumThread(a, b);
        EvenOddThread evenOddThread = new EvenOddThread(a, b); //result call in constructor
        UserInputsThread uiThread = new UserInputsThread(a, b);

        sumThread.start();
        evenOddThread.start();
        uiThread.start();

        try {
            sumThread.join();
            evenOddThread.join();
            uiThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        

    }

}
