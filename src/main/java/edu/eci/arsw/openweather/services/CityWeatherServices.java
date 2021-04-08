package edu.eci.arsw.openweather.services;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.openweather.models.CityInformation;

public interface CityWeatherServices {
    /**
     * Obtiene la informacion de la ciudad
     * @param city tipo String
     * @return
     * @throws IOException
     * @throws UnirestException
     */
    CityInformation getWeatherByCity(String city) throws IOException, UnirestException;
}
