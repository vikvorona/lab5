package com.vittach;

import java.io.IOException;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class WeatherPrinter {
    @Autowired
    private WeatherService service;

    public void printMessage() throws JAXBException, IOException {
        System.out.println(service.getMessage());
    }
}