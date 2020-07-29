package com.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(theCoach.getDailyFortune());
		context.close();
		

	}

}
