package com.chernyshov777.weatherprinter;

import com.chernyshov777.weatherfinder.WeatherFinder;
import com.chernyshov777.weatherpresenter.WeatherPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Chernyshov Daniil
 */
@Component
public class WeatherPrinter {
    private WeatherFinder weatherFinder;
    private WeatherPresenter weatherPresenter;

    public void printWeather() {
        String currentWeather = weatherPresenter.presentWeather(weatherFinder.findChannel());
        System.out.println(currentWeather);
    }

    @Autowired
    public void setWeatherFinder(WeatherFinder weatherFinder) {
        this.weatherFinder = weatherFinder;
    }

    @Autowired
    public void setWeatherPresenter(WeatherPresenter weatherPresenter) {
        this.weatherPresenter = weatherPresenter;
    }
}
