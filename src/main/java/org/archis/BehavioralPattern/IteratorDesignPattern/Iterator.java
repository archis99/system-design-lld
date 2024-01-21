package org.archis.BehavioralPattern.IteratorDesignPattern;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}