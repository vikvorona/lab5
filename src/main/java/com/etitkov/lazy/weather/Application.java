package com.etitkov.lazy.weather;

import com.etitkov.lazy.weather.services.WeatherPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
        WeatherPrinter weatherPrinter = ctx.getBean(WeatherPrinter.class);
        weatherPrinter.printWeather();
    }
}