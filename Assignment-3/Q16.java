import java.io.FileOutputStream;
import java.io.IOException;

public class Q16 {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";

        try {
            FileOutputStream out = new FileOutputStream("output.txt");
            out.write(text.getBytes());
            out.close();

            System.out.println("Written to output.txt : " + text);
        }
        catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}
