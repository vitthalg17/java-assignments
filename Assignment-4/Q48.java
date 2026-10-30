import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task other) {
        return this.priority - other.priority;
    }

    public String toString() {
        return name + "(P" + priority + ")";
    }
}

public class Q48 {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Water the plants", 4));
        tasks.add(new Task("Submit Java assignment", 1));
        tasks.add(new Task("Buy groceries", 3));
        tasks.add(new Task("Pay electricity bill", 2));
        tasks.add(new Task("Watch a movie", 5));

        System.out.println("Tasks in the queue : " + tasks);
        System.out.println("Highest priority   : " + tasks.peek());

        Task done = tasks.poll();
        System.out.println("Finished           : " + done);
        System.out.println("Queue now          : " + tasks);

        System.out.println("-------------------------");
        System.out.println("Doing the rest in priority order");
        while (!tasks.isEmpty()) {
            System.out.println("  " + tasks.poll());
        }
    }
}
