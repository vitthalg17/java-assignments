import java.util.LinkedList;
import java.util.Queue;

public class Q47 {
    public static void main(String[] args) {
        Queue<String> counter = new LinkedList<>();
        int ticketsLeft = 3;

        counter.add("Ishaan");
        counter.add("Priya");
        counter.add("Dev");
        counter.add("Nisha");
        counter.add("Tanvi");

        System.out.println("Concert ticket counter opens, " + ticketsLeft + " tickets available");
        System.out.println("People in line : " + counter);
        System.out.println("Next in line   : " + counter.peek());
        System.out.println("-------------------------");

        while (!counter.isEmpty()) {
            String person = counter.poll();

            if (ticketsLeft > 0) {
                ticketsLeft--;
                System.out.println(person + " booked a ticket, " + ticketsLeft + " left");
            }
            else {
                System.out.println("Sorry " + person + ", tickets are sold out");
            }
        }

        System.out.println("-------------------------");
        System.out.println("Line is empty, counter closed");
    }
}
