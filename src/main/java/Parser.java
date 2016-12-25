import com.github.fedy2.weather.data.Channel;

/**
 * Created by Ворона on 26.12.2016.
 */
public class Parser {
    public String parse(Channel channel) {
        return "Weather in " + channel.getLocation().getCity() + " is  " + channel.getItem().getCondition().getTemp() + " degree(s)" /*+ channel.getWind()*/;
    }
}
