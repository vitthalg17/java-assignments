class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Q08 {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You need to be 18 or above to access this program!!.");
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Age verification finished");
        }
    }
}