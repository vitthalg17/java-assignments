class OxygenStore {
    private int cylinders = 50;
    private Object lock = new Object();

    public void issue(String ward, int count) {
        System.out.println(ward + " reached the store for " + count + " cylinder(s)");

        synchronized (lock) {
            if (count <= cylinders) {
                int updated = cylinders - count;
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    System.out.println("Issue interrupted");
                }
                cylinders = updated;
                System.out.println(ward + " took " + count + " cylinder(s). Stock now " + cylinders);
            }
            else {
                System.out.println(ward + " could not be served, stock is only " + cylinders);
            }
        }

        System.out.println(ward + " is going back to its floor");
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Ward extends Thread {
    private OxygenStore store;
    private int count;

    Ward(String name, OxygenStore store, int count) {
        super(name);
        this.store = store;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            store.issue(getName(), count);
        }
    }
}

public class Q08 {
    public static void main(String[] args) throws InterruptedException {
        OxygenStore store = new OxygenStore();

        Ward icu = new Ward("ICU", store, 3);
        Ward emergency = new Ward("Emergency", store, 2);
        Ward surgery = new Ward("Surgery", store, 4);

        icu.start();
        emergency.start();
        surgery.start();

        icu.join();
        emergency.join();
        surgery.join();

        System.out.println("-------------------------");
        System.out.println("Closing stock: " + store.getCylinders());
        System.out.println("Expected stock: " + (50 - 45));
    }
}
