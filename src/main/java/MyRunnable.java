import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private final Logger logger = Logger.getLogger(MyThread.class);
    private final Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() < 100) {
            counter.incrementCounter();
            logger.info("Runnable Thread:" + Thread.currentThread().getName() + " value = "
                    + counter.getValue());
        }
    }
}
