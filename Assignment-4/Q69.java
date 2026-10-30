import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q69 {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList(
            "Cappuccino", "Latte", "Espresso", "Latte", "Cold Coffee",
            "Cappuccino", "Latte", "Espresso", "Latte", "Mocha"
        );

        System.out.println("Cafe orders today : " + orders);
        System.out.println("-------------------------");

        for (String drink : new HashSet<>(orders)) {
            System.out.println(drink + " ordered " + Collections.frequency(orders, drink) + " time(s)");
        }

        System.out.println("-------------------------");
        System.out.println("Green Tea ordered " + Collections.frequency(orders, "Green Tea") + " time(s)");
    }
}
