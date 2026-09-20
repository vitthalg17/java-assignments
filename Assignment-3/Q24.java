import java.io.IOException;
import java.io.RandomAccessFile;

public class Q24 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("roster.txt", "rw");

            file.writeBytes("JEDI OBIWAN ALIVE  JEDI ANAKIN ALIVE  SITH SIDIOUS ALIVE");

            file.seek(0);
            System.out.println("First write  : " + file.readLine());

            file.seek(31);
            file.writeBytes("FALLEN");

            file.seek(0);
            System.out.println("After update : " + file.readLine());

            System.out.println("File length  : " + file.length() + " bytes");

            file.close();
        }
        catch (IOException e) {
            System.out.println("Error while using the file: " + e.getMessage());
        }
    }
}
