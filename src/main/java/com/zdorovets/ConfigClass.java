package com.zdorovets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Конфигурационный класс
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@Configuration
@ComponentScan(value = {"com.zdorovets"})
public class ConfigClass {
	@Bean(initMethod = "parse")
    public WeatherParser weatherParser() {
        return new WeatherParser();
    }
	@Bean
    public WeatherFormatter weatherFormatter() {
        return new WeatherFormatter();
    }
}
