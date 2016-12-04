package com.zdorovets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Класс печати погоды в консоль
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@Component
public class WeatherPrinter {
	private WeatherParser weatherParser;
	private WeatherFormatter weatherFormatter;
	public void print() {
		System.out.println(weatherFormatter.format(weatherParser));
	}
	
	@Autowired
	public void setWeatherParser(WeatherParser weatherParser) {
		this.weatherParser = weatherParser;
	}
	
	@Autowired
	public void setWeatherFormatter(WeatherFormatter weatherFormatter) {
		this.weatherFormatter = weatherFormatter;
	}
}
