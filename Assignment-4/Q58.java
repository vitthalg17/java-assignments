import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class VoteCounter extends Thread {
    private List<Integer> box;
    private int votes;

    VoteCounter(String name, List<Integer> box, int votes) {
        super(name);
        this.box = box;
        this.votes = votes;
    }

    public void run() {
        try {
            for (int i = 0; i < votes; i++) {
                box.add(1);
            }
        }
        catch (Exception e) {
            System.out.println(getName() + " crashed while adding : " + e);
        }
    }
}

public class Q58 {
    static int countVotes(List<Integer> box) throws InterruptedException {
        VoteCounter[] booths = new VoteCounter[4];

        for (int i = 0; i < booths.length; i++) {
            booths[i] = new VoteCounter("Booth-" + (i + 1), box, 10000);
            booths[i].start();
        }

        for (VoteCounter b : booths) {
            b.join();
        }

        return box.size();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("4 polling booths each drop 10000 votes into the same box");
        System.out.println("Expected total : 40000");
        System.out.println("-------------------------");

        int vectorTotal = countVotes(new Vector<>());
        System.out.println("Vector box    : " + vectorTotal);

        int arrayListTotal = countVotes(new ArrayList<>());
        System.out.println("ArrayList box : " + arrayListTotal);

        System.out.println("-------------------------");
        System.out.println("Vector methods are synchronized, so no vote is lost");
        System.out.println("ArrayList is not synchronized, so threads overwrite each other and votes go missing");
    }
}
