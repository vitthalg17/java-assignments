import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q46 {
    public static void main(String[] args) {
        String[] courses = {"Starter", "Soup", "Salad", "Main Course", "Dessert", "Coffee"};
        String[] dishes = {"Paneer Tikka", "Tomato Shorba", "Caesar Salad", "Butter Chicken", "Gulab Jamun", "Filter Coffee"};

        Map<String, String> hashMenu = new HashMap<>();
        Map<String, String> linkedMenu = new LinkedHashMap<>();

        for (int i = 0; i < courses.length; i++) {
            hashMenu.put(courses[i], dishes[i]);
            linkedMenu.put(courses[i], dishes[i]);
        }

        System.out.println("Dinner menu stored in a HashMap");
        for (Map.Entry<String, String> e : hashMenu.entrySet()) {
            System.out.println("  " + e.getKey() + " : " + e.getValue());
        }

        System.out.println("-------------------------");

        System.out.println("Dinner menu stored in a LinkedHashMap");
        for (Map.Entry<String, String> e : linkedMenu.entrySet()) {
            System.out.println("  " + e.getKey() + " : " + e.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("HashMap does not keep any order, so dessert may come before the starter");
        System.out.println("LinkedHashMap gives the courses back in the order they were put in");
    }
}
