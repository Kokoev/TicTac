import static java.lang.Thread.sleep;

/**
 * Created by sovarugby on 05.11.16.
 */
public class FiveSec extends Main implements Runnable {
    public FiveSec(Object key) {
        this.key = key;
    }

    public void run() {
        while (true) {
            int counter = Main.counter;
            synchronized (key) {
                try {
                    if ((counter % 5 == 0)&&(counter!=0)) {
                        System.out.println("5-ая секунд");
                    }
                    key.wait();

                } catch (InterruptedException e) {
                }
            }
        }
    }
}
