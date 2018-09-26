package com.codecool;

public class Vehicle {
    public String name;
    public   int normalSpeed;
    public int distanceTraveled;
    public boolean isBrokeDown = false;
    public int breakdownTurnsLeft = 0;

    public Vehicle() {
    }

    public void isBrokenDown(){
        int chance = new Util().getChancePercent();
        if (chance <= 5)
            isBrokeDown = true;
    }

    public void moveForAnHour(){
        if (this.getClass() == Truck.class && isBrokeDown){
            System.out.println("It's a truck" + name);
        }
        distanceTraveled += normalSpeed;
    }
}
