import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q29 {
    static final int SIZE = 50000;

    static long addAtBeginning(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, i);
        }
        return (System.nanoTime() - start) / 1000000;
    }

    static long removeFromMiddle(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < SIZE / 2; i++) {
            list.remove(list.size() / 2);
        }
        return (System.nanoTime() - start) / 1000000;
    }

    static long iterate(List<Integer> list) {
        long start = System.nanoTime();
        long sum = 0;
        for (int x : list) {
            sum = sum + x;
        }
        return (System.nanoTime() - start) / 1000000;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Working with " + SIZE + " elements, time in ms");
        System.out.println("-------------------------");

        System.out.println("Adding at the beginning");
        System.out.println("  ArrayList  : " + addAtBeginning(arrayList));
        System.out.println("  LinkedList : " + addAtBeginning(linkedList));

        System.out.println("Removing from the middle");
        System.out.println("  ArrayList  : " + removeFromMiddle(arrayList));
        System.out.println("  LinkedList : " + removeFromMiddle(linkedList));

        System.out.println("Iterating through the list");
        System.out.println("  ArrayList  : " + iterate(arrayList));
        System.out.println("  LinkedList : " + iterate(linkedList));

        System.out.println("-------------------------");
        System.out.println("LinkedList wins at adding at the front since it only changes a few links");
        System.out.println("ArrayList is usually faster in the middle because LinkedList must walk to that node first");
        System.out.println("ArrayList is usually faster to iterate because its elements sit next to each other in memory");
    }
}
