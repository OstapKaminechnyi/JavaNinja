package multithreading2;

public class Count extends Thread {
    Count() {
        super("extending thread");
        System.out.println("thread created" + this);
        start();

    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");

        }
        System.out.println("run is over");
    }
}
