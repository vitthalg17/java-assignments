import java.util.Map;
import java.util.TreeMap;

class GradeBook {
    private TreeMap<String, Character> grades = new TreeMap<>();

    public void addGrade(String name, char grade) {
        if (grades.containsKey(name)) {
            System.out.println("Updated " + name + " from " + grades.get(name) + " to " + grade);
        }
        else {
            System.out.println("Added " + name + " with grade " + grade);
        }
        grades.put(name, grade);
    }

    public void removeStudent(String name) {
        if (grades.remove(name) != null) {
            System.out.println("Removed " + name);
        }
        else {
            System.out.println(name + " is not in the grade book");
        }
    }

    public void query(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + " got grade " + grades.get(name));
        }
        else {
            System.out.println("No grade found for " + name);
        }
    }

    public void printAll() {
        System.out.println("-------------------------");
        for (Map.Entry<String, Character> e : grades.entrySet()) {
            System.out.println("  " + e.getKey() + " : " + e.getValue());
        }
        System.out.println("-------------------------");
    }
}

public class Q75 {
    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        book.addGrade("Rohan", 'B');
        book.addGrade("Ira", 'A');
        book.addGrade("Yash", 'C');
        book.addGrade("Divya", 'A');
        book.addGrade("Manav", 'B');
        book.printAll();

        book.query("Ira");
        book.query("Kunal");

        book.addGrade("Yash", 'B');
        book.removeStudent("Manav");
        book.removeStudent("Kunal");
        book.printAll();
    }
}
