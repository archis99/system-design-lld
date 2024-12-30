package org.archis.StructuralPattern.DecoratorDesignPattern;

public class Driver {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
