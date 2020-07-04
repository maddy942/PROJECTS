package com.spring.demo.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellospringApp {

	public static void main(String[] args) 
	{
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("/Spring-demo-one/src/applicationContext.xml");
						
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// close the context
				context.close();
			
	}

}