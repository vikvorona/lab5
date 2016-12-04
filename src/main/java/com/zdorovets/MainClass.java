package com.zdorovets;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Главная точка входа в приложение
 * @author Evgeny Zdorovets
 * created on 29/11/16 
 */
public class MainClass { 
    public static void main(String args[]) {    	
    	@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
    	WeatherPrinter weatherPrinter = ctx.getBean(WeatherPrinter.class);
    	weatherPrinter.print();
    }
}