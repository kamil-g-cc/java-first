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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public String print(){
        return "Moj rower porusza sie z predkoscia "+speed+" km/h z kandencja "+cadence+" i na biegu "+gear;
    }

    public String alternativePrint(){
        return String.format("Moj rower porusza sie z predkoscia %d z kandencja %d i na biegu %d", speed, cadence, gear);
    }

}
