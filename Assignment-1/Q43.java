class Payment {
    int amount;

    Payment(int amount){
        this.amount = amount;
    }

    public void pay(){
        System.out.println("Paying "+ amount+ " rupees");
    }
}

class CardPayment extends Payment {
    CardPayment(int amount){
        super(amount);
    }

    public void pay(){
        super.pay();
        System.out.println("Paid using a Debit Card with 20 rupees extra charge");
        System.out.println("Final Amount:"+ (amount+20));
    }
}

public class Q43 {
    public static void main(String args[]){
        Payment p = new Payment(500);
        p.pay();

        System.out.println("-------------------------");

        CardPayment cp = new CardPayment(500);
        cp.pay();
    }
}
