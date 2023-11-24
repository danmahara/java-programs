
package Assignment_07;

class MyRunnable implements Runnable{
 @Override
 public void run(){
    for(int i=1;i<=10;i++){
        System.out.println("Dan Mahara"); 
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  
} 


public class RunnableDemo_02 {
    public static void main(String[] args) {
        Thread th =new Thread(new MyRunnable());
        th.start();
    }
}
