package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private boolean isThereABrokenTruck = false;
    private static List<Vehicle> vehicles = new ArrayList();
    private static List<Truck> trucks = new ArrayList();
    private static Car[] cars = new Car[10];

    public boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }

    /**initializes the vehicles needed for the race*/
    private static void createVehicles(){
        for(int i=0; i < 3; i++){
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }


    public Race(List<Vehicle> vehicles){
        createVehicles();
        for(int i = 0; i < 3; i++){
            for(Vehicle vehicle: vehicles){
                if(vehicle.isBrokeDown){
                    isThereABrokenTruck = true;
                    vehicle.setNormalSpeed(vehicle.isBrokeDown());
                    break;
                }
            }
            for(Vehicle vehicle: vehicles){
                vehicle.moveForAnHour(isThereABrokenTruck());
                System.out.println(vehicle.name + " traveled " + vehicle.distanceTraveled + " km-s");
            }
            System.out.println("********************");
            isThereABrokenTruck = false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Race race = new Race(vehicles);
    }
}
