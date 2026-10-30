import java.util.TreeSet;

public class Q33 {
    public static void main(String[] args) {
        TreeSet<String> dictionary = new TreeSet<>();
        dictionary.add("mango");
        dictionary.add("apple");
        dictionary.add("zebra");
        dictionary.add("kite");
        dictionary.add("banana");
        dictionary.add("apple");

        System.out.println("Words added : mango, apple, zebra, kite, banana, apple");
        System.out.println("TreeSet     : " + dictionary);

        System.out.println("-------------------------");

        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(72);
        marks.add(95);
        marks.add(41);
        marks.add(88);
        marks.add(60);

        System.out.println("Marks added : 72, 95, 41, 88, 60");
        System.out.println("TreeSet     : " + marks);
        System.out.println("Highest descending : " + marks.descendingSet());
    }
}
