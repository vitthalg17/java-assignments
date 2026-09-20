import java.io.FileReader;
import java.io.IOException;

public class Q17 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");

            System.out.println("Reading input.txt using FileReader");
            System.out.println("-------------------------");

            int ch = reader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = reader.read();
            }

            reader.close();
            System.out.println("-------------------------");
            System.out.println("Finished reading the file");
        }
        catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
