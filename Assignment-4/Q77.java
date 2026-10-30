import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MultiMap<K, V> {
    private HashMap<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    public List<V> get(K key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return new ArrayList<>();
    }

    public boolean remove(K key, V value) {
        if (!map.containsKey(key)) {
            return false;
        }
        boolean removed = map.get(key).remove(value);
        if (map.get(key).isEmpty()) {
            map.remove(key);
        }
        return removed;
    }

    public int size() {
        int total = 0;
        for (List<V> values : map.values()) {
            total = total + values.size();
        }
        return total;
    }

    public String toString() {
        return map.toString();
    }
}

public class Q77 {
    public static void main(String[] args) {
        MultiMap<String, String> actors = new MultiMap<>();
        actors.put("Christopher Nolan", "Inception");
        actors.put("Christopher Nolan", "Interstellar");
        actors.put("Christopher Nolan", "Oppenheimer");
        actors.put("Rajkumar Hirani", "3 Idiots");
        actors.put("Rajkumar Hirani", "PK");
        actors.put("Greta Gerwig", "Barbie");

        System.out.println("Directors and their films : " + actors);
        System.out.println("Total films stored : " + actors.size());
        System.out.println("-------------------------");

        System.out.println("Nolan films  : " + actors.get("Christopher Nolan"));
        System.out.println("Hirani films : " + actors.get("Rajkumar Hirani"));
        System.out.println("Spielberg    : " + actors.get("Steven Spielberg"));

        System.out.println("-------------------------");
        actors.remove("Christopher Nolan", "Inception");
        actors.remove("Greta Gerwig", "Barbie");
        System.out.println("After removing Inception and Barbie : " + actors);

        MultiMap<Integer, Integer> tables = new MultiMap<>();
        for (int i = 1; i <= 5; i++) {
            tables.put(7, 7 * i);
        }
        System.out.println("Table of 7 (first 5) : " + tables.get(7));
    }
}
