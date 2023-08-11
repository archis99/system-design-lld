package org.archis.SOLIDPrinciples.LiskovSubstitution;

public class Bicycle extends Vehicle{

        @Override
        public int getNoOfWheels() {
            return 2;
        }

        @Override
        public Boolean hasEngine() {
            return null;
        }
}
