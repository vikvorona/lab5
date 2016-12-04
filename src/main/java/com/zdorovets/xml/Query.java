package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * Класс тега "query" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlRootElement(name = "query")
@XmlAccessorType(XmlAccessType.FIELD)
public class Query {
    @XmlElement(name = "results")
    private Results results;
    public Results getResults(){
        return results;
    }
}
