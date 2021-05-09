package com.codecool.MyApp;

public class Bicykle {
    private int speed;
    private int cadence;
    private int gear;

    public Bicykle(int initialSpeed, int initialCadence, int initialGear){
        speed = initialSpeed;
        cadence = initialCadence;
        gear = initialGear;
    }

    public int getGear() {
        return gear;
    }
}
