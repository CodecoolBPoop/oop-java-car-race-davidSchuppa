package com.codecool;

public class Truck extends Vehicle {
//    public boolean isBrokeDown = false;
//    public int breakdownTurnsLeft;

    public Truck() {
        brakeDown();
        this.name = setTruckName();
        this.setNormalSpeed(isBrokeDown);
        this.distanceTraveled = 0;
    }

    public String setTruckName(){
        int truckName = new Util().getRandomTruckNumber();
        return Integer.toString(truckName);
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
