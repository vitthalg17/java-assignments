import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class LikeClicker extends Thread {
    private ConcurrentHashMap<String, Integer> likes;
    private String post;

    LikeClicker(ConcurrentHashMap<String, Integer> likes, String post) {
        this.likes = likes;
        this.post = post;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            likes.merge(post, 1, Integer::sum);
        }
    }
}

public class Q60 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> likes = new ConcurrentHashMap<>();
        likes.put("sunset.jpg", 0);
        likes.put("puppy.jpg", 0);

        LikeClicker[] users = new LikeClicker[6];
        for (int i = 0; i < users.length; i++) {
            String post = (i % 2 == 0) ? "sunset.jpg" : "puppy.jpg";
            users[i] = new LikeClicker(likes, post);
            users[i].start();
        }

        for (LikeClicker u : users) {
            u.join();
        }

        System.out.println("6 users click like 1000 times each, 3 on every post");
        System.out.println("Likes : " + likes);
        System.out.println("Each post correctly has 3000 likes");

        System.out.println("-------------------------");

        System.out.println("Adding a new key while looping over a ConcurrentHashMap");
        for (String post : likes.keySet()) {
            if (post.equals("sunset.jpg")) {
                likes.put("mountains.jpg", 0);
            }
            System.out.println("  visited " + post);
        }
        System.out.println("No error, map is now : " + likes);

        System.out.println("-------------------------");

        System.out.println("Doing the same with a normal HashMap");
        Map<String, Integer> normal = new HashMap<>();
        normal.put("sunset.jpg", 0);
        normal.put("puppy.jpg", 0);
        try {
            for (String post : normal.keySet()) {
                normal.put("mountains.jpg", 0);
                System.out.println("  visited " + post);
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("HashMap threw ConcurrentModificationException");
        }
    }
}
