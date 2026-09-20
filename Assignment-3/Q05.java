class Worker extends Thread {
    Worker(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (priority " + getPriority() + ") is sorting parcel " + i);
        }
        System.out.println(getName() + " has cleared its counter");
    }
}

public class Q05 {
    public static void main(String[] args) {
        Worker w1 = new Worker("Worker-1");
        Worker w2 = new Worker("Worker-2");
        Worker w3 = new Worker("Worker-3");

        w1.setPriority(Thread.MIN_PRIORITY);
        w2.setPriority(Thread.NORM_PRIORITY);
        w3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Main thread is " + Thread.currentThread().getName());
        System.out.println("-------------------------");

        w3.start();
        w2.start();
        w1.start();
    }
}
