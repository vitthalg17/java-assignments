class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
        System.out.println("Packed : " + item);
    }

    public T getItem() {
        return item;
    }
}

public class Q07 {
    public static void main(String[] args) {
        Box<String> giftBox = new Box<>();
        giftBox.addItem("Harry Potter Box Set");
        System.out.println("Gift box has : " + giftBox.getItem());

        System.out.println("-------------------------");

        Box<Integer> lockerBox = new Box<>();
        lockerBox.addItem(4821);
        int code = lockerBox.getItem();
        System.out.println("Locker code is " + code + " and next code is " + (code + 1));
    }
}
