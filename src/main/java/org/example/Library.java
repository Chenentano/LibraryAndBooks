package org.example;
import java.util.Arrays;

public class Library {

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" + "\n" +
                "books=" +  "\n" + Arrays.toString(books) +
                '}';
    }

    private Book[] books;

}
