package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Класс тега "astronomy" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Astronomy {
	@XmlAttribute(name="sunrise")
    private String sunrise;
    @XmlAttribute(name="sunset")
    private String sunset;
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Astronomy [sunrise=");
		builder.append(sunrise);
		builder.append(", sunset=");
		builder.append(sunset);
		builder.append("]");
		return builder.toString();
	}
}
