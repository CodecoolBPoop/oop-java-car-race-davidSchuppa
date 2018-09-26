package com.codecool;

import java.util.Random;

public class Util {

    Random random = new Random();

    public int getCarRandomSpeed(){
        int speed = random.nextInt(31);
        return speed;
    }

    public int[] getRandomIndexes(int bound) {
        int[] randomIndexes = new int[2];
        randomIndexes[0] = random.nextInt(bound);
        randomIndexes[1] = random.nextInt(bound);
        return randomIndexes;
    }

    public int getRandomTruckNumber(){
        return random.nextInt(1001);
    }

    public int getChancePercent(){
        return random.nextInt(101);
    }

    public int getMotorSlowDown(){
        return random.nextInt(46);
    }
}
