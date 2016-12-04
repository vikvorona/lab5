package com.vittach;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import javax.xml.bind.JAXBException;

@Component
public class MessagePrinter {
    @Autowired
    private MessageService service;

    public void printMessage() throws JAXBException, IOException {
        System.out.println(this.service.getMessage());
    }
}