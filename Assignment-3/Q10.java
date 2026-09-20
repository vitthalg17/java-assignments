class TiffinCounter {
    private String tiffin;
    private boolean full = false;

    public synchronized void pack(String meal) {
        while (full) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Packing interrupted");
            }
        }

        tiffin = meal;
        full = true;
        System.out.println("Dabbawala packed : " + tiffin);
        notify();
    }

    public synchronized void deliver() {
        while (!full) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Delivery interrupted");
            }
        }

        System.out.println("Office received  : " + tiffin);
        full = false;
        notify();
    }
}

class Dabbawala extends Thread {
    private TiffinCounter counter;

    Dabbawala(TiffinCounter counter) {
        this.counter = counter;
    }

    public void run() {
        String[] meals = {"Dal Rice", "Rajma Roti", "Poha", "Idli Sambar", "Khichdi"};

        for (int i = 0; i < meals.length; i++) {
            counter.pack(meals[i]);
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                System.out.println("Dabbawala interrupted");
            }
        }
    }
}

class Office extends Thread {
    private TiffinCounter counter;

    Office(TiffinCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.deliver();
            try {
                Thread.sleep(700);
            }
            catch (InterruptedException e) {
                System.out.println("Office interrupted");
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        TiffinCounter counter = new TiffinCounter();

        Dabbawala producer = new Dabbawala(counter);
        Office consumer = new Office(counter);

        producer.start();
        consumer.start();
    }
}
