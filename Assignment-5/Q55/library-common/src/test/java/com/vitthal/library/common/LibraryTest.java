package com.vitthal.library.common;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    void bookCanBeIssuedOnlyOnce() {
        Library lib = new Library();
        lib.addBook(new Book("the hobbit", "J.R.R. Tolkien"));

        assertTrue(lib.issue("The Hobbit"));
        assertFalse(lib.issue("The Hobbit"));
    }

    @Test
    void returningMakesBookAvailable() {
        Library lib = new Library();
        lib.addBook(new Book("dune", "Frank Herbert"));

        lib.issue("Dune");
        assertTrue(lib.giveBack("Dune"));
        assertFalse(lib.find("Dune").isIssued());
    }

    @Test
    void unknownBookIsNotFound() {
        Library lib = new Library();
        assertNull(lib.find("Missing Book"));
    }
}
