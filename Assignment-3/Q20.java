import java.io.File;
import java.io.IOException;

public class Q20 {
    public static void main(String[] args) {
        File logbook = new File("logbook.txt");

        try {
            if (logbook.exists()) {
                System.out.println(logbook.getName() + " already exists");
                System.out.println("Full path : " + logbook.getAbsolutePath());
                System.out.println("Size      : " + logbook.length() + " bytes");
            }
            else {
                boolean made = logbook.createNewFile();
                if (made) {
                    System.out.println(logbook.getName() + " was not there, so it has been created");
                    System.out.println("Full path : " + logbook.getAbsolutePath());
                }
                else {
                    System.out.println("Could not create " + logbook.getName());
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error while checking the file: " + e.getMessage());
        }
    }
}
