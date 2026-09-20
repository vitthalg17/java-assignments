class OvenTimer extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Baking time left: " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
        System.out.println("Cake is ready, take it out!");
    }
}

class ClockHand extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Tick...");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Clock interrupted");
            }
        }
    }
}

public class Q04 {
    public static void main(String[] args) {
        OvenTimer timer = new OvenTimer();
        ClockHand clock = new ClockHand();

        timer.start();
        clock.start();
    }
}
