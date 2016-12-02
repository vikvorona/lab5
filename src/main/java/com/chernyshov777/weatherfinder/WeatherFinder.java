package com.chernyshov777.weatherfinder;

import com.github.fedy2.weather.data.Channel;
import org.springframework.stereotype.Component;

/**
 * @author Chernyshov Daniil
 */
@Component
public interface WeatherFinder {
    Channel findChannel();
}
