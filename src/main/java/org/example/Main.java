package org.example;


public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Kekw", "LuL", "978-0743273565"),
                new Book("xD", "RandomLoL", "978-0061120084"),
                new Book("YEP", "Peter Lenis", "978-0451524935"),
        };

        Library library = new Library();
        library.setBooks(books);

        System.out.println(library);

    }
}