package helloworld.JVM;

/**
 * Created by song on 2018/6/25.
 */
public class DeadLock {
    /**
     * 线程死锁等待演示
     */
    static class SynAddRunalbe implements Runnable {
        int a, b;
        public SynAddRunalbe(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        int  a= 1;
        int b= 2;
        for (int i = 0; i < 1000; i++) {
            new Thread(new SynAddRunalbe(a, b)).start();
            new Thread(new SynAddRunalbe(b , a)).start();
        }
    }


}
