package org.archis.SOLIDPrinciples.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new MotorCycle());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {
            System.out.println("No of wheels: " + vehicle.getNoOfWheels());
            System.out.println("Has engine: " + vehicle.hasEngine().toString());
        }
    }

}
