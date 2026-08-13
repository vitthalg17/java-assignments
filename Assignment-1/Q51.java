import java.util.Scanner;

public class Q51 {
    public void Words(String line){
        String[] words = line.split(" ");

        for(int i=0; i<words.length; i++){
            if(words[i].length()>0){
                System.out.println(words[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q51 s = new Q51();

        System.out.println("Enter a Sentence:");
        String line = sc.nextLine();

        s.Words(line);

        sc.close();
    }
}
