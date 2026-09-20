import java.io.FileWriter;
import java.io.IOException;

public class Q18 {
    public static void main(String[] args) {
        String text = "Character streams move data one character at a time.";

        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write(text);
            writer.close();

            System.out.println("Written to example.txt : " + text);
        }
        catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}
