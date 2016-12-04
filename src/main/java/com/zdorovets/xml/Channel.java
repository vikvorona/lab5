package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * Класс тега "channel" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Channel {  
	@XmlElement(name = "units")
    private Units units;
	@XmlElement(name = "description", type = String.class)
    private String description;
	@XmlElement(name = "location")
    private Location location;
	@XmlElement(name = "wind")
    private Wind wind;
	@XmlElement(name = "atmosphere")
    private Atmosphere atmosphere;
	@XmlElement(name = "astronomy")
    private Astronomy astronomy;
    @XmlElement(name="item")
    private Item item;
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("units=");
		builder.append(units);
		builder.append(",\n description=");
		builder.append(description);		
		builder.append(",\n location=");
		builder.append(location);
		builder.append(",\n wind=");
		builder.append(wind);
		builder.append(",\n atmosphere=");
		builder.append(atmosphere);
		builder.append(",\n astronomy=");
		builder.append(astronomy);
		builder.append(",\n condition=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}
}