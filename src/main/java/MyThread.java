import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private final Logger logger = Logger.getLogger(MyThread.class);
    private final Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < Counter.MAX_NUMBER) {
            counter.incrementCounter();
            logger.info("Extends Thread:" + Thread.currentThread().getName() + " value = "
                    + counter.getValue());
        }
    }
}
