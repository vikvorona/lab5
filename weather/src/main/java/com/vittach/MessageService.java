package com.vittach;

import com.github.fedy2.weather.data.Channel;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface MessageService {
    List<Channel> getMessage() throws JAXBException, IOException;
}