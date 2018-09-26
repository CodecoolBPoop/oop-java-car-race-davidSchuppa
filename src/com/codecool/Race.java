package com.codecool;

public class Race {

    private Race race;
    private int numberOfInstances = 3;
    private int numberOfLaps = 4;
    public boolean isThereABrokenTruck = false;
    private static Motorcycle[] motorcycles = new Motorcycle[3];
    private static Truck[] trucks = new Truck[3];
    private static Car[] cars = new Car[3];

    public Race() {
        createVehicles();
        simulateRace();
    }

    public void isThereABrokenTruck(Truck[] trucks) {
        for(Truck truck: trucks)
            if (truck.isBrokeDown) {
                isThereABrokenTruck = true;
                break;
            }
    }


    public boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }

    private void createVehicles() {
        for(int i=0; i < numberOfInstances; i++){
            cars[i] = new Car();
            motorcycles[i] = new Motorcycle();
            trucks[i] = new Truck();
        }
    }

    private void simulateRace() {
        for(int i = 0; i < numberOfLaps; i++) {
            Weather.setIsRaining();
            System.out.println("Is it raining: " + Weather.isRaining);
            isThereABrokenTruck(trucks);
            for (int j = 0; j < numberOfInstances; j++) {
                System.out.println("Race, is there a broken truck: " + isThereABrokenTruck);
                cars[j].moveForAnHour(isThereABrokenTruck);
                motorcycles[j].moveForAnHour(Weather.isRaining);
                trucks[j].isNotBrokeDown();
                trucks[j].moveForAnHour();
            }
            System.out.println("..........................");
            isThereABrokenTruck = false;
        }
        printResults();
    }

    private void printResults() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The final results are: ");
        for(int i = 0; i < numberOfInstances; i++){
            System.out.println(cars[i].name + " is a " + cars[i].getClass().getSimpleName() + ", traveled: " + cars[i].distanceTraveled);
            System.out.println(motorcycles[i].name + " is a " + motorcycles[i].getClass().getSimpleName() + ", traveled: " + motorcycles[i].distanceTraveled);
            System.out.println(trucks[i].name + " is a " + trucks[i].getClass().getSimpleName() + ", traveled: " + trucks[i].distanceTraveled);
        }
    }


    public static void main(String[] args) {
	// write your code here
        new Race();
    }
}
