package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private boolean isThereABrokenTruck = false;
    private static List<Vehicle> vehicles = new ArrayList();
    private static List<Truck> trucks = new ArrayList();
    private static Car[] cars = new Car[10];


    /**initializes the vehicles needed for the race*/
    private static void createVehicles(){
        for(int i=0; i < 3; i++){
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }

//    private void moveForAnHour(Truck truck){
//        System.out.println("It's a truck");
//        if(truck.isBrokeDown){
//            System.out.println("It's fucked up");
//            truck.handleMovement();
//        }
//        truck.distanceTraveled += truck.normalSpeed;
//    }
//
//    private void moveForAnHour(Car car){
//        if(isThereABrokenTruck){
//            car.normalSpeed = 75;
//            car.distanceTraveled += car.normalSpeed;
//        }
//    }

    public Race(List<Vehicle> vehicles){
        createVehicles();
        for(int i = 0; i < 3; i++){
            for(Vehicle vehicle: vehicles){
                if(vehicle.isBrokeDown()){
                    isThereABrokenTruck = true;
                    break;
                }
            }
            for(Vehicle vehicle: vehicles){
                vehicle.moveForAnHour(isThereABrokenTruck);
                System.out.println(vehicle.name + " traveled " + vehicle.distanceTraveled + " km-s");
            }
            System.out.println("********************");
            isThereABrokenTruck = false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Race race = new Race(vehicles);
//        createVehicles();
//        for(int i = 0; i < 3; i++){
//            for(Vehicle vehicle: vehicles){
//                moveForAnHour(vehicle);
//                System.out.println(vehicle.name + " traveled " + vehicle.distanceTraveled + " km-s");
//            }
//        }
    }
}
