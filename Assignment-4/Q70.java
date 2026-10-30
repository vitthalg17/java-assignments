import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.marks - a.marks;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class Q70 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Neha", 87));
        students.add(new Student("Aditya", 92));
        students.add(new Student("Zoya", 78));
        students.add(new Student("Karan", 95));
        students.add(new Student("Bhavna", 81));

        System.out.println("Class list         : " + students);

        students.sort(new MarksComparator());
        System.out.println("Ranked by marks    : " + students);

        students.sort(new NameComparator());
        System.out.println("Sorted by name     : " + students);
    }
}
