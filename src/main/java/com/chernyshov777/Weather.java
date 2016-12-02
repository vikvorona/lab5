package com.chernyshov777;

import com.chernyshov777.utils.DIConfiguration;
import com.chernyshov777.weatherprinter.WeatherPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Chernyshov Daniil
 */
public class Weather {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
        WeatherPrinter weatherPrinter = ctx.getBean(WeatherPrinter.class);
        weatherPrinter.printWeather();
    }
}
