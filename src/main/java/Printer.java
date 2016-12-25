/**
 * Created by Ворона on 26.12.2016.
 */
public class Printer {
    private Service service;
    private Parser parser;

    public Printer(Service service, Parser parser) {
        this.service = service;
        this.parser = parser;
    }

    public void print() {
        System.out.println(parser.parse(service.getWeather()));
    }
}
