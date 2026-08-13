import java.util.Scanner;

class Notification {
    public void send(String msg){
        System.out.println("Sending a plain notification:"+ msg);
    }
}

class EmailNotification extends Notification {
    public void send(String msg){
        System.out.println("Sending an Email:"+ msg);
    }
}

class SmsNotification extends Notification {
    public void send(String msg){
        System.out.println("Sending an SMS:"+ msg);
    }
}

public class Q46 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Notification n;

        System.out.print("Choose 1 for Email, 2 for SMS, 3 for Plain:");
        int choice = sc.nextInt();

        if(choice==1){
            n = new EmailNotification();
        }
        else if(choice==2){
            n = new SmsNotification();
        }
        else{
            n = new Notification();
        }

        n.send("Your class starts at 10 AM");

        sc.close();
    }
}
