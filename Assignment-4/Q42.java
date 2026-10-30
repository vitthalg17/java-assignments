import java.util.Map;
import java.util.TreeMap;

public class Q42 {
    public static void main(String[] args) {
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("India", "New Delhi");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Egypt", "Cairo");
        capitals.put("Canada", "Ottawa");

        System.out.println("Countries and capitals, keys sorted by TreeMap");
        System.out.println("-------------------------");

        for (Map.Entry<String, String> e : capitals.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("First country : " + capitals.firstKey());
        System.out.println("Last country  : " + capitals.lastKey());
        System.out.println("Countries before India : " + capitals.headMap("India").keySet());
    }
}
