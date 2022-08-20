package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call the methods on the beans
		System.out.println(theCoach.getDailyWorkput());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
