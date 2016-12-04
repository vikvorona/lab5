package com.chernyshov777.utils;

import com.chernyshov777.weatherfinder.WeatherFinder;
import com.chernyshov777.weatherfinder.WeatherFinderImpl;
import com.chernyshov777.weatherpresenter.WeatherPresenter;
import com.chernyshov777.weatherpresenter.WeatherPresenterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chernyshov Daniil
 */
@Configuration
@ComponentScan(value = {"com.chernyshov777.weatherprinter", "com.chernyshov777.weatherfinder", "com.chernyshov777.weatherprinter"})
public class DIConfiguration {

    @Bean
    public WeatherFinder getWeatherFinder() {
        return new WeatherFinderImpl();
    }

    @Bean
    public WeatherPresenter getWeatherPresenter() {
        return new WeatherPresenterImpl();
    }
}
