package com.sanluis.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FlightService {
	
	@Pointcut(" execution (* *.flight(..))")
	public void pointCutFlight(){	
	}
	
	@Before("pointCutFlight()")
	public void embark(){
		System.out.println("We are embarking...");
	}
	@Before("pointCutFlight()")
	public void takeoff(){
		System.out.println("We are taking off...");
	}
	@After("pointCutFlight()")
	public void land(){
		System.out.println("We are landing...");
	}
	@After("pointCutFlight()")
	public void goodbye(){
		System.out.println("Goodbye!");
	}
	
	@AfterThrowing("pointCutFlight()")
	public void emergencyLanding() {
	System.out.println("Emergency landing!");
	}
	
}
