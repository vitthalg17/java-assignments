import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q19 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));

            writer.write("Do or do not. There is no try.");
            writer.newLine();
            writer.write("The Force will be with you. Always.");
            writer.newLine();
            writer.write("I have a bad feeling about this.");
            writer.newLine();

            writer.close();
            System.out.println("Written to example.txt using BufferedWriter");
        }
        catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        System.out.println("-------------------------");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));

            System.out.println("Reading example.txt using BufferedReader");

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
