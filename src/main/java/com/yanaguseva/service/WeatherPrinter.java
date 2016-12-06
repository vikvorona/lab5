package com.yanaguseva.service;

import com.yanaguseva.parser.YahooParser;

public class WeatherPrinter {
    private WeatherService weatherService;
    private YahooParser yahooParser;

    public WeatherPrinter(WeatherService weatherService, YahooParser yahooParser) {
        this.weatherService = weatherService;
        this.yahooParser = yahooParser;
    }

    public void printWeather() {
        System.out.println(yahooParser.parse(weatherService.getWeather()));
    }
}
