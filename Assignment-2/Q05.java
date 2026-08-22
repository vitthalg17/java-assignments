import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        List<String> f1 = new ArrayList<>();
        f1.add("McLaren");
        f1.add("Redbull");
        f1.add("Mercedes");
        f1.add("Ferrari");

        System.out.println("Before sorting: " + f1);

        f1.sort((a, b) -> b.compareTo(a));

        System.out.println("After sorting:  " + f1);
    }
}