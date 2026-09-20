import java.io.File;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        File scrap = new File("scrap.txt");

        try {
            if (!scrap.exists()) {
                scrap.createNewFile();
                System.out.println(scrap.getName() + " was created first so that it can be deleted");
            }

            System.out.println("Does the file exist now? " + scrap.exists());

            boolean removed = scrap.delete();

            if (removed) {
                System.out.println(scrap.getName() + " has been deleted");
            }
            else {
                System.out.println(scrap.getName() + " could not be deleted");
            }

            System.out.println("Does the file exist now? " + scrap.exists());
        }
        catch (IOException e) {
            System.out.println("Error while working with the file: " + e.getMessage());
        }
    }
}
