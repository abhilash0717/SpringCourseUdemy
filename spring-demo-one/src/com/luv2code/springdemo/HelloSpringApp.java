package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		//Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("newCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new methods for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the application context
		context.close();
	}
}
