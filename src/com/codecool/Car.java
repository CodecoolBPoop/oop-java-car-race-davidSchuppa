package com.codecool;


public class Car extends Vehicle {

    public String[] carNames = {"Eminence", "Astral", "Falcon", "Bullet", "Resolve", "Expedition", "Zeal", "Capital",
            "Ferocity", "Bliss","Scout", "Crux", "Daydream", "Virtue", "Purity", "Viper", "Viper", "Prodigy", "Venom", "Killer"};

    public Car() {
        this.setCarName();
        this.setNormalSpeed();
        distanceTraveled = 0;
//        System.out.println("A car has been created named: " + name);
//        System.out.println("It has a speed of: " + normalSpeed);
    }

    public void setCarName(){
        int[] nameIndexes = new Util().getRandomIndexes(carNames.length);
        name = carNames[nameIndexes[0]] + " " + carNames[nameIndexes[1]];
    }


    public void setNormalSpeed(){
//        if()
        int randomSpeed = new Util().getCarRandomSpeed();
        normalSpeed = 80 + randomSpeed;
    }

    public void moveForAnHour(Boolean isThereABrokenTruck) {
        if(isThereABrokenTruck){
            distanceTraveled += 75;
            System.out.println("car speed now 75");
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
