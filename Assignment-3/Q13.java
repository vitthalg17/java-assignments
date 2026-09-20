import java.util.concurrent.locks.ReentrantLock;

class UnsafeTurnstile {
    int count = 0;

    public void pass() {
        count++;
    }
}

class SafeTurnstile {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    public void pass() {
        lock.lock();
        count++;
        lock.unlock();
    }
}

class UnsafeRider extends Thread {
    UnsafeTurnstile gate;

    UnsafeRider(UnsafeTurnstile gate) {
        this.gate = gate;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            gate.pass();
        }
    }
}

class SafeRider extends Thread {
    SafeTurnstile gate;

    SafeRider(SafeTurnstile gate) {
        this.gate = gate;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            gate.pass();
        }
    }
}

public class Q13 {
    public static void main(String[] args) throws InterruptedException {
        UnsafeTurnstile gateA = new UnsafeTurnstile();
        SafeTurnstile gateB = new SafeTurnstile();

        UnsafeRider r1 = new UnsafeRider(gateA);
        UnsafeRider r2 = new UnsafeRider(gateA);
        SafeRider r3 = new SafeRider(gateB);
        SafeRider r4 = new SafeRider(gateB);

        r1.start();
        r2.start();
        r3.start();
        r4.start();

        r1.join();
        r2.join();
        r3.join();
        r4.join();

        System.out.println("Two threads crossed each gate 100000 times");
        System.out.println("Expected count            : 200000");
        System.out.println("Gate A without any lock   : " + gateA.count);
        System.out.println("Gate B with ReentrantLock : " + gateB.count);
    }
}
