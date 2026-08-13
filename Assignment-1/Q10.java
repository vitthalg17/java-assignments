final class Password {
    String value = "abc123";

    public void show(){
        System.out.println("Password:"+ value);
    }
}

class Bus {
    final int MAX_SEATS = 40;

    final void fare(){
        System.out.println("Fare per seat:50");
    }

    public void seats(){
        System.out.println("Seats:"+ MAX_SEATS);
    }
}

class MiniBus extends Bus {
    public void seats(){
        System.out.println("Mini Bus Seats:"+ (MAX_SEATS/2));
    }
}

public class Q10 {
    public static void main(String args[]){
        Bus b = new Bus();
        b.seats();
        b.fare();

        MiniBus mb = new MiniBus();
        mb.seats();
        mb.fare();

        Password p = new Password();
        p.show();
    }
}
