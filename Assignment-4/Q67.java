import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q67 {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        List<String> week = Collections.unmodifiableList(days);
        System.out.println("Days of the week : " + week);

        try {
            week.add("Funday");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Cannot add a new day   : UnsupportedOperationException");
        }

        try {
            week.remove("Monday");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Cannot remove Monday   : UnsupportedOperationException");
        }

        try {
            week.set(0, "Sunday");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Cannot replace a day   : UnsupportedOperationException");
        }

        System.out.println("Days of the week : " + week);
    }
}
