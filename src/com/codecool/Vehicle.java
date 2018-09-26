package com.codecool;

public class Vehicle {
    public String name;
    public   int normalSpeed;
    public int distanceTraveled;
    public boolean isBrokeDown = false;
    public int breakdownTurnsLeft;

    public Vehicle() {
    }

    /** checks if the instance is broken down*/
    public void brakeDown(){
        int chance = new Util().getChancePercent();
        if (chance <= 5){
            isBrokeDown = true;
            if(this.getBreakdownTurnsLeft() <= 0){
                this.setBreakdownTurnsLeft(2);
            }
        }
    }

    public boolean isBrokeDown() {
        System.out.println(this.getBreakdownTurnsLeft());
        System.out.println(this.getBreakdownTurnsLeft() > 0);
        return this.getBreakdownTurnsLeft() >= 1;
    }



    public void setNormalSpeed(boolean isBrokeDown) {
        if(isBrokeDown) {
            normalSpeed = 0;
        }
        this.normalSpeed = 100;
    }

    public void moveForAnHour(boolean isThereABrokenTruck){
        if (this.isBrokeDown){
            System.out.println("!!!!!!!!Truck " + name + " is broken down!!!!!!!!!");
            this.setBreakdownTurnsLeft(-1);
//            System.out.println(this.getBreakdownTurnsLeft());
            this.setNormalSpeed(this.isBrokeDown);
            this.setDistanceTraveled(normalSpeed);
        }
        else if(isThereABrokenTruck && this.getClass() == Car.class){
            System.out.println("Reduced speed for: " + name);
        } else {
            this.distanceTraveled += this.normalSpeed;
        }
    }

    public int getBreakdownTurnsLeft() {
        return this.breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int turn) {
        this.breakdownTurnsLeft += turn;
    }

    public void setDistanceTraveled(int speed) {
        this.distanceTraveled += speed;
    }
}

