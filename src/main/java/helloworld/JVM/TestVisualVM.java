package helloworld.JVM;


public class TestVisualVM {
    ThreadLock threadLock1 = new ThreadLock();
    static  ThreadLock threadLock2 = new ThreadLock();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        ThreadLock threadLock3 = new ThreadLock();

        Thread.sleep(600000);
    }
}
