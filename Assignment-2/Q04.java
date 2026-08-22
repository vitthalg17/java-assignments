import java.util.Scanner;

@FunctionalInterface
interface Calculator{
    int compute(int a, int b);
    }

public class Q04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Calculator add = (a,b) -> (a+b);
        Calculator sub = (a,b) -> (a-b);
        Calculator mul = (a,b) -> (a*b);

        System.out.println("Enter 2 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + add.compute(a, b));
        System.out.println("Subtraction: " + sub.compute(a, b));
        System.out.println("Multiply: " + mul.compute(a, b));

        sc.close();
    }
}
