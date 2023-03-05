import java.sql.Time;
import java.time.LocalTime;

public class FiveSecondsPassed {
    public static void timer() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LocalTime.now());
            }
        });
        Thread thread2 = new Thread(() -> {
            long time = System.currentTimeMillis();
            while (true) {
                if (System.currentTimeMillis() - time == 5000) {
                    System.out.println("Пройшло 5 секунд");
                    time = System.currentTimeMillis();
                }
            }
        });
        thread.start();
        thread2.start();
    }
}
