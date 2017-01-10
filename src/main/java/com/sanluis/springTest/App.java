package com.sanluis.springTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanluis.beans.Flight;
import com.sanluis.beans.FlightException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		xmlConfig();
		//annotationConfig();
	}
	
	public static void annotationConfig(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.sanluis.springTest.AppConfig.class);
		Flight flight = (Flight) context.getBean("flightBean");
		context.close();
		try {
			flight.flight();
		} catch (FlightException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void xmlConfig(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/appContext.xml");
		Flight flight = (Flight) context.getBean("flightBean");
		context.close();
		try {
			flight.flight();
		} catch (FlightException e) {
			System.out.println(e.getMessage());
		}
	}
}
