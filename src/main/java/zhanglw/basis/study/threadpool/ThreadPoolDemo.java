package zhanglw.basis.study.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhanglw on 2017/3/25.
 * JDK ThreadPool
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        testNewCachedThreadPool();
//        testNewFixedThreadPool();
//        testNewScheduledThreadPool();
//        testnewSingleThreadPoolExecutor();
    }

    public static void testNewCachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            final int index = i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println(index);
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cachedThreadPool.shutdown();
    }

    public static void testNewFixedThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 30; i++) {
            final int index = i;
            executorService.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                    System.out.println();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        executorService.shutdown();
    }

    public static void testNewScheduledThreadPool() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("333");
            }
        }, 3, TimeUnit.SECONDS);
        // 延迟1s 每隔3s
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Delay 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();
    }

    public static void testnewSingleThreadPoolExecutor() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


}
