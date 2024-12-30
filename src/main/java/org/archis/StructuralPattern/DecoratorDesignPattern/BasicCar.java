package org.archis.StructuralPattern.DecoratorDesignPattern;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
