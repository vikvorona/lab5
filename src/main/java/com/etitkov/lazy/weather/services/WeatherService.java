package com.etitkov.lazy.weather.services;


import com.github.fedy2.weather.data.Channel;
import org.springframework.stereotype.Service;


@Service
public interface WeatherService {
    Channel findChannel();
}