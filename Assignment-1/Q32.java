import java.util.Scanner;

public class Q32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        if(b!=0){
            System.out.println("a / b = "+ (a/b));
            System.out.println("a % b = "+ (a%b));
        }
        else{
            System.out.println("Can't Divide by 0");
        }

        System.out.println("Relational Operators:");
        System.out.println("a > b  = "+ (a>b));
        System.out.println("a < b  = "+ (a<b));
        System.out.println("a >= b = "+ (a>=b));
        System.out.println("a <= b = "+ (a<=b));
        System.out.println("a == b = "+ (a==b));
        System.out.println("a != b = "+ (a!=b));

        System.out.println("Logical Operators:");
        System.out.println("a > 0 && b > 0 = "+ (a>0 && b>0));
        System.out.println("a > 0 || b > 0 = "+ (a>0 || b>0));

        sc.close();
    }
}
