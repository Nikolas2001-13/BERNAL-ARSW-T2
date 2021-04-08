package edu.eci.arsw.openweather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

public interface HttpServices {

    /**
     * Obtiene el clima de la ciudad correspondiente
     * @param city de tipo String
     * @return
     * @throws UnirestException
     */
    JSONObject getWeatherByCity(String city) throws UnirestException;

}
