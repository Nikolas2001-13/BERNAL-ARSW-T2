package edu.eci.arsw.openweather.models;

import java.io.Serializable;

public class Coord implements Serializable{
    private double lon;
    private double lat;

    public Coord(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }

    public Coord(){}
    
    public double getLon(){
        return lon;
    }
    
    public void setLon(double lon){
        this.lon = lon;
    }

    public double getLat(){
        return lat;
    }
    
    public void setLat(double lat){
        this.lon = lat;
    }
}
