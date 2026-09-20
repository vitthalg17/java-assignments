class Planetarium {
    private int seats = 5;

    public synchronized void book(String visitor, int wanted) {
        System.out.println(visitor + " is asking for " + wanted + " seat(s). Seats left: " + seats);

        if (wanted <= seats) {
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                System.out.println("Booking interrupted");
            }
            seats = seats - wanted;
            System.out.println(visitor + " booked " + wanted + " seat(s). Seats left: " + seats);
        }
        else {
            System.out.println(visitor + " could not book, only " + seats + " seat(s) available");
        }
    }
}

class Visitor extends Thread {
    private Planetarium show;
    private int wanted;

    Visitor(String name, Planetarium show, int wanted) {
        super(name);
        this.show = show;
        this.wanted = wanted;
    }

    public void run() {
        show.book(getName(), wanted);
    }
}

public class Q07 {
    public static void main(String[] args) {
        Planetarium show = new Planetarium();

        Visitor v1 = new Visitor("Ira", show, 2);
        Visitor v2 = new Visitor("Kabir", show, 2);
        Visitor v3 = new Visitor("Meher", show, 3);
        Visitor v4 = new Visitor("Zoya", show, 1);

        v1.start();
        v2.start();
        v3.start();
        v4.start();
    }
}
