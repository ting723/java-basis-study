package zhanglw.basis.study.thread;

/**
 * Created by zhanglianwei on 2017/2/3.
 */
public class JoinDemo {

    private static int i = 0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            for (; i < 100000; i++) {
                if(i==50000){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread at = new AddThread();
        at.setDaemon(true);
        at.start();
//        at.join();
        System.out.println(i);
    }
}
