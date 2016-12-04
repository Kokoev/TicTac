import sun.jvm.hotspot.runtime.ObjectMonitor;

import static java.lang.Thread.sleep;
import static javafx.scene.input.KeyCode.T;
import static sun.jvm.hotspot.runtime.PerfMemory.start;

/**
 * Created by sovarugby on 05.11.16.
 */
public class TicTac extends Main implements Runnable{
        public TicTac(Object key){
            this.key = key;
        }
        public void run() {

            while (true) {

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Main.counter++;

                System.out.println("TicTac: прошло " + Main.counter + " секунд");

                synchronized (key) {
                    key.notifyAll();
                }

            }
        }

}
