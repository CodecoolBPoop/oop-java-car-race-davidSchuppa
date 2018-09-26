package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private static List<Vehicle> vehicles = new ArrayList();

    private static void createVehicles(){
        for(int i=0; i < 10; i++){
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
        }
    }

    public static void main(String[] args) {
	// write your code here
        createVehicles();
        for(int i = 0; i < 10; i++){
            for(Vehicle car: vehicles){
                car.moveForAnHour();
                System.out.println(car.name + " traveled " + car.distanceTraveled + " km-s");
            }
        }
    }
}
