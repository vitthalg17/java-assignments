import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ChatReader extends Thread {
    private List<String> chat;

    ChatReader(List<String> chat) {
        super("Reader");
        this.chat = chat;
    }

    public void run() {
        for (int round = 1; round <= 3; round++) {
            int count = 0;
            for (String msg : chat) {
                count++;
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    System.out.println(getName() + " was interrupted");
                }
            }
            System.out.println(getName() + " round " + round + " read " + count + " messages safely");
        }
    }
}

class ChatWriter extends Thread {
    private List<String> chat;
    private String[] messages;

    ChatWriter(String name, List<String> chat, String[] messages) {
        super(name);
        this.chat = chat;
        this.messages = messages;
    }

    public void run() {
        for (String m : messages) {
            chat.add(getName() + ": " + m);
            System.out.println(getName() + " sent \"" + m + "\"");
            try {
                Thread.sleep(150);
            }
            catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted");
            }
        }
    }
}

public class Q62 {
    public static void main(String[] args) throws InterruptedException {
        List<String> chat = new CopyOnWriteArrayList<>();
        chat.add("Admin: Welcome to the group");

        ChatReader reader = new ChatReader(chat);
        ChatWriter alice = new ChatWriter("Alice", chat, new String[]{"Hi all", "Movie tonight?"});
        ChatWriter bob = new ChatWriter("Bob", chat, new String[]{"Hey", "I'm in"});

        reader.start();
        alice.start();
        bob.start();

        reader.join();
        alice.join();
        bob.join();

        System.out.println("-------------------------");

        System.out.println("Removing Admin messages while iterating on the main thread");
        for (String msg : chat) {
            if (msg.startsWith("Admin")) {
                chat.remove(msg);
            }
        }

        System.out.println("Final chat : " + chat);
        System.out.println("No ConcurrentModificationException because every change makes a fresh copy of the list");
    }
}
