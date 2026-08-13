class Food {
    String name;

    Food(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+ " is a food item");
    }
}

class Dessert extends Food {
    Dessert(String name){
        super(name);
    }

    public void sweet(){
        System.out.println(name+ " is sweet");
    }
}

class IceCream extends Dessert {
    String flavour;

    IceCream(String name,String flavour){
        super(name);
        this.flavour = flavour;
    }

    public void cold(){
        System.out.println(name+ " is served cold in "+ flavour+ " flavour");
    }
}

public class Q42 {
    public static void main(String args[]){
        IceCream ic = new IceCream("Ice Cream", "Butterscotch");

        ic.eat();
        ic.sweet();
        ic.cold();
    }
}
