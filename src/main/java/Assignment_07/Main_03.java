package Assignment_07;

class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("GoodBye, World");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main_03 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
