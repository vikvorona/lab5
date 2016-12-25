import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Ворона on 26.12.2016.
 */
public class Service {
    public Channel getWeather() {
        try {
            YahooWeatherService service = new YahooWeatherService();
            return service.getForecastForLocation("Saint-Petersburg", DegreeUnit.CELSIUS).first(1).get(0);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
