package com.zdorovets;
import org.springframework.web.client.RestTemplate;

import com.zdorovets.xml.Query;

/**
 * Класс взаимодействия с веб-сервисом для получения xml-файла погоды с помощью RestTemplate
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
public class WeatherParser {
	private static Query query;
    /**
     * обращение к серверу за xml-файлом
     */
    public void parse() {    	    
    	String url = "http://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where u=\"c\" and woeid in (select woeid from geo.places(1) where text=\"Saint Petersburg, Russia\")&format=xml&env=store://datatables.org/alltableswithkeys";        
        query = (new RestTemplate()).getForObject(url, Query.class);
    }
    /**
     * @return полученный ответ от сервера
     */
    public Query getQuery(){
    	return query;
    }
}