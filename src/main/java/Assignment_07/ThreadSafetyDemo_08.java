package Assignment_07;
class SharedResource {
    private int sharedValue = 0;

    // Synchronized method to increment the shared value
    public synchronized void increment() {
        sharedValue++;
    } 

    // Synchronized method to get the current shared value
    public synchronized int getSharedValue() {
        return sharedValue;
    }
}
  
class MyRunnable implements Runnable {
    private SharedResource sharedResource;

    public MyRunnable(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            sharedResource.increment();
        }
    }
} 

public class ThreadSafetyDemo_08 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads that increment the shared value
        Thread thread1 = new Thread(new MyRunnable(sharedResource));
        Thread thread2 = new Thread(new MyRunnable(sharedResource));

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final shared value
        System.out.println("Final Shared Value: " + sharedResource.getSharedValue());
    }
}
