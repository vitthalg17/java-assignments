import java.util.Scanner;

class Wallet {
    private String owner;
    private int balance;

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }

    public void setBalance(int balance){
        if(balance<0){
            System.out.println("Balance cannot be negative, setting it to 0");
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
    }

    public int getBalance(){
        return balance;
    }
}

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Wallet w = new Wallet();

        System.out.print("Enter Owner Name:");
        w.setOwner(sc.nextLine());

        System.out.print("Enter Balance:");
        w.setBalance(sc.nextInt());

        System.out.println("Owner:"+ w.getOwner());
        System.out.println("Balance:"+ w.getBalance());

        sc.close();
    }
}
