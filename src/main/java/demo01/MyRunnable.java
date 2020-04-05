package demo01;

public class MyRunnable implements Runnable {

    private int num = 0;

    public void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println("当前线程:" + Thread.currentThread().getName() + "---num:" + num);
                num++;
            }
        }
    }
}
