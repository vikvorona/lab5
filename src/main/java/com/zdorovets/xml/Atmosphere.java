package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
/**
 * Класс тега "atmosphere" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Atmosphere {
	@XmlAttribute(name="humidity")
	private Integer humidity;
	@XmlAttribute(name="pressure")
	private Float pressure;
	@XmlAttribute(name="rising")
	private Integer rising;
	@XmlAttribute(name="visibility")
	private Float visibility;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atmosphere [humidity=");
		builder.append(humidity);
		builder.append(", pressure=");
		builder.append(pressure);
		builder.append(", rising=");
		builder.append(rising);
		builder.append(", visibility=");
		builder.append(visibility);
		builder.append("]");
		return builder.toString();
	}
}
