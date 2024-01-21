package org.archis.BehavioralPattern.IteratorDesignPattern;

import java.util.List;

public class Library {

    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator getIterator() {
        return new BookIterator(this.bookList);
    }
}
