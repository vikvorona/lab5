package com.yanaguseva.parser;

import com.github.fedy2.weather.data.Channel;

public class YahooParser {
    public String parse(Channel channel) {
        return channel.getDescription() + " " + channel.getItem().getCondition().getTemp() + " deg.";
    }
}
