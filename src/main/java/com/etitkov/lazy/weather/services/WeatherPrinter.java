package com.etitkov.lazy.weather.services;


import com.etitkov.lazy.weather.services.WeatherService;
import com.etitkov.lazy.weather.utils.WeatherFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherPrinter {
    @Autowired
    private WeatherService weatherFinder;

    public void printWeather() {
        System.out.println(WeatherFormatter.format(weatherFinder.findChannel()));
    }
}