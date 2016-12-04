package com.vittach;

import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 * Created by VITTACH on 04.12.2016.
 */
public class WeatherRequest {
    Channel request(String city) throws JAXBException, IOException {
        YahooWeatherService service = new YahooWeatherService();

        return service.getForecastForLocation(city, DegreeUnit.CELSIUS).first(3).get(0);
    }
}
