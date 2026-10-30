import java.util.ArrayList;

public class Q25 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Eggs");
        groceries.add("Tomatoes");
        groceries.add("Rice");

        System.out.println("Items in the grocery list : " + groceries.size());
        System.out.println("-------------------------");

        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.get(i));
        }

        System.out.println("-------------------------");
        System.out.println("Is Eggs on the list? " + groceries.contains("Eggs"));
        System.out.println("Position of Rice : " + groceries.indexOf("Rice"));
    }
}
