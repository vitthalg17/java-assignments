import java.util.Scanner;

public class Q23 {
    public void fib(int n){
        int n1=0;
        int n2=1;
        
        for (int i= 0; i<n; i++){
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2= next;

        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q23 fibonacci = new Q23();

        System.out.print("Enter how many times the Fibbonacci Sequence should run:");
        int n = sc.nextInt();

        fibonacci.fib(n);
        sc.close();


    }
    
}
