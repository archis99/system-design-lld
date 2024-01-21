package org.archis.BehavioralPattern.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * This CareTaker class holds the methods for managing and restoring memento
 */
public class CareTaker {

    private final List<Memento> history = new ArrayList<>();

    public void addToHistory(Memento memento) {
        history.add(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            int lastIdx = history.size() - 1;
            Memento obj = history.get(lastIdx);
            history.remove(lastIdx);
            return obj;
        }
        return null;
    }
}
