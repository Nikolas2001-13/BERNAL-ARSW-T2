package edu.eci.arsw.openweather.services.impl;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.openweather.models.CityInformation;
import edu.eci.arsw.openweather.models.Coord;
import edu.eci.arsw.openweather.models.Main;
import edu.eci.arsw.openweather.models.Sys;
import edu.eci.arsw.openweather.models.Weather;
import edu.eci.arsw.openweather.models.Wind;
import edu.eci.arsw.openweather.services.CityWeatherServices;
import edu.eci.arsw.openweather.services.HttpServices;

@Service
public class CityWeatherServicesIMPL implements CityWeatherServices{

    @Autowired
    HttpServices httpServices;

    public CityWeatherServicesIMPL(){}

    /**
     * Obtiene cada informacion de la ciudad dada por la api en forma de json y la asigna
     * @param city tipo String
     * @return CityInformation
     * @throws IOException
     * @throws UnirestException
     */
    @Override
    public CityInformation getWeatherByCity(String city) throws IOException, UnirestException {
        JSONObject cityInformation = httpServices.getWeatherByCity(city);
        ObjectMapper mapper = new ObjectMapper();

        JSONObject jsonObject = cityInformation.getJSONObject("coord");
        Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);

        jsonObject = cityInformation.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);

        String base = cityInformation.getString("base");

        jsonObject = cityInformation.getJSONObject("main");
        Main main = mapper.readValue(jsonObject.toString(), Main.class);

        int visibility = cityInformation.getInt("visibility");

        jsonObject = cityInformation.getJSONObject("wind");
        Wind wind = mapper.readValue(jsonObject.toString(), Wind.class);

        jsonObject = cityInformation.getJSONObject("clouds");
        int clouds = cityInformation.getJSONObject("clouds").getInt("all");

        Long dt = cityInformation.getLong("dt");

        jsonObject = cityInformation.getJSONObject("sys");
        Sys sys = mapper.readValue(jsonObject.toString(), Sys.class);

        int timezone = cityInformation.getInt("timezone");

        int id = cityInformation.getInt("id");

        String name = cityInformation.getString("name");

        return new CityInformation(coord, weather, base, main, visibility, wind, clouds, dt, sys, timezone, id, name);
    }
    
}
