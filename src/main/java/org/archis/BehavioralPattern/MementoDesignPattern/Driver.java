package org.archis.BehavioralPattern.MementoDesignPattern;

public class Driver {

    public static void main(String[] args) {

        Originator originator = new Originator(5, 10);
        Memento snapshot1 = originator.createMemento();

        CareTaker careTaker = new CareTaker();
        // Taking a snapshot
        careTaker.addToHistory(snapshot1);

        originator.setHeight(7);
        originator.setWeight(12);

        // Again taking a snapshot
        Memento snapshot2 = originator.createMemento();
        careTaker.addToHistory(snapshot2);

        originator.setHeight(9);
        originator.setWeight(12);

        Memento restoredObj = careTaker.undo();
        // Restoring to previous memento values
        originator.restoreMemento(restoredObj);

        System.out.println("Height is: " + originator.height + " and weight is: " + originator.weight);

    }
}
