package com.codecool;

public class Vehicle {
    public String name;
    public   int normalSpeed;
    public int distanceTraveled;
    public boolean isBrokeDown = false;
    public int breakdownTurnsLeft;

    public Vehicle() {
    }
    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int turn) {
        breakdownTurnsLeft += turn;
    }

    public void setDistanceTraveled(int speed) {
        this.distanceTraveled += speed;
    }

    /** checks if the instance is broken down*/
    public void brakeDown(){
        int chance = new Util().getChancePercent();
        if (chance <= 5){
            isBrokeDown = true;
            this.setBreakdownTurnsLeft(2);
        }
    }


    public boolean isBrokeDown() {
        System.out.println(this.getBreakdownTurnsLeft());
        System.out.println(this.getBreakdownTurnsLeft() >= 1);
        isBrokeDown = this.getBreakdownTurnsLeft() >= 1;
        return isBrokeDown;
    }

    public void setNormalSpeed(boolean isBrokeDown) {
        if(this.isBrokeDown) {
            System.out.println("!!!!!!!!Truck " + name + " is broken down!!!!!!!!!");
            this.normalSpeed = 0;
        }
        this.normalSpeed = 100;
    }

    public void moveForAnHour(boolean isThereABrokenTruck){
        if (this.isBrokeDown()){
            this.setDistanceTraveled(this.normalSpeed);
        }
        else if(isThereABrokenTruck && this.getClass() == Car.class){
            System.out.println("Reduced speed for: " + name);
            this.setNormalSpeed(this.isBrokeDown);
        } else {
            this.distanceTraveled += this.normalSpeed;
        }
    }

}

