package concurrentprogramming.InterruptRelated;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    TimeUnit.MINUTES.sleep(2);
                    TimeUnit.SECONDS.sleep(3);
                    TimeUnit.HOURS.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("I'm coming!");
                System.out.println(Thread.currentThread().getName());

            }
        },"myThread");
        t.start();


    }
}
