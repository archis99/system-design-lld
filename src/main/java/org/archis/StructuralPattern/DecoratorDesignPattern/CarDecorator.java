package org.archis.StructuralPattern.DecoratorDesignPattern;

/**
 * This decorator class implements Car and also has-a relationship with Car
 */
public class CarDecorator implements Car {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
