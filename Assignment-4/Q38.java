import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q38 {
    public static void main(String[] args) {
        String[] stops = {"Kashmere Gate", "Rajiv Chowk", "Patel Chowk", "Central Secretariat", "Udyog Bhawan", "Rajiv Chowk"};

        LinkedHashSet<String> route = new LinkedHashSet<>();
        HashSet<String> plain = new HashSet<>();

        for (String s : stops) {
            route.add(s);
            plain.add(s);
        }

        System.out.println("Metro stops in LinkedHashSet");
        for (String s : route) {
            System.out.println("  " + s);
        }

        System.out.println("-------------------------");

        System.out.println("Same stops in a HashSet");
        for (String s : plain) {
            System.out.println("  " + s);
        }

        System.out.println("-------------------------");
        System.out.println("LinkedHashSet keeps a linked list of entries, so it remembers the insertion order");
        System.out.println("HashSet places entries by their hash code, so the order looks random");
    }
}
