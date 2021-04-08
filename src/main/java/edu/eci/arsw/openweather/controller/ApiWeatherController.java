package edu.eci.arsw.openweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.eci.arsw.openweather.services.CityWeatherServices;

public class ApiWeatherController {
    
    @Autowired
    CityWeatherServices cityWeatherServices;

    /**
     * Mapeo de la ciudad
     * @param city tipo String
     * @return ResponseEntity<> 
     */
    @RequestMapping(value = "weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String city) {
        try {
            return new ResponseEntity<>(cityWeatherServices.getWeatherByCity(city), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar ciudad", HttpStatus.BAD_REQUEST);
        }
    }

}
