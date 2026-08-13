import java.util.Scanner;

class Player {
    String name;
    String game;
    int score;

    Player(String name,String game,int score){
        this.name = name;
        this.game = game;
        this.score = score;
    }

    public void show(){
        System.out.println("Name:"+ name);
        System.out.println("Game:"+ game);
        System.out.println("Score:"+ score);
    }
}

public class Q39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name:");
        String name = sc.nextLine();

        System.out.print("Enter Game:");
        String game = sc.nextLine();

        System.out.print("Enter Score:");
        int score = sc.nextInt();

        Player p = new Player(name, game, score);
        p.show();

        sc.close();
    }
}
