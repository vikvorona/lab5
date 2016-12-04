package com.vittach;

import java.util.List;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

/**
 * Created by VITTACH on 19.11.2016.
 */
@Configuration
@ComponentScan
public class WorldWeather {
    static List<Channel> channel;

    @Bean
    MessageService mockMessageService() {
        return () -> channel;
    }

    /**
     * @param args
     * @throws JAXBException
     * @throws IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(WorldWeather.class);
        MessagePrinter messageprinter = context.getBean(MessagePrinter.class);

        YahooWeatherService service = new YahooWeatherService();
        channel = service.getForecastForLocation("Piter", DegreeUnit.CELSIUS).first(3);

        messageprinter.printMessage();
    }
}
