class Scoreboard<T extends Number> {
    private T[] scores;

    Scoreboard(T[] scores) {
        this.scores = scores;
    }

    public double total() {
        double sum = 0;
        for (T s : scores) {
            sum = sum + s.doubleValue();
        }
        return sum;
    }

    public double average() {
        return total() / scores.length;
    }
}

public class Q03 {
    public static void main(String[] args) {
        Integer[] runs = {45, 12, 78, 33, 101};
        Scoreboard<Integer> cricket = new Scoreboard<>(runs);
        System.out.println("Runs scored    : " + cricket.total());
        System.out.println("Average runs   : " + cricket.average());

        System.out.println("-------------------------");

        Double[] laps = {58.4, 57.9, 59.1, 58.0};
        Scoreboard<Double> racing = new Scoreboard<>(laps);
        System.out.println("Total lap time : " + racing.total());
        System.out.println("Average lap    : " + racing.average());

        // Scoreboard<String> names = new Scoreboard<>(new String[]{"a"});
        // the line above does not compile because String is not a subclass of Number
    }
}
