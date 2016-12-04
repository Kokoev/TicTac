/**
 * Created by sovarugby on 06.11.16.
 */
public class Main {
    public static Object key;
    public static int counter = 0;

    public static void main(String[] args) {
        key = new Object();
        Thread t = new Thread(new TicTac(key));
        Thread f = new Thread(new FiveSec(key));
        Thread s = new Thread(new SevenSec(key));
        t.start();
        f.start();
        s.start();
    }
}
