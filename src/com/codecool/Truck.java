package com.codecool;

public class Truck extends Vehicle {
    private boolean isBrokeDown = false;
    private int breakdownTurnsLeft = 0;

    public Truck() {
        name = setTruckName();
        normalSpeed = setNormalSpeed(isBrokeDown);
        distanceTraveled = 0;
    }

    public String setTruckName(){
        int truckName = new Util().getRandomTruckNumber();
        return Integer.toString(truckName);
    }

    public int setNormalSpeed(boolean isBrokeDown) {
        if(isBrokeDown) {
            breakdownTurnsLeft = 2;
            return 0;
        }
        return 100;
    }
}
