package org.archis.BehavioralPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(List.of(
                new Book("The Da Vinci Code", 500),
                new Book("Game of Thrones", 1500),
                new Book("Harry Potter", 700)
        ));

        Library library = new Library(bookList);

        Iterator iterator = library.getIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book name: " + book.getName() + " and page number is: " + book.getTotalPage());
        }
    }
}
