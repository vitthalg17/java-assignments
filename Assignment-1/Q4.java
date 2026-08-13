class Bill {
    public int total(int price){
        return price;
    }

    public int total(int price,int quantity){
        return price*quantity;
    }

    public int total(int price,int quantity,int delivery){
        return (price*quantity)+delivery;
    }

    public void show(int amount){
        System.out.println("Amount to pay:"+ amount);
    }
}

class DiscountBill extends Bill {
    public void show(int amount){
        System.out.println("Amount after 10% discount:"+ (amount-(amount/10)));
    }
}

public class Q4 {
    public static void main(String args[]){
        Bill b = new Bill();

        System.out.println("Total of 1 item:"+ b.total(100));
        System.out.println("Total of 3 items:"+ b.total(100, 3));
        System.out.println("Total with delivery:"+ b.total(100, 3, 40));

        Bill normal = new Bill();
        Bill offer = new DiscountBill();

        normal.show(500);
        offer.show(500);
    }
}
