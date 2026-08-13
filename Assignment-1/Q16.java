import java.util.Scanner;

public class Q16 {
    public int fact(int n){
        if (n<=1){
            return 1;
        }

        return (n* fact(n-1));
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Q21 factorial = new Q21();

        System.out.print("Enter a Number:");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial.fact(n));

        scanner.close();

    }
}
