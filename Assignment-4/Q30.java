import java.util.ArrayList;
import java.util.Collections;

public class Q30 {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Thor");
        heroes.add("Iron Man");
        heroes.add("Black Widow");
        heroes.add("Hulk");
        heroes.add("Captain America");
        heroes.add("Spider-Man");

        System.out.println("Original order       : " + heroes);

        Collections.sort(heroes);
        System.out.println("Alphabetical         : " + heroes);

        Collections.sort(heroes, Collections.reverseOrder());
        System.out.println("Reverse alphabetical : " + heroes);
    }
}
