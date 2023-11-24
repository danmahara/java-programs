
package Assignment_07;
import java.util.LinkedList;
import java.util.Queue;

class DataBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public DataBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int data) throws InterruptedException {
        while (buffer.size() == capacity) {
            // Buffer is full, wait for the consumer to free up some space
            wait();
        }

        buffer.add(data);
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that data is available
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            // Buffer is empty, wait for the producer to produce some data
            wait();
        }

        int data = buffer.poll(); // it removes and returns the element at the front of the queuez
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer that space is available
        return data;
    }
} 

public class ProducerConsumer_09 {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBuffer(5);

         Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(100); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int data = buffer.consume();
                    Thread.sleep(200); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
