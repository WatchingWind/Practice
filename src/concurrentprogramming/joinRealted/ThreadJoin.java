package concurrentprogramming.joinRealted;

import java.util.List;
import java.util.stream.IntStream;

public class ThreadJoin {
    public static void main(String[] args) {
       /* List<Thread> threads = IntStream.range(1,3)
                .mapToObj(ThreadJoin::create).*/
    }

    private static Thread create(int seq){
        return new Thread(()->
        {
            for(int i = 0; i < 10; i++ ) {
                System.out.println(Thread.currentThread().getName() + "#" + i );
            }
        },String.valueOf(seq)
        );
    }
}
