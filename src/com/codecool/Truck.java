package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        brakeDown();
        this.setTruckName();
        this.setNormalSpeed();
        this.distanceTraveled = 0;
    }


    public void setTruckName(){
        int truckName = new Util().getRandomTruckNumber();
        name = Integer.toString(truckName);
    }

    private void setNormalSpeed() {
        this.normalSpeed = 100;
    }

    @Override
    public void moveForAnHour() {
        if(this.isBrokeDown){
            System.out.println(this.name + " is broken down, not moving for " + breakdownTurnsLeft + "turns");
            breakdownTurnsLeft -= 1;
            if(this.getBreakdownTurnsLeft() == 0){
                this.isBrokeDown = false;
            }
        } else {
            super.moveForAnHour();
        }
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
