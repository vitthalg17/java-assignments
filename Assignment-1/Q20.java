import java.util.Scanner;

public class Q20 {
    public int check(int n1,int n2,int n3){

        int max = n1;
        if(n2>max){
            max =n2;
        }
        if(n3>max){
            max =n3;
        }

        return max;
    }

    public static void main(String args[]){
        Q20 large = new Q20();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println("The Largest Number of the 3 is " +large.check(n1, n2, n3));

        scanner.close();
    }

    
}
