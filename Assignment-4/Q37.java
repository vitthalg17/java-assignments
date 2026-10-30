import java.util.TreeSet;

public class Q37 {
    public static void main(String[] args) {
        TreeSet<Integer> lapTimes = new TreeSet<>();

        lapTimes.add(92);
        lapTimes.add(88);
        lapTimes.add(95);
        lapTimes.add(85);
        lapTimes.add(90);
        System.out.println("Lap times in seconds : " + lapTimes);

        System.out.println("Fastest lap : " + lapTimes.first());
        System.out.println("Slowest lap : " + lapTimes.last());

        lapTimes.remove(95);
        System.out.println("After removing the 95 second lap : " + lapTimes);
        System.out.println("Slowest lap now : " + lapTimes.last());
    }
}
