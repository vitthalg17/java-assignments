class ReverseSpeller implements Runnable {
    private String word;

    ReverseSpeller(String word) {
        this.word = word;
    }

    public void run() {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println("Spelling stopped in between");
            }
        }
        System.out.println("Spelt " + word + " backwards");
    }
}

public class Q02 {
    public static void main(String[] args) {
        Thread t = new Thread(new ReverseSpeller("MULTITHREADING"));
        t.start();
    }
}
