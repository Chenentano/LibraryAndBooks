package org.example;


public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Syntax ist sehr kurz", "TrustMe", "978-0743273565"),
                new Book("Sport macht gesund", "Axel Schweiß", "978-0061120084"),
                new Book("PLS dont replace me Devin", "Elon Musk", "978-0451524935"),
        };

        Library library = new Library();
        library.setBooks(books);

        System.out.println(library);

    }
}