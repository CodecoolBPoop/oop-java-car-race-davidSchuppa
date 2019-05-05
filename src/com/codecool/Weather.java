package com.codecool;

public class Weather {
    public static Boolean isRaining;

    public static void setIsRaining() {
        int chance = new Util().getChancePercent();
        if(chance < 30){
            Weather.isRaining = true;
        } else {
            Weather.isRaining = false;
        }
    }
}
