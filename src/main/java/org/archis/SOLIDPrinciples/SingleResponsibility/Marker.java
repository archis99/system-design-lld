package org.archis.SOLIDPrinciples.SingleResponsibility;

public class Marker {

    private String color;
    private String name;
    private int price;

    public Marker(String color, String name, int price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
