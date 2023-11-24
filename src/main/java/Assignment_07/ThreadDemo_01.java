package Assignment_07;

class A extends Thread {
@Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dan Mahara");
        }
    }
}

public class ThreadDemo_01 {

    public static void main(String[] args) {
     A thread=   new A();
      thread.start();  
    }
}
