import java.util.ArrayList;

class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added   : " + task);
    }

    public void removeTask(int number) {
        if (number < 1 || number > tasks.size()) {
            System.out.println("No task with number " + number);
            return;
        }
        System.out.println("Removed : " + tasks.remove(number - 1));
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Removed : " + task);
        }
        else {
            System.out.println("No task called " + task);
        }
    }

    public void display() {
        System.out.println("-------------------------");
        if (tasks.isEmpty()) {
            System.out.println("Nothing to do, enjoy the day!");
        }
        else {
            System.out.println("To-do list");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + tasks.get(i));
            }
        }
        System.out.println("-------------------------");
    }
}

public class Q73 {
    public static void main(String[] args) {
        TodoList today = new TodoList();

        today.addTask("Finish Module 4 assignment");
        today.addTask("Go to the gym");
        today.addTask("Call grandparents");
        today.addTask("Book train tickets");
        today.display();

        today.removeTask(2);
        today.removeTask("Book train tickets");
        today.removeTask(7);
        today.display();

        today.removeTask(1);
        today.removeTask(1);
        today.display();
    }
}
