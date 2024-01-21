package org.archis.BehavioralPattern.MementoDesignPattern;

/*
 * This Originator class holds the methods to create and restore memento
 */
public class Originator {

    int height;
    int weight;

    public Originator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Memento createMemento() {
        return new Memento(this.height, this.weight);
    }

    public void restoreMemento(Memento restoredMemento) {
        this.height = restoredMemento.height;
        this.weight = restoredMemento.weight;
    }
}
