import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
        System.out.println("Pushed : " + item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to pop");
            return null;
        }
        return items.remove(items.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }
}

public class Q09 {
    public static void main(String[] args) {
        Stack<Integer> plates = new Stack<>();
        plates.push(1);
        plates.push(2);
        plates.push(3);
        System.out.println("Top plate  : " + plates.peek());
        System.out.println("Popped     : " + plates.pop());
        System.out.println("Top plate  : " + plates.peek());

        System.out.println("-------------------------");

        Stack<String> tabs = new Stack<>();
        tabs.push("google.com");
        tabs.push("github.com");
        tabs.push("stackoverflow.com");
        System.out.println("Current page : " + tabs.peek());
        System.out.println("Back from    : " + tabs.pop());
        System.out.println("Back from    : " + tabs.pop());
        System.out.println("Current page : " + tabs.peek());
        tabs.pop();
        tabs.pop();
    }
}
