import java.io.File;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        File target = new File("death_star.txt");

        try {
            if (!target.exists()) {
                target.createNewFile();
                System.out.println(target.getName() + " was created first so that it can be deleted");
            }

            System.out.println("Does the file exist now? " + target.exists());

            boolean removed = target.delete();

            if (removed) {
                System.out.println(target.getName() + " has been deleted");
            }
            else {
                System.out.println(target.getName() + " could not be deleted");
            }

            System.out.println("Does the file exist now? " + target.exists());
        }
        catch (IOException e) {
            System.out.println("Error while working with the file: " + e.getMessage());
        }
    }
}
