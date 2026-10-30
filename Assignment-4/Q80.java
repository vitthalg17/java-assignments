import java.util.HashMap;
import java.util.Map;

class BookCatalog {
    private HashMap<String, String> books = new HashMap<>();

    public void addBook(String title, String author) {
        books.put(title, author);
        System.out.println("Added \"" + title + "\" by " + author);
    }

    public void search(String title) {
        String author = books.get(title);
        if (author != null) {
            System.out.println("Found \"" + title + "\", written by " + author);
        }
        else {
            System.out.println("\"" + title + "\" is not in the catalog");
        }
    }

    public void removeBook(String title) {
        if (books.remove(title) != null) {
            System.out.println("Removed \"" + title + "\"");
        }
        else {
            System.out.println("Cannot remove, \"" + title + "\" is not in the catalog");
        }
    }

    public void showAll() {
        System.out.println("-------------------------");
        System.out.println("Library catalog (" + books.size() + " books)");
        for (Map.Entry<String, String> e : books.entrySet()) {
            System.out.println("  " + e.getKey() + " - " + e.getValue());
        }
        System.out.println("-------------------------");
    }
}

public class Q80 {
    public static void main(String[] args) {
        BookCatalog library = new BookCatalog();

        library.addBook("The Alchemist", "Paulo Coelho");
        library.addBook("Wings of Fire", "A.P.J. Abdul Kalam");
        library.addBook("1984", "George Orwell");
        library.addBook("The Hobbit", "J.R.R. Tolkien");
        library.addBook("Godaan", "Munshi Premchand");
        library.showAll();

        library.search("1984");
        library.search("The Hobbit");
        library.search("Dune");

        library.removeBook("Godaan");
        library.removeBook("Dune");
        library.showAll();
    }
}
