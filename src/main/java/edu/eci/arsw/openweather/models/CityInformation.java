package edu.eci.arsw.openweather.models;

public class CityInformation {
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private int clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;

    /**
     * Constructor
     * @param coord
     * @param weather
     * @param base
     * @param main
     * @param visibility
     * @param wind
     * @param clouds
     * @param dt
     * @param sys
     * @param timezone
     * @param id
     * @param name
     */
    public CityInformation(Coord coord, Weather weather, String base, Main main, int visibility, Wind wind, int clouds, long dt, Sys sys, int timezone, int id, String name) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
    }

    public CityInformation(){}

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getClouds() {
        return clouds;
    }

    public void setCloud(int clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
