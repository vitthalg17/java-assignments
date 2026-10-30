import java.util.Map;
import java.util.TreeMap;

public class Q81 {
    public static void main(String[] args) {
        TreeMap<String, Integer> products = new TreeMap<>();
        products.put("Wireless Mouse", 799);
        products.put("Laptop Stand", 1499);
        products.put("USB-C Cable", 349);
        products.put("Bluetooth Speaker", 2499);
        products.put("Keyboard", 1299);
        products.put("Headphones", 1999);
        products.put("Phone Cover", 299);

        System.out.println("Electronics store price list (sorted by product name)");
        System.out.println("-------------------------");

        int total = 0;
        for (Map.Entry<String, Integer> e : products.entrySet()) {
            System.out.println(e.getKey() + " : Rs." + e.getValue());
            total = total + e.getValue();
        }

        System.out.println("-------------------------");
        System.out.println("Products listed : " + products.size());
        System.out.println("Cost of buying one of each : Rs." + total);
    }
}
