package com.vittach;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.github.fedy2.weather.data.Channel;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

/**
 * Created by VITTACH on 19.11.2016.
 */
@Configuration
@ComponentScan
public class WorldWeather {
    static Channel channel;

    @Bean
    WeatherService mockMessageService() {
        return () -> "Current temperature in " + channel.getLocation().getCity() + " = " + channel.getItem().getCondition().getTemp();
    }

    /**
     * @param args
     * @throws JAXBException
     * @throws IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(WorldWeather.class);
        WeatherPrinter messageprinter = context.getBean(WeatherPrinter.class);

        WeatherRequest wr = new WeatherRequest();
        channel = wr.request("Piter");

        messageprinter.printMessage();
    }
}
