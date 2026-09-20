import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class StuckRobot extends Thread {
    ReentrantLock first;
    ReentrantLock second;

    StuckRobot(String name, ReentrantLock first, ReentrantLock second) {
        super(name);
        this.first = first;
        this.second = second;
    }

    public void run() {
        first.lock();
        System.out.println(getName() + " locked its first arm");

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }

        System.out.println(getName() + " is waiting for the other arm");
        second.lock();

        System.out.println(getName() + " locked both arms");
        second.unlock();
        first.unlock();
    }
}

class PoliteRobot extends Thread {
    ReentrantLock first;
    ReentrantLock second;
    int waitTime;

    PoliteRobot(String name, ReentrantLock first, ReentrantLock second, int waitTime) {
        super(name);
        this.first = first;
        this.second = second;
        this.waitTime = waitTime;
    }

    public void run() {
        try {
            if (first.tryLock(waitTime, TimeUnit.MILLISECONDS)) {
                System.out.println(getName() + " locked its first arm");
                Thread.sleep(300);

                if (second.tryLock(waitTime, TimeUnit.MILLISECONDS)) {
                    System.out.println(getName() + " locked both arms and finished the weld");
                    second.unlock();
                }
                else {
                    System.out.println(getName() + " waited " + waitTime + " ms, did not get the other arm, so it left");
                }

                first.unlock();
            }
            else {
                System.out.println(getName() + " could not get even the first arm");
            }
        }
        catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }
    }
}

public class Q14 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        System.out.println("PART 1 : both robots take the two locks in opposite order");

        StuckRobot r1 = new StuckRobot("Robot-A", lock1, lock2);
        StuckRobot r2 = new StuckRobot("Robot-B", lock2, lock1);

        r1.setDaemon(true);
        r2.setDaemon(true);

        r1.start();
        r2.start();

        Thread.sleep(2000);
        System.out.println("Both robots are stuck forever, this is a deadlock");

        System.out.println("-------------------------");
        System.out.println("PART 2 : same opposite order, but now with tryLock and a timeout");

        ReentrantLock lock3 = new ReentrantLock();
        ReentrantLock lock4 = new ReentrantLock();

        PoliteRobot r3 = new PoliteRobot("Robot-C", lock3, lock4, 500);
        PoliteRobot r4 = new PoliteRobot("Robot-D", lock4, lock3, 2000);

        r3.start();
        r4.start();

        r3.join();
        r4.join();

        System.out.println("No deadlock this time because tryLock gives up after the timeout");
    }
}
