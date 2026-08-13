interface Chargeable {
    void charge();
}

interface Portable {
    void carry();
}

class PowerBank implements Chargeable, Portable {
    String model;
    int weight;

    PowerBank(String model,int weight){
        this.model = model;
        this.weight = weight;
    }

    public void charge(){
        System.out.println(model+ " is charging your phone");
    }

    public void carry(){
        System.out.println(model+ " weighs "+ weight+ "g and is easy to carry");
    }
}

public class Q6 {
    public static void main(String args[]){
        PowerBank pb = new PowerBank("Zebronics 10000mAh", 250);

        pb.charge();
        pb.carry();
    }
}
