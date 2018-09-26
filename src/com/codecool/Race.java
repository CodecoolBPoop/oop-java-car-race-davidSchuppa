package com.codecool;

public class Race {

    private Race race;
    public boolean isThereABrokenTruck = false;
    private static Motorcycle[] motorcycles = new Motorcycle[3];
    private static Truck[] trucks = new Truck[3];
    private static Car[] cars = new Car[3];

    public void isThereABrokenTruck(Truck[] trucks) {
        for(Truck truck: trucks) {
            if (truck.isBrokeDown) {
                isThereABrokenTruck = true;
                break;
            }
        }
    }

    public boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }

    public Race() {
        createVehicles();
        simulateRace();
    }

    private void simulateRace() {
        for(int i = 0; i < 4; i++) {
            isThereABrokenTruck(trucks);
            for (int j = 0; j <= cars.length - 1; j++) {
                System.out.println("Race, is there a broken truck: " + isThereABrokenTruck);
                cars[j].moveForAnHour(isThereABrokenTruck);
                motorcycles[j].moveForAnHour();
                trucks[j].isNotBrokeDown();
                trucks[j].moveForAnHour();
            }
            System.out.println("********************");
            isThereABrokenTruck = false;
        }
    }


    private void createVehicles() {
        for(int i=0; i < 3; i++){
            cars[i] = new Car();
            motorcycles[i] = new Motorcycle();
            trucks[i] = new Truck();
        }
    }

    public static void main(String[] args) {
	// write your code here
        new Race();
    }
}
