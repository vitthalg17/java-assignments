class Beeper extends Thread {
    private String label;
    private int gap;
    private int times;

    Beeper(String label, int gap, int times) {
        this.label = label;
        this.gap = gap;
        this.times = times;
    }

    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(label);
            try {
                Thread.sleep(gap);
            }
            catch (InterruptedException e) {
                System.out.println(label + " was interrupted");
            }
        }
    }
}

public class Q03 {
    public static void main(String[] args) {
        Beeper first = new Beeper("Thread 1", 1000, 10);
        Beeper second = new Beeper("Thread 2", 2000, 5);

        first.start();
        second.start();
    }
}
