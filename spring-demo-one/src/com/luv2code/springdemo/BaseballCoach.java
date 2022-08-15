package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	//constructor injection method for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on the batting cage";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}
