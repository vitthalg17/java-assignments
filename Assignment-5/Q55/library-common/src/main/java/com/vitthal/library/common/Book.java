package com.vitthal.library.common;

import org.apache.commons.lang3.StringUtils;

public class Book {
    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author) {
        this.title = StringUtils.capitalize(StringUtils.normalizeSpace(title));
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return StringUtils.rightPad(title, 25) + StringUtils.rightPad(author, 22) + (issued ? "Issued" : "Available");
    }
}
