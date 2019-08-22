package concurrentprogramming.InterruptRelated;

import java.util.concurrent.TimeUnit;

public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("i'm be interrupted");
                }
            }
        },"myThread");
        thread.start();

       // TimeUnit.SECONDS.sleep(5);
        thread.interrupt();
        System.out.println( thread.isInterrupted());;
       // thread.interrupt();

    }
}
