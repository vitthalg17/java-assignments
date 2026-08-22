import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Q09 {

    static Logger logger = Logger.getLogger("Q09Logger");

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You need to be 18 or above to access this program!!.");
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("error.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        }
        catch (IOException e) {
            System.out.println("Could not create log file");
        }

        try {
            checkAge(25);
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            logger.log(Level.SEVERE, "Invalid age entered", e);
        }
        finally {
            System.out.println("Age verification finished");
        }
    }
}