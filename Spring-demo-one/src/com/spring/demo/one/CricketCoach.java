package com.spring.demo.one;

public class CricketCoach implements Coach {
private FortuneService fortuneservice;
	
	
	public CricketCoach() {
		System.out.println("Cricket Coach: no arg constructor"); 
	}
	
	//generating setter methods
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
		System.out.println("Cricket Coach: inside setter method");
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily practice bowling for 15min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getfortune();
	}

}
