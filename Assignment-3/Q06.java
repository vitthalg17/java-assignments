class AutoSave extends Thread {
    public void run() {
        while (true) {
            System.out.println("Auto-Save in progress...");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                System.out.println("Auto-Save interrupted");
            }
        }
    }
}

public class Q06 {
    public static void main(String[] args) {
        AutoSave saver = new AutoSave();
        saver.setDaemon(true);
        saver.start();

        String[] pages = {"cover.txt", "chapter1.txt", "chapter2.txt", "chapter3.txt", "index.txt"};

        for (int i = 0; i < pages.length; i++) {
            System.out.println("Main thread is formatting " + pages[i]);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Formatting interrupted");
            }
        }

        System.out.println("All pages formatted, main thread is done");
        System.out.println("Daemon thread stops along with the main thread");
    }
}
