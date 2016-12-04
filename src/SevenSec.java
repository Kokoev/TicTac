/**
 * Created by sovarugby on 06.11.16.
 */
public class SevenSec extends Main implements Runnable {
    public SevenSec(Object key){
        this.key = key;
    }

    public void run() {
        while(true){
            int counter = Main.counter;
            if ((counter % 7 == 0) && (counter != 0)) {
                System.out.println("7-ая секунд");
            }
            synchronized (key) {
                try {

                    key.wait();


                } catch (InterruptedException e) {
                }
            }
        }
    }
}
