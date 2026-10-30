package com.vitthal.library.common;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book find(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public boolean issue(String title) {
        Book b = find(title);
        if (b == null || b.isIssued()) {
            return false;
        }
        b.setIssued(true);
        return true;
    }

    public boolean giveBack(String title) {
        Book b = find(title);
        if (b == null || !b.isIssued()) {
            return false;
        }
        b.setIssued(false);
        return true;
    }

    public List<Book> getBooks() {
        return books;
    }
}
