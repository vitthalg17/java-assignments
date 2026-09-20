class Chopstick {
    private String name;

    Chopstick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Philosopher extends Thread {
    private Chopstick first;
    private Chopstick second;

    Philosopher(String name, Chopstick first, Chopstick second) {
        super(name);
        this.first = first;
        this.second = second;
    }

    public void run() {
        System.out.println(getName() + " is thinking");

        synchronized (first) {
            System.out.println(getName() + " picked up " + first.getName());

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted");
            }

            System.out.println(getName() + " is waiting for " + second.getName());

            synchronized (second) {
                System.out.println(getName() + " picked up " + second.getName() + " and is eating");
            }
        }
    }
}

public class Q09 {
    public static void main(String[] args) throws InterruptedException {
        Chopstick left = new Chopstick("Left Chopstick");
        Chopstick right = new Chopstick("Right Chopstick");

        Philosopher socrates = new Philosopher("Socrates", left, right);
        Philosopher chanakya = new Philosopher("Chanakya", right, left);

        socrates.setDaemon(true);
        chanakya.setDaemon(true);

        socrates.start();
        chanakya.start();

        Thread.sleep(3000);

        System.out.println("-------------------------");
        System.out.println("Both philosophers are holding one chopstick and waiting for the other one");
        System.out.println("This is a deadlock, neither of them can ever eat");
        System.out.println("Main thread is ending, the daemon philosophers end with it");
    }
}
