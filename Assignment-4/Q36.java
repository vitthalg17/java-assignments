import java.util.HashSet;

public class Q36 {
    public static void main(String[] args) {
        HashSet<String> visitors = new HashSet<>();
        String[] entries = {"Aman", "Riya", "Kabir", "Aman", "Sneha", "Riya", "Aman"};

        System.out.println("Gate entries for the museum today");
        System.out.println("-------------------------");

        for (String name : entries) {
            if (visitors.add(name)) {
                System.out.println(name + " added");
            }
            else {
                System.out.println(name + " is already counted, duplicate ignored");
            }
        }

        System.out.println("-------------------------");
        System.out.println("Total entries      : " + entries.length);
        System.out.println("Unique visitors    : " + visitors.size());
        System.out.println("Visitor list       : " + visitors);
    }
}
