package com.zdorovets.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Класс тега "condition" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Condition {
	@XmlAttribute(name = "code")
    private Integer code;
	@XmlAttribute(name = "date")
    private String date;
	@XmlAttribute(name = "temp")
    private Integer temp;
	@XmlAttribute(name = "text")
    private String text;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Condition [code=");
		builder.append(code);
		builder.append(", date=");
		builder.append(date);
		builder.append(", temp=");
		builder.append(temp);
		builder.append(", text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}
}
