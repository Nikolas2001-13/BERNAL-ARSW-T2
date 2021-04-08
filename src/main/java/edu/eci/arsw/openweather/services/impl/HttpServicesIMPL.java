package edu.eci.arsw.openweather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.eci.arsw.openweather.services.HttpServices;

@Service
public class HttpServicesIMPL implements HttpServices{
    public HttpServicesIMPL(){}

    /**
     * Obtiene la informacion del clima brindada por la api OpenWeather asignandole a la url la ciudad y la llave asignada para cada usuario
     * @param city tipo String
     * @return JSONObject 
     */
    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException {
        HttpResponse <String> url = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+ city +"&appid=6ccb82b715395f856b91e04e570009d2").asString();
        return new JSONObject(url.getBody());
    }

}
