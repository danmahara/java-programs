
package Assignment_07;
public class ThreadPriorityDemo_04 {
    public static void main(String[] args) {
        // Create three threads with different priorities
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3. start();
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
