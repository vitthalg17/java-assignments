import java.util.HashMap;
import java.util.WeakHashMap;

class Session {
    String user;

    Session(String user) {
        this.user = user;
    }

    public String toString() {
        return "Session(" + user + ")";
    }
}

public class Q79 {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Session, String> weakCache = new WeakHashMap<>();
        HashMap<Session, String> strongCache = new HashMap<>();

        Session alice = new Session("alice");
        Session bob = new Session("bob");
        Session carol = new Session("carol");

        weakCache.put(alice, "dashboard data");
        weakCache.put(bob, "cart data");
        weakCache.put(carol, "profile data");

        strongCache.put(new Session("dave"), "orders data");

        System.out.println("WeakHashMap before : " + weakCache);
        System.out.println("HashMap before     : " + strongCache);
        System.out.println("-------------------------");

        System.out.println("bob and carol log out, so nothing refers to their sessions anymore");
        bob = null;
        carol = null;

        for (int i = 0; i < 5 && weakCache.size() > 1; i++) {
            System.gc();
            Thread.sleep(200);
        }

        System.out.println("WeakHashMap after GC : " + weakCache);
        System.out.println("HashMap after GC     : " + strongCache);
        System.out.println("-------------------------");
        System.out.println("alice is still referenced so her entry stays");
        System.out.println("The HashMap holds a strong reference to dave's session, so it is never collected");
    }
}
