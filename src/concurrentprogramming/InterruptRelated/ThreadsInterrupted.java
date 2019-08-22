package concurrentprogramming.InterruptRelated;

import java.util.concurrent.TimeUnit;

public class ThreadsInterrupted {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("I'm be interrupted !");
                }
            }
        },"ThreadInterrupted");

        t1.start();
        //Interrupted 测试
        t1.interrupt();

        /**
         * 没有在主线程加sleep时，由于并未直接切换到t1线程，也即未执行sleep函数从而使得t1的标志被更改，因而会得到 true结果:
         * 执行结果如下：也可以看出 判断语句是在 sleep语句前执行的
         *  true
         * I'm be interrupted !
         */

        /**
         * 在线程加上 sleep语句，强制使得主线程放弃cpu
         * 执行结果如下： 可以看出 在执行 sleep这个可中断方法后，当捕获到 中断信号后，会抛出异常并擦除中断标志。
         *I'm be interrupted !
         * false
         */
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isInterrupted());


        System.out.println("======================================在没有执行可中断方法前 打断线程=======================");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().interrupt();
                    Thread.currentThread().interrupt();
                    System.out.println("Current Thread is Interrupted ? " + Thread.currentThread().isInterrupted());
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("I'm be interrupted !" );
                }
            }
        });
        t2.start();


    }
}
