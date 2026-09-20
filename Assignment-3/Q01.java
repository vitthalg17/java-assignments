class EvenPrinter extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println("Locker number " + i + " is free");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Scan stopped in between");
            }
        }
        System.out.println("Locker scan finished");
    }
}

public class Q01 {
    public static void main(String[] args) {
        EvenPrinter scanner = new EvenPrinter();
        scanner.start();
    }
}
