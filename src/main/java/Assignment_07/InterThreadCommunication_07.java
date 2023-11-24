package Assignment_07;

import java.util.Scanner;

class Customer {

    int amount = 10000;
//    int amount;
//
    public Customer() {
//        amount = a;
    }

    synchronized void withdraw(int amount) {

        System.out.println(amount+" going to withdraw...");

        if (this.amount < amount) {

            System.out.println("Less balance; waiting for deposit...");

            try {

                wait();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        this.amount -= amount;

        System.out.println(amount + " withdraw completed...");

    }

    synchronized void deposit(int amount) {

        System.out.println("going to deposit...");

        this.amount += amount;

        System.out.println(amount + " deposit completed... ");

        notify();

    }

}

class InterThreadCommunication_07 {

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you amount");
//        int a=sc.nextInt();
        final Customer c = new Customer();
        System.out.println("Amount is " + c.amount);
//                System.out.println("Enter your amount to withdraw");
//                int amt=sc.nextInt();
        new Thread() {

            public void run() {
//                c.withdraw(amt);
                c.withdraw(15000);

            }

        }.start();

        new Thread() {

            public void run() {

                c.deposit(10000);

            }

        }.start();

    }

}
