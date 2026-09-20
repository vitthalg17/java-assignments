import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q22 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("backup.txt");

            int data = in.read();
            while (data != -1) {
                out.write(data);
                data = in.read();
            }

            in.close();
            out.close();

            System.out.println("input.txt has been copied into backup.txt");
        }
        catch (IOException e) {
            System.out.println("Error while copying: " + e.getMessage());
        }
    }
}
