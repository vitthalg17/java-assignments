import java.util.ArrayList;
import java.util.Collections;

public class Q65 {
    public static void main(String[] args) {
        ArrayList<Integer> tokens = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            tokens.add(i);
        }

        System.out.println("Lucky draw tokens : " + tokens);

        Collections.shuffle(tokens);
        System.out.println("After shuffle     : " + tokens);
        System.out.println("Winner token      : " + tokens.get(0));

        Collections.shuffle(tokens);
        System.out.println("Shuffle again     : " + tokens);

        Collections.sort(tokens);
        System.out.println("After sort        : " + tokens);

        Collections.sort(tokens, Collections.reverseOrder());
        System.out.println("Reverse sort      : " + tokens);
    }
}
