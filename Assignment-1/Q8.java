class Pizza {
    String size;
    int price;

    Pizza(){
        size = "Medium";
        price = 250;
    }

    Pizza(String size,int price){
        this.size = size;
        this.price = price;
    }

    public void show(){
        System.out.println("Size:"+ size+ " Price:"+ price);
    }
}

public class Q8 {
    public static void main(String args[]){
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("Large", 400);

        p1.show();
        p2.show();
    }
}
