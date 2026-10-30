import java.util.ArrayDeque;

public class Q50 {
    public static void main(String[] args) {
        ArrayDeque<String> train = new ArrayDeque<>();

        train.add("Coach S1");
        train.add("Coach S2");
        train.addFirst("Engine");
        train.addLast("Guard Van");
        System.out.println("Train after adding at both ends : " + train);

        System.out.println("Front of the train : " + train.peekFirst());
        System.out.println("Back of the train  : " + train.peekLast());

        System.out.println("-------------------------");

        System.out.println("Detached from front : " + train.removeFirst());
        System.out.println("Detached from back  : " + train.removeLast());
        System.out.println("Train now : " + train);

        System.out.println("Front of the train : " + train.peekFirst());
        System.out.println("Back of the train  : " + train.peekLast());
    }
}
