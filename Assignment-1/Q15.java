import java.util.Scanner;

public class Q15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        
        while (i == 1) {
            System.out.print("Enter a number to check (or 0 to exit): ");
            int n = scanner.nextInt();
            
            if (n == 0) {
                break;
            }

            boolean isPrime = true;
            int divisor = 2; 

            if (n <= 1) {
                isPrime = false;
            } else {
                while (divisor <= n / 2) {
                    if (n % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                    divisor++; 
                }
            }

            if (isPrime) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is NOT a Prime number.");
            }
            System.out.println("-------------------------");
        }
        scanner.close();
    }
}
