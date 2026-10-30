import java.util.Arrays;

public class Q08 {
    public static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String[] batting = {"Rohit", "Gill", "Kohli", "Iyer"};
        System.out.println("Batting order before : " + Arrays.toString(batting));
        swapElements(batting, 1, 2);
        System.out.println("Batting order after  : " + Arrays.toString(batting));

        System.out.println("-------------------------");

        Integer[] floors = {1, 2, 3, 4, 5};
        System.out.println("Floors before : " + Arrays.toString(floors));
        swapElements(floors, 0, 4);
        System.out.println("Floors after  : " + Arrays.toString(floors));

        System.out.println("-------------------------");

        Character[] grades = {'A', 'B', 'C'};
        System.out.println("Grades before : " + Arrays.toString(grades));
        swapElements(grades, 0, 2);
        System.out.println("Grades after  : " + Arrays.toString(grades));
    }
}
