package com.vitthal.library.app;

import com.vitthal.library.common.Book;
import com.vitthal.library.common.Library;

public class LibraryApp {
    static void show(Library lib) {
        System.out.println("-------------------------");
        for (Book b : lib.getBooks()) {
            System.out.println(b);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("the alchemist", "Paulo Coelho"));
        lib.addBook(new Book("wings   of fire", "A.P.J. Abdul Kalam"));
        lib.addBook(new Book("atomic habits", "James Clear"));

        System.out.println("College library (classes come from the library-common module)");
        show(lib);

        System.out.println("Issue Atomic Habits   : " + lib.issue("Atomic Habits"));
        System.out.println("Issue Atomic Habits   : " + lib.issue("Atomic Habits"));
        System.out.println("Issue The Alchemist   : " + lib.issue("The Alchemist"));
        show(lib);

        System.out.println("Return Atomic Habits  : " + lib.giveBack("Atomic Habits"));
        System.out.println("Return Harry Potter   : " + lib.giveBack("Harry Potter"));
        show(lib);
    }
}
