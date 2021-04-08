package edu.eci.arsw.openweather.models;

import java.io.Serializable;

public class Wind implements Serializable{
    private double speed;
    private int deg;

    public Wind(double speed, int deg){
        this.speed = speed;
        this.deg = deg;
    }

    public Wind(){}

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
