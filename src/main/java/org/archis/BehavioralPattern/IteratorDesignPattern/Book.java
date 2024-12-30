package org.archis.BehavioralPattern.IteratorDesignPattern;

public class Book {

    private String name;
    private int totalPage;

    public Book(String name, int totalPage) {
        this.name = name;
        this.totalPage = totalPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
