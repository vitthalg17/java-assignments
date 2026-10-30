import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q22 {
    public static <T> void printAll(Collection<T> items) {
        for (T item : items) {
            System.out.println("  " + item);
        }
    }

    public static void main(String[] args) {
        List<String> playlist = new ArrayList<>();
        playlist.add("Bohemian Rhapsody");
        playlist.add("Hotel California");
        playlist.add("Imagine");
        System.out.println("List (playlist) :");
        printAll(playlist);

        Set<Integer> rollNumbers = new HashSet<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        System.out.println("Set (roll numbers) :");
        printAll(rollNumbers);

        Queue<String> printJobs = new LinkedList<>();
        printJobs.add("resume.pdf");
        printJobs.add("ticket.png");
        printJobs.add("notes.docx");
        System.out.println("Queue (print jobs) :");
        printAll(printJobs);
    }
}
