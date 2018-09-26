package com.codecool;


public class Car extends Vehicle {

    public String[] carNames = {"Eminence", "Astral", "Falcon", "Bullet", "Resolve", "Expedition", "Zeal", "Capital",
            "Ferocity", "Bliss","Scout", "Crux", "Daydream", "Virtue", "Purity", "Viper", "Viper", "Prodigy", "Venom", "Killer"};

    public Car() {
        name = setCarName();
        normalSpeed = setNormalSpeed();
        distanceTraveled = 0;
//        System.out.println("A car has been created named: " + name);
//        System.out.println("It has a speed of: " + normalSpeed);
    }

    public String setCarName(){
        int[] nameIndexes = new Util().getRandomIndexes(carNames.length);
        return carNames[nameIndexes[0]] + " " + carNames[nameIndexes[1]];
    }

    public int setNormalSpeed(){
        int randomSpeed = new Util().getCarRandomSpeed();
        return 80 + randomSpeed;
    }

    public void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }

}
