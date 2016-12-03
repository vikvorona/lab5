package com.etitkov.lazy.weather;

import com.etitkov.lazy.weather.services.WeatherServiceImpl;
import com.etitkov.lazy.weather.services.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@org.springframework.context.annotation.Configuration
@ComponentScan(value = {"com.etitkov.lazy.weather.services","com.etitkov.lazy.weather"})
public class Configuration {
    @Bean
    public WeatherService getWeatherFinder() {
        return new WeatherServiceImpl();
    }
}