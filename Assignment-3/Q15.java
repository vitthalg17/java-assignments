import java.io.FileInputStream;
import java.io.IOException;

public class Q15 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("input.txt");

            System.out.println("Reading input.txt using FileInputStream");
            System.out.println("-------------------------");

            int data = in.read();
            while (data != -1) {
                System.out.print((char) data);
                data = in.read();
            }

            in.close();
            System.out.println("-------------------------");
            System.out.println("Finished reading the file");
        }
        catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
