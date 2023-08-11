package org.archis.SOLIDPrinciples.LiskovSubstitution;

public class MotorCycle extends Vehicle {

    @Override
    public int getNoOfWheels() {
        return 2;
    }

}
