package demo01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolTest01 {

    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(30);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20,
                60 * 60, TimeUnit.SECONDS, queue);
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.execute(new MyRunnable());
        }
        threadPoolExecutor.shutdown();
    }
}
