class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Q06 {
    public static void main(String[] args) {
        Pair<String, Integer> seat = new Pair<>("Row F", 14);
        System.out.println("Movie seat : " + seat.getKey() + ", Seat " + seat.getValue());

        seat.setValue(15);
        System.out.println("Seat changed to " + seat.getKey() + ", Seat " + seat.getValue());

        System.out.println("-------------------------");

        Pair<Integer, String> train = new Pair<>(12951, "Rajdhani Express");
        System.out.println("Train " + train.getKey() + " : " + train.getValue());

        train.setKey(12301);
        train.setValue("Howrah Rajdhani");
        System.out.println("Train " + train.getKey() + " : " + train.getValue());
    }
}
