import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class ValueComparator implements Comparator<Map.Entry<String, Integer>> {
    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
        return b.getValue() - a.getValue();
    }
}

public class Q71 {
    public static void main(String[] args) {
        Map<String, Integer> medals = new HashMap<>();
        medals.put("India", 29);
        medals.put("USA", 126);
        medals.put("Japan", 45);
        medals.put("China", 91);
        medals.put("Brazil", 20);
        medals.put("Australia", 53);

        System.out.println("Medal tally (HashMap) : " + medals);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(medals.entrySet());
        entries.sort(new ValueComparator());

        Map<String, Integer> ranked = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : entries) {
            ranked.put(e.getKey(), e.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("Medal tally sorted by medals");

        int rank = 1;
        for (Map.Entry<String, Integer> e : ranked.entrySet()) {
            System.out.println(rank + ". " + e.getKey() + " : " + e.getValue());
            rank++;
        }
    }
}
