class PodcastDownload extends Thread {
    boolean running = true;
    int chunk = 1;

    public void stopDownload() {
        running = false;
    }

    public void run() {
        while (running) {
            System.out.println("Downloading chunk " + chunk);
            chunk++;
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }
        }
        System.out.println("Download stopped after " + (chunk - 1) + " chunk(s)");
    }
}

public class Q12 {
    public static void main(String[] args) throws InterruptedException {
        PodcastDownload download = new PodcastDownload();
        download.start();

        Thread.sleep(3000);

        System.out.println("User pressed the cancel button");
        download.stopDownload();
    }
}
