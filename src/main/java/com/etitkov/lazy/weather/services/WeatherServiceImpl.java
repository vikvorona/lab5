package com.etitkov.lazy.weather.services;


import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class WeatherServiceImpl implements WeatherService {
    public Channel findChannel() {
        Channel channel = null;
        try {
            YahooWeatherService service = new YahooWeatherService();
            channel = service.getForecast("2123260", DegreeUnit.CELSIUS);
        } catch (JAXBException | IOException e) {
            System.out.println("Oh my god something wrong has happened" + e);
        }
        return channel;
    }
}