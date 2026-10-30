import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {
        List<Integer> steps = new ArrayList<>();
        steps.add(8432);
        steps.add(10250);
        steps.add(6120);
        steps.add(12004);
        steps.add(9310);

        System.out.println("Daily step count using a simple for loop");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println("Day " + (i + 1) + " : " + steps.get(i));
        }

        System.out.println("-------------------------");

        System.out.println("Daily step count using an enhanced for loop");
        for (int s : steps) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        System.out.println("Daily step count using a while loop with an Iterator");
        Iterator<Integer> it = steps.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
