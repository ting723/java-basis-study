package zhanglw.basis.study.thread;

/**
 * Created by zhanglianwei on 2017/2/3.
 * Thread
 */
public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread("t1") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread.run();
        thread.start();

        Thread thread1 = new Thread(new MyRunable(), "t2");
        thread1.start();

        Thread thread2 = new Thread("t3") {
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interruted");
                        // 跳出循环,中断该进程
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Interruted When sleep");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        thread2.start();
        thread2.interrupt();
    }


    static class MyRunable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
