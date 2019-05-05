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

    public void setDistanceTraveled() {
        this.distanceTraveled += normalSpeed;
    }

    public void moveForAnHour(){
        System.out.println(this.name + " moving " + this.normalSpeed + " km/h");
        this.setDistanceTraveled();
    }

    /** brakes down vehicle if it's unlucky*/
    public void brakeDown(){
        int chance = new Util().getChancePercent();
        if (chance <= 5){
            isBrokeDown = true;
            this.setBreakdownTurnsLeft(2);
        }
    }

    public void isNotBrokeDown() {
        if(!this.isBrokeDown)
            this.brakeDown();
    }


}

