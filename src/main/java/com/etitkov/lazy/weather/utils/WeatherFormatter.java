package com.etitkov.lazy.weather.utils;


import com.github.fedy2.weather.data.Channel;

public class WeatherFormatter {
    public static String format(Channel channel){
        return String.format("Current weather in %s is %s", channel.getLocation().getCity(), channel.getItem().getCondition().getTemp());
    }
}
