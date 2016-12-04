package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Класс тега "units" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Units {
	@XmlAttribute(name="distance")
	private String distance;
	@XmlAttribute(name="pressure")
	private String pressure;
	@XmlAttribute(name="speed")
	private String speed;
	@XmlAttribute(name="temperature")
	private String temperature;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Units [distance=");
		builder.append(distance);
		builder.append(", pressure=");
		builder.append(pressure);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", temperature=");
		builder.append(temperature);
		builder.append("]");
		return builder.toString();
	}
}
