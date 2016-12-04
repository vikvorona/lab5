package com.chernyshov777.weatherpresenter;

import com.github.fedy2.weather.data.Channel;
import org.springframework.stereotype.Component;

/**
 * @author Chernyshov Daniil
 */
@Component
public interface WeatherPresenter {
    String presentWeather(Channel channel);
}
