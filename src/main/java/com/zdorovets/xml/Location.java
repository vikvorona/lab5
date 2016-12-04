package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Класс тега "location" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
	@XmlAttribute(name="city")
    private String city;
    @XmlAttribute(name="country")
    private String country;
    @XmlAttribute(name="region")
    private String region;
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [city=");
		builder.append(city);
		builder.append(", region=");
		builder.append(region);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
}
