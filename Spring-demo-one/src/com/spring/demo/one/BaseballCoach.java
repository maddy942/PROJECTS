package com.spring.demo.one;

public class BaseballCoach implements Coach
{
	@Override
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
// define dependancy injection 
private FortuneService fortuneservice;
//define constructor for constructor injection
public BaseballCoach(FortuneService theFortuneService) 
{fortuneservice=theFortuneService;
}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getfortune();
		
	}
}
