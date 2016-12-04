package com.chernyshov777.weatherpresenter;

import com.github.fedy2.weather.data.Channel;

/**
 * @author Chernyshov Daniil
 */
public class WeatherPresenterImpl implements WeatherPresenter {
    public String presentWeather(Channel channel) {
        return  "Current temperature in " + channel.getLocation().getCity() +
                " is " + channel.getItem().getCondition().getTemp();
    }
}
