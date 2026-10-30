import java.util.LinkedList;

class ServiceQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
        System.out.println("Joined the queue : " + item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return list.removeFirst();
    }

    public T front() {
        return list.peekFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }
}

public class Q55 {
    public static void main(String[] args) {
        ServiceQueue<String> carWash = new ServiceQueue<>();

        carWash.enqueue("Swift DL-3C-1234");
        carWash.enqueue("Creta HR-26-5678");
        carWash.enqueue("Nexon UP-16-9012");

        System.out.println("-------------------------");
        System.out.println("Cars waiting : " + carWash + ", count " + carWash.size());
        System.out.println("Next up      : " + carWash.front());

        System.out.println("Washed       : " + carWash.dequeue());
        System.out.println("Washed       : " + carWash.dequeue());
        System.out.println("Cars waiting : " + carWash);

        carWash.dequeue();
        System.out.println("All cars done? " + carWash.isEmpty());
        carWash.dequeue();
    }
}
