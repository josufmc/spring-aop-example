package com.sanluis.beans;

import org.springframework.stereotype.Component;

@Component
public class Flight {
	
	public void flight() throws FlightException{
		System.out.println("We are fliying...");
		throw new FlightException("Engine is broken! :-OOO");
	}
	
}
