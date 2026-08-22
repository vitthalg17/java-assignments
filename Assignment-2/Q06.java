import java.util.function.Function;
import java.util.Scanner;

public class Q06 {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<Integer, Integer> squarer = Q06::square;

        int n = sc.nextInt();

        System.out.println("Square = " + squarer.apply(n));

        sc.close();
    }

}