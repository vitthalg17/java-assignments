import utilities.MathUtils;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils calc = new MathUtils();

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = calc.add(a, b);

        System.out.println(a+ " + "+ b+ " = "+ result);

        sc.close();
    }
}