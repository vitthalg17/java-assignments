public class Q07 {

    static void withoutFinally(int a, int b) {
        System.out.println("Using try-catch");
        try {
            int result = a / b;
            System.out.println("Result is " + result);
            return;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
    }

    static void withFinally(int a, int b) {
        System.out.println("Using try-catch-finally");
        try {
            int result = a / b;
            System.out.println("Result is " + result);
            return;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        withoutFinally(10, 2);
        withoutFinally(10, 0);
        withFinally(10, 2);
        withFinally(10, 0);
    }
}