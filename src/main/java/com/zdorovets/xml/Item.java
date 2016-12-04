package com.zdorovets.xml; 

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * Класс тега "item" в xml-файле
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
	@XmlElement(name = "condition")
    private Condition condition;
    
    @Override
	public String toString() {
		return condition.toString();
	}
}