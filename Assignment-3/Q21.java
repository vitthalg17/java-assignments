import java.io.File;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the folder path: ");
        String path = sc.nextLine();

        try {
            File folder = new File(path);

            if (!folder.isDirectory()) {
                System.out.println("This is not a folder or it does not exist");
            }
            else {
                File[] items = folder.listFiles();

                System.out.println("Items inside " + folder.getAbsolutePath());
                System.out.println("-------------------------");

                for (int i = 0; i < items.length; i++) {
                    if (items[i].isDirectory()) {
                        System.out.println("[FOLDER] " + items[i].getName());
                    }
                    else {
                        System.out.println("[FILE]   " + items[i].getName());
                    }
                }

                System.out.println("-------------------------");
                System.out.println("Total items: " + items.length);
            }
        }
        catch (Exception e) {
            System.out.println("Error while reading the folder: " + e.getMessage());
        }

        sc.close();
    }
}
