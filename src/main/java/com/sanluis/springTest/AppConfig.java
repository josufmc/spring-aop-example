package com.sanluis.springTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sanluis.beans.FlightService;
import com.sanluis.beans.Flight;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig {

	@Bean(name = "flightBean")
	public Flight flightBean() {
		return new Flight();
	}
	
	@Bean(name = "flightServiceBean")
	public FlightService flightServiceBean() {
		return new FlightService();
	}

}
