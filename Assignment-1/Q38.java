class Recipe {
    String dish;
    int minutes;

    Recipe(String dish,int minutes){
        this.dish = dish;
        this.minutes = minutes;
    }

    Recipe(Recipe old){
        this.dish = old.dish;
        this.minutes = old.minutes;
    }

    public void show(){
        System.out.println("Dish:"+ dish+ " Time:"+ minutes+ " minutes");
    }
}

public class Q38 {
    public static void main(String args[]){
        Recipe r1 = new Recipe("Poha", 15);
        Recipe r2 = new Recipe(r1);

        r1.show();
        r2.show();

        r2.dish = "Upma";
        r2.minutes = 20;

        System.out.println("After changing the copy:");
        r1.show();
        r2.show();
    }
}
