package org.archis.SOLIDPrinciples.DependancyInversion;

public class Macbook {

    // Not following DIP
    /* private WiredKeyboard wiredKeyboard;

    public Macbook(WiredKeyboard wiredKeyboard) {
        this.wiredKeyboard = wiredKeyboard;
    } */

    // Following DIP
    private Keyboard keyboard;

    public Macbook(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public static void main(String[] args) {
        Macbook macbook = new Macbook(new WiredKeyboard());
    }

}
