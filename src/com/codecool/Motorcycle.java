package com.codecool;

public class Motorcycle extends Vehicle {
    private static int instanceCounter = 0;

    public Motorcycle() {
        instanceCounter++;
        name = "Motorcycle " + instanceCounter;
        normalSpeed = setNormalSpeed();
        distanceTraveled = 0;
//        System.out.println("Motorcycle's name: " + name);
//        System.out.println("It's normal speed: " + normalSpeed);
    }

    public int setNormalSpeed(){
        return 100;
    }

    public void moveForAnHour(Boolean isRaining) {
        int slowdown = new Util().getMotorSlowDown();
        if(isRaining){
            distanceTraveled += (normalSpeed - slowdown);
            System.out.println(this.name + " moving " + (normalSpeed - slowdown) + " km/h");
        } else {
            super.moveForAnHour();
            //            distanceTraveled += normalSpeed;
        }
    }
}
