package org.archis.BehavioralPattern.MementoDesignPattern;


/*
* This Memento class holds the attributes which is to be saved
*/
public class Memento {

    int height;
    int weight;

    public Memento(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
