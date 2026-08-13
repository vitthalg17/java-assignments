import java.util.Scanner;

public class Q11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word:");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        System.out.println("Original:"+ sb);

        sb.append(" Java");
        System.out.println("After append:"+ sb);

        sb.insert(0, "My ");
        System.out.println("After insert:"+ sb);

        sb.reverse();
        System.out.println("After reverse:"+ sb);

        sb.reverse();
        sb.delete(0, 3);
        System.out.println("After delete:"+ sb);

        System.out.println("Length:"+ sb.length());

        StringBuilder count = new StringBuilder();
        for(int i=1; i<=5; i++){
            count.append(i);
            count.append(" ");
        }
        System.out.println("Built in a loop:"+ count);

        sc.close();
    }
}
