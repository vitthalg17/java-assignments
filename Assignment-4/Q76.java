import java.util.PriorityQueue;

public class Q76 {
    public static void main(String[] args) {
        PriorityQueue<Integer> morningBatch = new PriorityQueue<>();
        morningBatch.add(34);
        morningBatch.add(12);
        morningBatch.add(56);
        morningBatch.add(7);

        PriorityQueue<Integer> eveningBatch = new PriorityQueue<>();
        eveningBatch.add(41);
        eveningBatch.add(3);
        eveningBatch.add(29);
        eveningBatch.add(18);

        System.out.println("Morning order IDs : " + morningBatch);
        System.out.println("Evening order IDs : " + eveningBatch);

        PriorityQueue<Integer> merged = new PriorityQueue<>(morningBatch);
        merged.addAll(eveningBatch);

        System.out.println("Merged queue      : " + merged);
        System.out.println("-------------------------");

        System.out.print("Orders in sorted order : ");
        while (!merged.isEmpty()) {
            System.out.print(merged.poll() + " ");
        }
        System.out.println();
    }
}
