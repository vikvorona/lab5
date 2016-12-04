package com.zdorovets;

public class WeatherFormatter {
	public String format(WeatherParser weatherParser){
		return weatherParser.getQuery().getResults().getChannel().toString();
	}
}
