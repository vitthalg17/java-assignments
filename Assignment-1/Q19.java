import java.util.Scanner;

public class Q19 {
    public int check(int n){
        if (n==0){
            return 0;
        }
        else if(n%2==0){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Q19 oe = new Q19();

        System.out.print("Enter a Number:");

        int n = scanner.nextInt();

        if(oe.check(n) ==0){
            System.out.println(n+ " is 0!");
        }
        else if(oe.check(n) ==2){
            System.out.println(n+ " is Even!");
        }
        else{
            System.out.println(n+ " is Odd!");
        }

        scanner.close();

    }
}
