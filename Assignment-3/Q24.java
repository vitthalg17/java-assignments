import java.io.IOException;
import java.io.RandomAccessFile;

public class Q24 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("seats.txt", "rw");

            file.writeBytes("SEAT A1 EMPTY  SEAT A2 EMPTY  SEAT A3 EMPTY");

            file.seek(0);
            System.out.println("First write  : " + file.readLine());

            file.seek(8);
            file.writeBytes("BOOKED");

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
