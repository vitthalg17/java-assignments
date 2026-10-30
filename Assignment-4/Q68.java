import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q68 {
    public static void main(String[] args) {
        List<Integer> pages = new ArrayList<>();
        int[] bookmarks = {212, 15, 87, 340, 56, 129, 9, 275};

        for (int p : bookmarks) {
            pages.add(p);
        }

        Collections.sort(pages);
        System.out.println("Bookmarked pages (sorted) : " + pages);
        System.out.println("-------------------------");

        int[] search = {129, 9, 100};
        for (int p : search) {
            int index = Collections.binarySearch(pages, p);

            if (index >= 0) {
                System.out.println("Page " + p + " is bookmarked, found at index " + index);
            }
            else {
                System.out.println("Page " + p + " is not bookmarked, it would go at index " + (-index - 1));
            }
        }
    }
}
