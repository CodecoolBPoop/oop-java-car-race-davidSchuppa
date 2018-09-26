package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        brakeDown();
        this.setTruckName();
        this.setNormalSpeed(isBrokeDown);
        this.distanceTraveled = 0;
    }

    public void setTruckName(){
        int truckName = new Util().getRandomTruckNumber();
        name = Integer.toString(truckName);
    }

    @Override
    public void setNormalSpeed(boolean isBrokeDown) {
        super.setNormalSpeed(isBrokeDown);
    }

    @Override
    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    @Override
    public void setBreakdownTurnsLeft(int turn) {
        breakdownTurnsLeft += turn;
    }

}
