package com.codecool;

public class Vehicle {
    public String name;
    public   int normalSpeed;
    public int distanceTraveled;

    public Vehicle() {
    }

    public void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }
}
