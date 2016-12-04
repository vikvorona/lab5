package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Класс тега "wind" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Wind {
	@XmlAttribute(name="chill")
	private Integer chill;
	@XmlAttribute(name="direction")
	private Integer direction;
	@XmlAttribute(name="speed")
	private Float speed;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wind [chill=");
		builder.append(chill);
		builder.append(", direction=");
		builder.append(direction);
		builder.append(", speed=");
		builder.append(speed);
		builder.append("]");
		return builder.toString();
	}
}
