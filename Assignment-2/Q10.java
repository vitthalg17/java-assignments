public class Q10 {

    static int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5 is " + factorial(5));
            System.out.println("Factorial of -3 is " + factorial(-3));
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Calculation finished");
        }
    }
}