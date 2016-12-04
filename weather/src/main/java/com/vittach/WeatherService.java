package com.vittach;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public interface WeatherService {
    String getMessage() throws JAXBException, IOException;
}