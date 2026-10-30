import java.util.LinkedHashMap;
import java.util.Map;

class LruCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if (size() > capacity) {
            System.out.println("  cache full, removing least recently used : " + eldest.getKey());
            return true;
        }
        return false;
    }
}

public class Q72 {
    public static void main(String[] args) {
        LruCache<String, String> recentApps = new LruCache<>(3);

        System.out.println("Phone keeps only the last 3 apps in memory");
        System.out.println("-------------------------");

        recentApps.put("WhatsApp", "chats loaded");
        recentApps.put("Instagram", "feed loaded");
        recentApps.put("Spotify", "playlist loaded");
        System.out.println("Opened WhatsApp, Instagram, Spotify : " + recentApps.keySet());

        recentApps.get("WhatsApp");
        System.out.println("Switched back to WhatsApp           : " + recentApps.keySet());

        System.out.println("Opening YouTube");
        recentApps.put("YouTube", "video loaded");
        System.out.println("Apps in memory                      : " + recentApps.keySet());

        System.out.println("Opening Maps");
        recentApps.put("Maps", "route loaded");
        System.out.println("Apps in memory                      : " + recentApps.keySet());

        System.out.println("-------------------------");
        System.out.println("Is Instagram still in memory? " + recentApps.containsKey("Instagram"));
        System.out.println("Is WhatsApp still in memory?  " + recentApps.containsKey("WhatsApp"));
    }
}
