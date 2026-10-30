import java.util.ArrayList;
import java.util.List;

public class Q28 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Pluto");
        planets.add("Mars");
        planets.add("Jupyter");
        System.out.println("After adding           : " + planets);

        planets.remove("Pluto");
        System.out.println("After removing Pluto   : " + planets);

        planets.remove(0);
        System.out.println("After removing index 0 : " + planets);

        planets.set(3, "Jupiter");
        System.out.println("After fixing index 3   : " + planets);
    }
}
