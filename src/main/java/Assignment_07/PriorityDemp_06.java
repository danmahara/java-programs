package Assignment_07;

class PriorityThread extends Thread {

    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " -Priority: " + getPriority() + " -count");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PriorityDemp_06 {

    public static void main(String[] args) {
        PriorityThread hpThread = new PriorityThread("High Priority Thread", Thread.MAX_PRIORITY);
        PriorityThread lpThread = new PriorityThread("Low Priority Thread", Thread.MIN_PRIORITY);
         hpThread.start();
        lpThread.start();

    }
}
