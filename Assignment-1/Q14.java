import java.util.Scanner;

public class Q14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i =0; i<10; i++) {
            
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            
            System.out.print("Enter operator (+, -, x, /): ");
            char x = scanner.next().charAt(0); 

            switch (x) {
                case '+':
                    System.out.println("Sum: " + (a + b));
                    break;
                
                case '-':
                    System.out.println("Difference: " + (a - b));
                    break;
                
                case 'x':
                    System.out.println("Product: " + (a * b));
                    break;

                case '/':
                    if (b == 0) {
                        System.out.println("Can't Divide by 0");
                    } else {
                        System.out.println("Quotient: " + (a / b));
                    }
                    break;
                    
                default:
                    System.out.println("Invalid operator selected.");
                    break;
            }
            System.out.println("-------------------------");
        }
        
        System.out.println("Goodbye!");
        scanner.close();
    }
}
