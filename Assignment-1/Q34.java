import java.util.Scanner;

public class Q34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks:");
        int marks = sc.nextInt();

        String result = (marks>=35) ? "Pass" : "Fail";
        System.out.println("Result:"+ result);

        System.out.print("Enter two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a>b) ? a : b;
        System.out.println("Larger Number:"+ max);

        String type = (a%2==0) ? "Even" : "Odd";
        System.out.println(a+ " is "+ type);

        sc.close();
    }
}
