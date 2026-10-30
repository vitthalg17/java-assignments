import java.util.HashMap;
import java.util.Map;

public class Q74 {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            }
            else {
                count.put(c, 1);
            }
        }

        System.out.println("Text : " + text);
        System.out.println("-------------------------");

        for (Map.Entry<Character, Integer> e : count.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("Different letters used : " + count.size());
    }
}
