import java.util.Arrays;
import java.util.List;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;

    MinMaxFinder(List<T> list) {
        this.list = list;
    }

    public T findMin() {
        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T findMax() {
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Integer> temperatures = Arrays.asList(31, 27, 35, 29, 40, 25);
        MinMaxFinder<Integer> weather = new MinMaxFinder<>(temperatures);
        System.out.println("Temperatures this week : " + temperatures);
        System.out.println("Coldest day : " + weather.findMin());
        System.out.println("Hottest day : " + weather.findMax());

        System.out.println("-------------------------");

        List<String> cities = Arrays.asList("Mumbai", "Delhi", "Pune", "Agra", "Shimla");
        MinMaxFinder<String> atlas = new MinMaxFinder<>(cities);
        System.out.println("Cities : " + cities);
        System.out.println("First alphabetically : " + atlas.findMin());
        System.out.println("Last alphabetically  : " + atlas.findMax());
    }
}
