public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread firstThread = new MyThread(counter);
        Thread secondThread = new Thread(new MyRunnable(counter));
        firstThread.start();
        secondThread.start();
    }
}
